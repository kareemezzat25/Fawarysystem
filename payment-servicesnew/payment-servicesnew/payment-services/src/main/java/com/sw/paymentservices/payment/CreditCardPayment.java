package com.sw.paymentservices.payment;

public class CreditCardPayment implements Payment{
    private String creditcardnum;
    private double wallet;
    private double amount;

   public CreditCardPayment()
   {
	   
   }
    public CreditCardPayment(double amount,String creditcardnum) {
        this.amount=amount;
        this.creditcardnum=creditcardnum;
    }
    public void setWallet(double wallet){
        this.wallet=wallet;
    }
    public String payfromWallet(double amount){
        wallet=wallet-amount;
        return "pay from Wallet Successfull";
    }
    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount=amount;

    }

    public String paymentDetails () {
        return "the payment amount= "+this.amount+"\n"+"By the card= "+this.creditcardnum;

    }

}


