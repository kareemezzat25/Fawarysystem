package com.sw.paymentservices.services;
import java.util.ArrayList;

import com.sw.paymentservices.payment.Payment;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Component;
@Component
public abstract class Donations extends Service{
    private double amount;
    private String name;

    ArrayList<String> donations_=new ArrayList<>();
    public Donations() {
        donations_.add("Hospital");
        donations_.add("Schools");
        donations_.add("(Non profitable organization");

    }
    public  abstract String ConfirmPay();

    public void setnewdonation(String s){
        donations_.add(s);
    }
    public ArrayList getDonations(){
       return donations_;
    }
    public abstract Payment setDonationsByCard(String s,double amount);
    public abstract Payment setDonationsByCash();
    public  abstract String Pay(double amount, Payment p);


}
