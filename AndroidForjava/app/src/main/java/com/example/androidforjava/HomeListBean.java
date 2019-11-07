package com.example.androidforjava;

import java.util.List;

/**
 * @author yjn
 * @create 2019/11/7 - 18:45
 */
public class HomeListBean {
    private String name;
    private double score;
    private int monthSellOut;
    private int deliveryMoney;
    private int avgConsumption;
    private int arrivedTime;

    private List<DishBean> dishBeans;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public int getMonthSellOut() {
        return monthSellOut;
    }

    public void setMonthSellOut(int monthSellOut) {
        this.monthSellOut = monthSellOut;
    }

    public int getDeliveryMoney() {
        return deliveryMoney;
    }

    public void setDeliveryMoney(int deliveryMoney) {
        this.deliveryMoney = deliveryMoney;
    }

    public int getAvgConsumption() {
        return avgConsumption;
    }

    public void setAvgConsumption(int avgConsumption) {
        this.avgConsumption = avgConsumption;
    }

    public int getArrivedTime() {
        return arrivedTime;
    }

    public void setArrivedTime(int arrivedTime) {
        this.arrivedTime = arrivedTime;
    }

    public List<DishBean> getDishBeans() {
        return dishBeans;
    }

    public void setDishBeans(List<DishBean> dishBeans) {
        this.dishBeans = dishBeans;
    }
}
