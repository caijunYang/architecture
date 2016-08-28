package com.yang.architecture.entity;

/**
 * Created by caijun.yang on 2016/8/21.
 */
public class Store {

    private Long uuid;
    private Long goodsUuid;
    private Integer storeNum;

    public Long getUuid() {
        return uuid;
    }

    public void setUuid(Long uuid) {
        this.uuid = uuid;
    }

    public Long getGoodsUuid() {
        return goodsUuid;
    }

    public void setGoodsUuid(Long goodsUuid) {
        this.goodsUuid = goodsUuid;
    }

    public Integer getStoreNum() {
        return storeNum;
    }

    public void setStoreNum(Integer storeNum) {
        this.storeNum = storeNum;
    }

    @Override
    public String toString() {
        return "Store{" +
                "uuid=" + uuid +
                ", goodsUuid=" + goodsUuid +
                ", storeNum=" + storeNum +
                '}';
    }
}
