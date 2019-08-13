package com.zhaojh.spit.controller;


import com.zhaojh.common.pojo.Result;
import com.zhaojh.common.pojo.StatusCode;
import com.zhaojh.common.utils.IdWorker;
import com.zhaojh.common.utils.JwtUtil;
import com.zhaojh.spit.pojo.Spit;
import com.zhaojh.spit.service.ISpitService;
import io.jsonwebtoken.Claims;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sun.security.provider.ConfigFile;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;


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

    /**
     * 查询所有的吐槽
     * @return  List<Spit>
     */
    @GetMapping(value = "/findAllSpit")
    public Result findAllSpit(){

        List<Spit> allSpit = spitService.findAllSpit();
        if(allSpit.size()>0){
            return new Result(true,StatusCode.OK,"查询成功",allSpit);
        }
        return new Result(false,StatusCode.ERROR,"暂无结果！");

    }

    /**
     *
     * @param map  参数
     * @return 返回分页数据
     */
    @GetMapping(value = "/findAllSpitByPage")
    public Page<Spit> findAllSpitByPage(Map<String,String> map){
        Page<Spit> allSpitByPage = spitService.findAllSpitByPage(map);
        return allSpitByPage;

    }

}
