package com.hamzamuazam.abdullahinvestmentsecurties.ordershistory;

public class OrdersModelClass {
    private String id, earnedProfite, buyDate, buyRate;

    public OrdersModelClass(String id, String earnedProfite, String buyDate, String buyRate) {
        this.id = id;
        this.earnedProfite = earnedProfite;
        this.buyDate = buyDate;
        this.buyRate = buyRate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEarnedProfite() {
        return earnedProfite;
    }

    public void setEarnedProfite(String earnedProfite) {
        this.earnedProfite = earnedProfite;
    }

    public String getBuyDate() {
        return buyDate;
    }

    public void setBuyDate(String buyDate) {
        this.buyDate = buyDate;
    }

    public String getBuyRate() {
        return buyRate;
    }

    public void setBuyRate(String buyRate) {
        this.buyRate = buyRate;
    }
}
