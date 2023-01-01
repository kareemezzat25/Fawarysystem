package com.sw.paymentservices.services;

public class QuarterReceipt implements Receipt {
    private String name;

    public String makeReceipt() {
        this.name="Quarter Receipt";
       return name;
    }

}