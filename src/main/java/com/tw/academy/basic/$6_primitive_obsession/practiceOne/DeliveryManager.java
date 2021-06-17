package com.tw.academy.basic.$6_primitive_obsession.practiceOne;

public class DeliveryManager {
    private final Address from;
    private final Address to;
    String toAddress;
    String fromAddress;

    public DeliveryManager(Address fromAddress, Address toAddress) {
        this.to = toAddress;
        this.toAddress = this.to.getFromAddress();
        this.from = fromAddress;
        this.fromAddress = this.from.getFromAddress();
    }

    public DeliverCenter allocate(){
        if (getProvince(toAddress).equals(getProvince(fromAddress)) && getCity(toAddress).equals(getCity(fromAddress))){
            return DeliverCenter.LOCAL;
        }
        if (getProvince(toAddress).equals(getProvince(fromAddress))) {
            return DeliverCenter.PROVINCE;
        }
        return DeliverCenter.FOREIGN;
    }

    private String getCity(String address) {
        return address.substring(address.indexOf("省") + 1, address.indexOf("市"));
    }

    private String getProvince(String address) {
        return address.substring(0, address.indexOf("省"));
    }
}
