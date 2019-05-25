package com.zhaojh.base.service.impl;

import com.zhaojh.base.mapper.ILabelMapper;
import com.zhaojh.base.pojo.Label;
import com.zhaojh.base.service.ILabelService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class LabelServiceImpl implements ILabelService {


    @Resource
    private ILabelMapper labelMapper;

    /**
     * 添加标签
     * @param label
     * @return
     */
    public int addLabel(Label label){
        return labelMapper.addLabel(label);
    }

    /**
     * 查询所有的标签
     * @return
     */
    public List<Label> findAllLabel(){
        return labelMapper.findAllLabel();
    }

    /**
     *  根据标签的id 删除标签
     * @param id
     * @return
     */
    public int removeLabelById(String id){
        return labelMapper.removeLabelById(id);
    }


    /**
     * 根据id修改标签
     * @param  label
     * @return
     */
    public int modifyLabelById(Label label){
        return labelMapper.modifyLabelById(label);
    }
}
