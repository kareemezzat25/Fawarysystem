package project;

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
    public  void payusingwallet(double amount, String Accnum){
        c.consumeFromwallet(amount,Accnum);
    }
    public void MobilerechargeCredit(String Accnum ,double amount,String Phone){
       enterphone(Phone);
       c.getMobilerechargeCredit(Accnum,amount);

    }
    public void MobilerechargeCash(double amount,String Phone){
        enterphone(Phone);
        c.getMobilerechargeCash(amount);
    }
    public void getInternetCash( double amount,String Phone){
       enterphone(Phone);
       c.getInternetCash(amount);

    }
    public void getInternetCredit(String Accnum ,double amount,String Phone){
        enterphone(Phone);
        c.getInternetCredit(Accnum,amount);
    }
    public void getlandlidCredit(String Accnum ,double amount,String r){
        c.getlandlidCredit(Accnum,amount,r);
    }
    public void getDonationCredit(String Accnum ,double amount){
        c.getDonationCredit(Accnum,amount);
    }
    public void getdonationtCash( double amount){
       c.getDonationtCash(amount);
    }

}
