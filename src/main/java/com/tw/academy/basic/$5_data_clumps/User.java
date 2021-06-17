package com.tw.academy.basic.$5_data_clumps;

public class User {
  private String name;
  private String buyerPhoneNumber;

  public User(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getBuyerPhoneNumber() {
    return buyerPhoneNumber;
  }

  public void setBuyerPhoneNumber(String buyerPhoneNumber) {
    this.buyerPhoneNumber = buyerPhoneNumber;
  }
}
