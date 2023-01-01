package com.sw.paymentservices.payment;

import java.util.Objects;

public class PaymentDisplay {
	private String Accnum;
    private String phonenum;
   private  double amount;
   private PaymentController c=new PaymentController();
   private void enterAccnum(String Accnum){
       this.Accnum=Accnum;
   }
    private void enteramount(double amount){
        this.amount=amount;
    }
    private void enterphone(String phonenum){
       System.out.println("PhoneNumber"+phonenum);
        this.phonenum=phonenum;
    }
    public  void payusingwallet(double amount, String Accnum,String nameservice){
        c.consumeFromwallet(amount,Accnum,nameservice);

    }
    public void MobilerechargeCredit(String Accnum ,double amount,String p,String Phone){
       enterphone(Phone);
       c.getMobilerechargeCredit(Accnum,amount,p,Phone);

    }
    public void MobilerechargeCash(double amount,String Phone){
        enterphone(Phone);
        c.getMobilerechargeCash(amount,"Vodafon","01091234567");

    }
    public void getInternetCash( double amount,String Phone){
       enterphone(Phone);
       c.getInternetCash(amount,"Vodafon","01091234567");

    }
    public void getInternetCredit(String Accnum ,double amount,String Phone){
        enterphone(Phone);
        c.getInternetCredit(Accnum,amount,"Vodafon","01091234567");
    }
    public void getlandlidCredit(String Accnum ,double amount,String r){
        c.getlandlidCredit(Accnum,amount,r);
    }
    public void getDonationCredit(String Accnum ,double amount,String name){

       if(Objects.equals(name, "Hospital")){c.getDonationCreditHospital(Accnum,amount);}
       else if (Objects.equals(name, "School")){c.getDonationCreditSchooles(Accnum,amount);}
       else if (Objects.equals(name, "NGOs")){c.getDonationCreditSchooles(Accnum,amount);}

    }
    public void getdonationtCash( double amount,String name){
        if(Objects.equals(name, "Hospital")){c.getDonationtCashHospital(amount);}
        else if (Objects.equals(name, "School")){c.getDonationtCashSchool(amount);}
        else if (Objects.equals(name, "NGOs")){c.getDonationtCashNGOs(amount);}

    }
   

}
