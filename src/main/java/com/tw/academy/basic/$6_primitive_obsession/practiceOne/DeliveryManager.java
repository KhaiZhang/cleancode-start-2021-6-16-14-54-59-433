package com.tw.academy.basic.$6_primitive_obsession.practiceOne;

public class DeliveryManager {
    private final Address fromAddress;
    private final Address toAddress;

    public DeliveryManager(Address fromAddress, Address toAddress) {
        this.toAddress = toAddress;
        this.fromAddress = fromAddress;
    }

    public DeliverCenter allocate(){
        if (toAddress.isSameProvinceWith(fromAddress) && toAddress.isSameCityWith(fromAddress)){
            return DeliverCenter.LOCAL;
        }
        if (toAddress.isSameProvinceWith(fromAddress)) {
            return DeliverCenter.PROVINCE;
        }
        return DeliverCenter.FOREIGN;
    }

}
