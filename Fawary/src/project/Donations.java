package SW;
import java.util.HashMap;
import java.util.Map;
public class Donations extends Service{

    Map<String,Double> map=new HashMap<String, Double>();
    public Donations() {
        map.put("Hospital",200.0 );
        map.put("Schools",100.0 );
        map.put("(Non profitable organizations",150.0 );

    }
    public void setMap(String s,double d){
        map.put(s,d);
    }
    public void getDonations(){
        map.forEach((key, value) -> System.out.println(key + " " + value));
    }
    public Payment setDonationsByCard(String s,double amount) {


            CreditCardPayment p=new CreditCardPayment(amount,s);
            setPayment(p);
            return p;
    }
    public Payment setDonationsByCash() {
      CashPayment p=new CashPayment();
        setPayment(p);
        return p;
    }

}
