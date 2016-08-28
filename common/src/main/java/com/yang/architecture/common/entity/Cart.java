package com.yang.architecture.common.entity;

/**
 * Created by caijung.yang on 2016/8/21.
 */
public class Cart {
    private Long uuid;
    private Long customerUuid;
    private Long goodsUuid;
    private Integer buyNum;

    public Long getUuid() {
        return uuid;
    }

    public void setUuid(Long uuid) {
        this.uuid = uuid;
    }


    public Integer getBuyNum() {
        return buyNum;
    }

    public void setBuyNum(Integer buyNum) {
        this.buyNum = buyNum;
    }

    public Long getCustomerUuid() {
        return customerUuid;
    }

    public void setCustomerUuid(Long customerUuid) {
        this.customerUuid = customerUuid;
    }

    public Long getGoodsUuid() {
        return goodsUuid;
    }

    public void setGoodsUuid(Long goodsUuid) {
        this.goodsUuid = goodsUuid;
    }
}
