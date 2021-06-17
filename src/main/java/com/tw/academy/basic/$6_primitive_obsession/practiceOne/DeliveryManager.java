package com.tw.academy.basic.$6_primitive_obsession.practiceOne;

public class DeliveryManager {
    private final Address from;
    private final Address to;

    public DeliveryManager(Address fromAddress, Address toAddress) {
        this.to = toAddress;
        this.from = fromAddress;
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
