package com.zhaojh.labels.pojo;

/**
 * 标签实体
 */
public class Label {
    private String id;
    private String labelName;//标签名
    private String state;//状态
    private Long count;//使用数量
    private String recommend;//是否推荐
    private Long fans;//粉丝数

    public Label() {
    }

    public Label(String id, String labelName, String state, Long count, String recommend, Long fans) {
        this.id = id;
        this.labelName = labelName; //标签名称
        this.state = state; //0：无效 1：有效
        this.count = count; //数量
        this.recommend = recommend; //0：不推荐 1:推荐
        this.fans = fans;   //粉丝数
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLabelName() {
        return labelName;
    }

    public void setLabelName(String labelName) {
        this.labelName = labelName;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public String getRecommend() {
        return recommend;
    }

    public void setRecommend(String recommend) {
        this.recommend = recommend;
    }

    public Long getFans() {
        return fans;
    }

    public void setFans(Long fans) {
        this.fans = fans;
    }

    @Override
    public String toString() {
        return "Label{" +
                "id='" + id + '\'' +
                ", labelName='" + labelName + '\'' +
                ", state='" + state + '\'' +
                ", count=" + count +
                ", recommend='" + recommend + '\'' +
                ", fans=" + fans +
                '}';
    }
}
