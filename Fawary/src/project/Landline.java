package project;

public class Landline extends Service {
    Receipt r;
    public Receipt setReceipt(String s,double amount,Payment p) {
        if(s.equals("Quarter")) {

            Pay(amount,p);
            return new QuarterReceipt();


        }
        else if(s.equals("Monthly")){
            Pay(amount,p);
            return new MonthlyReceipt();

        }
        else {
            System.out.println("invalid name of receipt");
            return null;
        }
    }

    public Payment setPaymentCredit(String s,double amount) {


        CreditCardPayment p=new CreditCardPayment(amount,s);
        setPayment(p);
        return p;
    }
    public Payment setPaymentCash() {
        CashPayment p=new CashPayment();
        setPayment(p);
        return p;
    }
    public void Pay(double amount,Payment p){
        p.setAmount(amount);
        p.paymentDetails();
    }


}



