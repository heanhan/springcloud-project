package com.zhaojh.user.controller;


import com.zhaojh.pojo.Result;
import com.zhaojh.pojo.StatusCode;
import com.zhaojh.user.pojo.User;
import com.zhaojh.user.service.IUserService;
import com.zhaojh.utils.IdWorker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
@RequestMapping(value="/user")
@CrossOrigin
public class UserController {

    private int i=-1;

    @Autowired
    private IdWorker idWorker;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Autowired
    private IUserService userService;


    /**
     * 添加用户
     * @param user  用户信息
     * @return 统一消息返回体
     */
    @PostMapping(value="/addUser")
    public Result addUser(User user){
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
                return new Result(true,StatusCode.OK,"登录成功",userByName);
            }
        }
        return new Result(true,StatusCode.ERROR,"登录失败");
    }




}
