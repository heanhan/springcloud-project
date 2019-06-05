package com.zhaojh.labels.pojo;

/**
 * 城市的实体
 */
public class City {

    private String id;//主键id
    private String name;//城市名
    private String isHot;//是否热门

    public City() {
    }

    public City(String id, String name, String isHot) {
        this.id = id;
        this.name = name;
        this.isHot = isHot;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIsHot() {
        return isHot;
    }

    public void setIsHot(String isHot) {
        this.isHot = isHot;
    }

    @Override
    public String toString() {
        return "City{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", isHot='" + isHot + '\'' +
                '}';
    }
}
