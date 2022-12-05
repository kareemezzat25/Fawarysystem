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
    public Payment setInternetPayment(String s/*,provider p*/) {
        if(Objects.equals(s, "Creditcard")) {

            p=setPayment(new CreditCardPayment());
        }
        else if(Objects.equals(s, "cash")) {
            p=setPayment(new CashPayment());
        }
        return p;


    }



}