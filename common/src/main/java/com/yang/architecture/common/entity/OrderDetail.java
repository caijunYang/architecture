package com.yang.architecture.common.entity;

import java.math.BigDecimal;

/**
 * Created by Administrator on 2016/8/21.
 */
public class OrderDetail {
    private Long uuid;
    private Long orderUuid;
    private Long goodsUuid;
    private Integer orderNum;
    private BigDecimal price;
    private BigDecimal money;
    private BigDecimal saveMoney;

    public Long getUuid() {
        return uuid;
    }

    public void setUuid(Long uuid) {
        this.uuid = uuid;
    }

    public Long getOrderUuid() {
        return orderUuid;
    }

    public void setOrderUuid(Long orderUuid) {
        this.orderUuid = orderUuid;
    }

    public Long getGoodsUuid() {
        return goodsUuid;
    }

    public void setGoodsUuid(Long goodsUuid) {
        this.goodsUuid = goodsUuid;
    }

    public Integer getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(Integer orderNum) {
        this.orderNum = orderNum;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public BigDecimal getSaveMoney() {
        return saveMoney;
    }

    public void setSaveMoney(BigDecimal saveMoney) {
        this.saveMoney = saveMoney;
    }

    @Override
    public String toString() {
        return "OrderDetail{" +
                "uuid=" + uuid +
                ", orderUuid=" + orderUuid +
                ", goodsUuid=" + goodsUuid +
                ", orderNum=" + orderNum +
                ", price=" + price +
                ", money=" + money +
                ", saveMoney=" + saveMoney +
                '}';
    }
}
