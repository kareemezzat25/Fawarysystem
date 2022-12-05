import java.util.HashMap;
import java.util.Map;

public class Provider {
	double amount ;
	Payment p;
	Map<String,Double> map=new HashMap<String, Double>();
	 public Provider() {
	        map.put("Vodafone",200.0 );
	        map.put("We",100.0 );
	        map.put("Etisalat",150.0 );
	        map.put("Orange", 300.0);

	    }
	 public void setMap(String s,double d){
	        map.put(s,d);
	    }
	 public void getProvider(){
	        map.forEach((key, value) -> System.out.println(key + " " + value));
	    }
	 public Payment setMobilerecharge(String s/*,provider p*/) {
	        if(s=="Creditcard") {

	            p=setPayment(new CreditCardPayment());
	        }
	        else if(s=="cash") {
	            p=setPayment(new CashPayment());
	        }
	        return p;


	    }
	
}
