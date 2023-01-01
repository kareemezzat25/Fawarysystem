package com.sw.paymentservices.services;
import com.sw.paymentservices.payment.CashPayment;
import com.sw.paymentservices.payment.CreditCardPayment;
import com.sw.paymentservices.payment.Payment;
public class NGOs extends Donations{
    public Payment setDonationsByCard(String s,double amount) {
        CreditCardPayment p=new CreditCardPayment(amount,s);
        setPayment(p);
        return p;
    }
    public String ConfirmPay(){
        return "the pay for NGOs done";
    }
    public Payment setDonationsByCash() {
        CashPayment p=new CashPayment();
        setPayment(p);
        return p;
    }
    public String Pay(double amount, Payment p){
        p.setAmount(amount);
        return ConfirmPay()+"\n"+ p.paymentDetails();
    }
}
