package com.zhaojh.labels.service;


import com.zhaojh.labels.pojo.Label;

import java.util.List;

public interface ILabelService {

    /**
     * 添加标签
     * @param label 标签
     * @return
     */
    public int addLabel(Label label);

    /**
     * 查询所有的标签
     * @return  list 集合
     */
    public List<Label> findAllLabel();

    /**
     *  根据标签的id 删除标签
     * @param id
     * @return
     */
    public int removeLabelById(String id);


    /**
     * @param  label
     * @return
     */
    int modifyLabelById(Label label);
}
