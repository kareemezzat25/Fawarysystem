import java.util.Vector;

public  class MobileRecharge extends Service {
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
    public Payment setMobilerecharge(String s/*,provider p*/) {
        if(s=="Creditcard") {

            p=setPayment(new CreditCardPayment());
        }
        else if(s=="cash") {
            p=setPayment(new CashPayment());
        }
        return p;


    }
    public void pay() {
	

}

