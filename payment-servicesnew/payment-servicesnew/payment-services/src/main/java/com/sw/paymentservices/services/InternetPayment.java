package com.sw.paymentservices.services;
import java.util.Vector;

import com.sw.paymentservices.payment.CashPayment;
import com.sw.paymentservices.payment.CreditCardPayment;
import com.sw.paymentservices.payment.Payment;
import org.springframework.stereotype.Component;

@Component
public class InternetPayment extends Service {
    //Provider pro;
    Vector<String> providers= new Vector<String>();
    public InternetPayment(){
        providers.add("Vodafone");
        providers.add("Etisalate");
        providers.add("We");
        providers.add("Orange");
    }

    public String getName() {
       return "Internet payment service";

    }
    public void setProvider(String provider) {
        providers.add(provider);
    }
    public Vector<String> getProviders(){
        return providers;
    }

    public Payment setinternetByCard(String s,double amount) {


        CreditCardPayment p=new CreditCardPayment(amount,s);
        setPayment(p);
        return p;
    }
    public Payment setinternetByCash() {
        p=new CashPayment();
        setPayment(p);
        return p;
    }
    public String Pay(double amount, Payment p){
        p.setAmount(amount);
       return p.paymentDetails();
    }



}


