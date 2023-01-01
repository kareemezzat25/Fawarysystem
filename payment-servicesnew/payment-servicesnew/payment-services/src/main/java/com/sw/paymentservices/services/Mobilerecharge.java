package com.sw.paymentservices.services;
import java.util.Vector;

import com.sw.paymentservices.payment.CashPayment;
import com.sw.paymentservices.payment.CreditCardPayment;
import com.sw.paymentservices.payment.Payment;
import org.springframework.stereotype.Component;

@Component
public class Mobilerecharge extends Service {
    //Provider pro;

    Vector<String> providers= new Vector<String>();


    public void Mobile(){
        providers.add("Vodafone");
        providers.add("Etisalate");
        providers.add("We");
        providers.add("Orange");
    }
    public void setProvider(String provider) {
        providers.add(provider);
    }
    public Vector<String> getProviders(){
        Mobile();
        return providers;
    }
    public Payment setMobilerechargeByCard(String s,double amount) {


        CreditCardPayment p=new CreditCardPayment(amount,s);
        setPayment(p);
        return p;
    }
    public Payment setMobilerechargeByCash() {
        p=new CashPayment();
        setPayment(p);
        return p;
    }
    public String Pay(double amount, Payment p){
        p.setAmount(amount);
       return p.paymentDetails();
    }



}


