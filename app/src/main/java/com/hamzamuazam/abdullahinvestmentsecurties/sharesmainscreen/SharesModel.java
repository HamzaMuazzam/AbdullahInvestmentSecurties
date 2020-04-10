package com.hamzamuazam.abdullahinvestmentsecurties.sharesmainscreen;

public class SharesModel {
    private String sharePrice;

    public SharesModel(String sharePrice) {
        this.sharePrice = sharePrice;
    }

    public String getSharePrice() {
        return sharePrice;
    }

    public void setSharePrice(String sharePrice) {
        this.sharePrice = sharePrice;
    }
}
