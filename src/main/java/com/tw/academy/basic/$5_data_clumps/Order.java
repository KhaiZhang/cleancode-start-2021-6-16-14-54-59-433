package com.tw.academy.basic.$5_data_clumps;

public class Order {

    private int orderNumber;

    private User user;

    public Order(int orderNumber, String buyerName, String buyerPhoneNumber, String buyerAddress) {
        this.orderNumber = orderNumber;
        this.setBuyerName(buyerName);
        this.setBuyerPhoneNumber(buyerPhoneNumber);
        this.setBuyerAddress(buyerAddress);
    }

    public String confirm(){
        return user.confirm();
    }

    public String getBuyerName() {
        return this.user.getName();
    }

    public void setBuyerName(String buyerName) {
        this.user = new User(buyerName);
    }

    public String getBuyerPhoneNumber() {
        return this.user.getBuyerPhoneNumber();
    }

    public void setBuyerPhoneNumber(String buyerPhoneNumber) {
        this.user.setBuyerPhoneNumber(buyerPhoneNumber);
    }

    public String getBuyerAddress() {
        return this.user.getBuyerAddress();
    }

    public void setBuyerAddress(String buyerAddress) {
        this.user.setBuyerAddress(buyerAddress);
    }
}

