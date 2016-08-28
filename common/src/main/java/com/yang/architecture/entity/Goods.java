package com.yang.architecture.entity;

/**
 * Created by caijun.yang on 2016/8/21.
 */
public class Goods {
    private Long uuid;
    private String name;
    private String imgPath;
    private String description;

    public Long getUuid() {
        return uuid;
    }

    public void setUuid(Long uuid) {
        this.uuid = uuid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImgPath() {
        return imgPath;
    }

    public void setImgPath(String imgPath) {
        this.imgPath = imgPath;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "uuid=" + uuid +
                ", name='" + name + '\'' +
                ", imgPath='" + imgPath + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
