package com.zhaojh.base.controller;


import com.zhaojh.base.pojo.Label;
import com.zhaojh.base.service.ILabelService;
import com.zhaojh.pojo.Result;
import com.zhaojh.pojo.StatusCode;
import com.zhaojh.utils.IdWorker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin
@RequestMapping(value="/label")
public class LabelControlelr {

    @Autowired
    private IdWorker idWorker;

    @Autowired
    private ILabelService labelService;

    private int intFalg=-1;

    //添加标签
    @PostMapping(value="/addLabel")
    public Result addLabel(Label label)
    {
        label.setId(idWorker.nextId()+"");//使用雪花算法设置主键id
        intFalg=labelService.addLabel(label);
        if(intFalg>0)
        {
            return new Result(true, StatusCode.OK,"添加成功");

        }
        return new Result(false,StatusCode.ERROR,"添加失败！");
    }

    /**
     * 查询所有的标签
     * @return
     */
    @GetMapping(value="/findAllLabel")
    public Result findAllLabel(){

        List<Label> allLabel = labelService.findAllLabel();
        if(allLabel.size()>0&&!allLabel.isEmpty())
        {
            return new Result(true,StatusCode.OK,"查询成功！",allLabel);
        }

        return new Result(false,StatusCode.ERROR,"查询失败");
    }

    /**
     * 根据条件动态查询
     * @return
     */
    public Result findLabelByCondition(Map<String,Object> map){


        return new Result(true,StatusCode.OK,"");
    }

    /**
     * 根据标签id 删除标签
     * @return
     */
    public Result removeLabelByid(String id)
    {

        intFalg=labelService.removeLabelById(id);
        if(intFalg>0)
        {
            return new Result(true, StatusCode.OK,"删除成功");

        }
        return new Result(false,StatusCode.ERROR,"删除失败！");
    }

    /**
     * 修改标签
     * @result
     */

    public Result modifyLabelById(Label label)
    {
        intFalg=labelService.modifyLabelById(label);
        if(intFalg>0)
        {
            return new Result(true, StatusCode.OK,"删除成功");

        }
        return new Result(false,StatusCode.ERROR,"删除失败！");
    }


}
