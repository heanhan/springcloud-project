package com.zhaojh.spit.controller;


import com.zhaojh.common.pojo.Result;
import com.zhaojh.common.pojo.StatusCode;
import com.zhaojh.common.utils.IdWorker;
import com.zhaojh.common.utils.JwtUtil;
import com.zhaojh.spit.pojo.Spit;
import com.zhaojh.spit.service.ISpitService;
import io.jsonwebtoken.Claims;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;


/**
 * 吐槽模块
 */
@RestController
@RequestMapping(value="/spit")
public class SpitController {

    @Autowired
    private IdWorker idWorker;

    @Autowired
    private JwtUtil jwtUtil;

    @Autowired
    private HttpServletRequest request;

    @Autowired
    private ISpitService spitService;

    /**
     * 添加吐槽
     * @param spit 吐槽
      * @return
     */
    @PostMapping(value="/addSpit")
    public Result addSpit(Spit spit){
        String token = (String)request.getAttribute("token");
        Claims claims = jwtUtil.parseJWT(token);//获取用户信息


        spit.set_id(idWorker.nextId()+"");//这只主键
        spit.setUserid((String)claims.get("jti"));
        spit.setNickname((String)claims.get("sub"));
        Spit spit1 = spitService.addSpit(spit);
        if(spit1!=null)
        {
            return new Result(true,StatusCode.OK,"添加成功");
        }

        return new Result(false, StatusCode.ERROR,"添加失败");
    }

}
