package SW;
import java.util.Vector;
public class Mobilerecharge extends Service {
    //Provider pro;

    Vector<String> providers= new Vector<>();

    public void getName() {
        System.out.println("Mobile Recharge service");

    }
    public void setProvider(String provider) {
        providers.add(provider);
    }
    public Vector<String> getProviders(){
        return providers;
    }
     public Payment setMobilerechargeByCard(String s,double amount) {


        CreditCardPayment p=new CreditCardPayment(amount,s);
        setPayment(p);
        return p;
    }
    public Payment setMobilerechargeByCash() {
        CashPayment p=new CashPayment();
        setPayment(p);
        return p;
    }


}

