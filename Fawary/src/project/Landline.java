package SW;

public class Landline extends Service {
    Receipt r;
    public void setReceipt(String s,double amount) {
        if(s=="Quarter") {
            new QuarterReceipt();
            Pay(amount);


        }
        else if(s=="Monthly"){
            new MonthlyReceipt();
            Pay(amount);
        }
        else {
            System.out.println("invalid name of receipt");
        }
    }
    public Payment setPayment(String accnum,double amount){
        CreditCardPayment p=new CreditCardPayment(amount,accnum);
        setPayment(p);
        return p;
    }


}
