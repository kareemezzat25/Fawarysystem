package com.sw.paymentservices.payment;

public interface Payment {
	public double getAmount();
    public void setAmount(double amount);
    public String paymentDetails();

}
