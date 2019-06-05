package com.zhaojh.labels.mapper;

import com.zhaojh.labels.pojo.Label;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ILabelMapper {

    /**
     * 添加标签
     * @param label
     * @return
     */
    public int addLabel(Label label);

    /**
     * 查询所有的标签
     * @return
     */
    public List<Label> findAllLabel();

    /**
     *  根据标签的id 删除标签
     * @param id
     * @return
     */
    public int removeLabelById(String id);


    /**
     * 根据id修改标签
     * @param  label
     * @return
     */
    public int modifyLabelById(Label label);
}
