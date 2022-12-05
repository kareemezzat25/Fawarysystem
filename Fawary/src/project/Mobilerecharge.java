package project;
import java.util.Vector;

public class Mobilerecharge extends Service {
    //Provider pro;

    Vector<String> providers= new Vector<String>();

    public void getName() {
        System.out.println("Mobile Recharge service");

    }
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
        System.out.println("Mobile recharge provider: "+providers);
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
    public void Pay(double amount,Payment p){
        p.setAmount(amount);
        p.paymentDetails();
    }



}


