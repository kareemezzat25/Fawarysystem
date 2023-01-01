package com.sw.paymentservices.services;

import com.sw.paymentservices.payment.Payment;

public abstract class Service {
	 	Payment p;
	    public Payment setPayment (Payment p) {
	        this.p=p;
	        return p;
	    }
	    public abstract String Pay(double amount, Payment py);

}
