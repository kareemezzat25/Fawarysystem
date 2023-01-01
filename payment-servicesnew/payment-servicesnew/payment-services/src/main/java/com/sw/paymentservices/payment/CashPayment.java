package com.sw.paymentservices.payment;

public class CashPayment implements Payment {
    private double amount;

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount=amount;

    }

    public String paymentDetails() {
        return "amount of payment: "+amount;

    }
}


