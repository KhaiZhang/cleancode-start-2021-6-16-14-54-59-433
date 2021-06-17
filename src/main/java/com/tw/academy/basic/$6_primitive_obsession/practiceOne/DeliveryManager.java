package com.tw.academy.basic.$6_primitive_obsession.practiceOne;

public class DeliveryManager {
    private final Address from;
    private final Address to;
    String toAddress;
    String fromAddress;

    public DeliveryManager(Address fromAddress, Address toAddress) {
        this.to = toAddress;
        this.toAddress = this.to.getAddress();
        this.from = fromAddress;
        this.fromAddress = this.from.getAddress();
    }

    public DeliverCenter allocate(){
        if (to.getProvince().equals(from.getProvince()) && to.getCity().equals(from.getCity())){
            return DeliverCenter.LOCAL;
        }
        if (to.getProvince().equals(from.getProvince())) {
            return DeliverCenter.PROVINCE;
        }
        return DeliverCenter.FOREIGN;
    }

}
