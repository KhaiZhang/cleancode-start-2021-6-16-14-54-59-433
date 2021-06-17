package com.tw.academy.basic.$5_data_clumps;

//光标移动到任意函数参数上
//-Refactor -extract -paramter objects
//-在第一个buyer使用的地方 introduce field(option + command + F)，勾all occur
// inline field(need final it first)
public class Order {

    private final User user;
    private int orderNumber;

    private String buyerName;
    private String buyerPhoneNumber;
    private String buyerAddress;

    public Order(int orderNumber, User user) {
        this.orderNumber = orderNumber;

        this.user = user;
        this.buyerName = this.user.getBuyerName();
        this.buyerPhoneNumber = this.user.getBuyerPhoneNumber();
        this.buyerAddress = this.user.getBuyerAddress();
    }

    public String confirm(){
        return String.format("Please confirm buyer information: buyer name is %s, " +
                "buyer phone number is %s and buyer address is %s.", buyerName, buyerPhoneNumber, buyerAddress);
    }
}

