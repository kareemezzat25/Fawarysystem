package project;

public class PaymentController {
	Mobilerecharge m =new Mobilerecharge();
    Donations d=new Donations();
    InternetPayment i=new InternetPayment();

    Landline l=new Landline();

    public  void consumeFromwallet(double amount, String Accnum){
        CreditCardPayment py=new CreditCardPayment(amount,Accnum);
        py.payfromWallet(amount);
        py.paymentDetails();
    }
    public void getMobilerechargeCash( double amount){

        m.setPayment(m.setMobilerechargeByCash());
        m.Pay(amount,m.setMobilerechargeByCash());
    }
    public void getMobilerechargeCredit(String Accnum ,double amount){

        m.setPayment(m.setMobilerechargeByCard(Accnum,amount));
        m.Pay(amount,m.setMobilerechargeByCard(Accnum,amount));
    }
    public  void getInternetCash( double amount){

        i.setPayment(i.setinternetByCash());
        i.Pay(amount,i.setinternetByCash());

    }
    public void getInternetCredit(String Accnum ,double amount){

        i.setPayment(i.setinternetByCard(Accnum,amount));
        i.Pay(amount,i.setinternetByCard(Accnum,amount));
    }
    public void getlandlidCredit(String Accnum ,double amount,String r){

       l.setPayment(l.setPaymentCredit(Accnum,amount));
        l.Pay(amount,l.setPaymentCredit(Accnum,amount));
        l.setReceipt(r,amount,l.setPaymentCredit(Accnum,amount));
    }
    public void getLadlineCash( double amount){

        l.setPayment(l.setPaymentCash());
        l.Pay(amount,l.setPaymentCash());

    }
    public void getDonationCredit(String Accnum ,double amount){

        d.setPayment( d.setDonationsByCard(Accnum,amount));
        d.Pay(amount,d.setDonationsByCard(Accnum,amount));
    }
    public void getDonationtCash( double amount){

        d.setPayment(d.setDonationsByCash());
        d.Pay(amount,d.setDonationsByCash());

    }


}
