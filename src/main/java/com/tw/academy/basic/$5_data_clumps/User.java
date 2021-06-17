package com.tw.academy.basic.$5_data_clumps;

public class User {
  private String name;
  private String buyerPhoneNumber;
  private String buyerAddress;

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

  public String getBuyerAddress() {
    return buyerAddress;
  }

  public void setBuyerAddress(String buyerAddress) {
    this.buyerAddress = buyerAddress;
  }
}
