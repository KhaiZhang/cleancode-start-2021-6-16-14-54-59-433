package com.tw.academy.basic.$5_data_clumps;

//光标移动到任意函数参数上
//-Refactor -extract -paramter objects
//-在第一个buyer使用的地方 introduce field(option + command + F)，勾all occur
// inline field(need final it first)
public class Order {

    private final User user;
    private int orderNumber;

    public Order(int orderNumber, User user) {
        this.orderNumber = orderNumber;

        this.user = user;
    }

    public String confirm(){
        return String.format("Please confirm buyer information: buyer name is %s, " +
                "buyer phone number is %s and buyer address is %s.", this.user.getBuyerName(), this.user.getBuyerPhoneNumber(), this.user.getBuyerAddress());
    }
}

