package com.zhaojh.user.controller;


import com.zhaojh.common.pojo.Result;
import com.zhaojh.common.pojo.StatusCode;
import com.zhaojh.user.service.IAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value="/admin")
public class AdminController {

    @Autowired
    private IAdminService adminService;

    /**
     * 修改用户状态
     * 禁言用户
     * 拉黑用户
     * @return
     */
    @PutMapping(value="/modifedUser/{id}/{bs}")
    public Result modifedUser(@PathVariable String id, @PathVariable String bs){

        int i=-1;
        switch(bs){
            case "0":
                //解禁用户
                i=adminService.modifedUser(id,"0");
                break;
            case "1":
                //禁言用户
                i=adminService.modifedUser(id,"1");
                break;
                //封杀用户
            case "2":
                i=adminService.modifedUser(id,"2");
                break;
            default:
                    break;

        }
        if (i>0) {
            return new Result(true, StatusCode.OK,"操作成功！");
        }
        return new Result(false, StatusCode.ERROR,"操作失败！");
    }


}
