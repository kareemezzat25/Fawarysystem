package SW;
import java.util.Objects;
import java.util.Vector;
public class InternetPayment extends Service {
    //Provider pro;
    Vector<String> providers= new Vector<>();

    public void getName() {
        System.out.println("Internet payment service");

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



}
