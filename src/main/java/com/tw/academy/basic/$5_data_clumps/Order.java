package com.tw.academy.basic.$5_data_clumps;

public class Order {

    private int orderNumber;

    private User user;

    public Order(int orderNumber,User user) {
        this.orderNumber = orderNumber;
        this.setUser(user);
    }

    public String confirm(){
        return user.confirm();
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}

