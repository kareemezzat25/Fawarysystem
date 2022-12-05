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
    public Payment setDonations(String s) {
        if(s=="Creditcard") {

            p=setPayment(new CreditCardPayment());
        }
        else if(s=="cash") {
            p=setPayment(new CashPayment());
        }
        return p;


    }

}
