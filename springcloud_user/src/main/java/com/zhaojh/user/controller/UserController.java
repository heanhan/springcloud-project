package com.zhaojh.user.controller;


import com.zhaojh.common.pojo.Result;
import com.zhaojh.common.pojo.StatusCode;
import com.zhaojh.common.utils.IdWorker;
import com.zhaojh.common.utils.JwtUtil;
import com.zhaojh.user.pojo.User;
import com.zhaojh.user.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping(value="/user")
public class UserController {

    private int i=-1;

    @Autowired
    private IdWorker idWorker;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Autowired
    private JwtUtil jwtUtil;

    @Autowired
    private IUserService userService;


    /**
     * 注册用户
     * @param user  用户信息  带有实名制认证
     * @return 统一消息返回体
     */
    @PostMapping(value="/addUser")
    public Result addUser(User user){

        //添加用户之前先查询用户的是否是正常用户，无违纪
        User identitycard = userService.findByIdentitycard(user.getIdentitycard(),"2");
        if(identitycard !=null&&!"".equals(identitycard)){
            return new Result(false,StatusCode.ERROR,"该用户无法注册");
        }

        user.setId(idWorker.nextId()+"");//主键
        // 对密码进行加密  使用security
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        user.setRegdate(new Date());//注册日期
        i = userService.addUser(user);
        if(i>0){

            return new Result(true, StatusCode.OK,"添加成功");
        }
        return new Result(false,StatusCode.ERROR,"添加失败");
    }

    /**
     * 用户登录
     * @param loginname "登录名"
     * @param password   密码
     * @return       同一消息返回体
     */
    @GetMapping(value="/userLogin")
    public Result userLogin(String loginname,String password){
        //现根据用户名查询用户是否存在，然后比对密码
        User userByName = userService.findUserByName(loginname);
        if(userByName!=null&&!"".equals(userByName)){
            boolean matches = bCryptPasswordEncoder.matches(password, userByName.getPassword());
            if(matches)
            {
                //生成token
                String token=jwtUtil.createJWT(userByName.getId(),userByName.getLoginname(),userByName.getRoles());
                Map<String,Object> map=new HashMap<>();
                map.put("token",token);
                map.put("loginname",userByName.getLoginname());

                return new Result(true, StatusCode.OK,"登录成功",map);
            }
        }
        return new Result(true,StatusCode.LOGINERROR,"登录失败");
    }




}
