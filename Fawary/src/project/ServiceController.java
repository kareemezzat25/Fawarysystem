package project;
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;
public class ServiceController {
	private ServiceData obj=new ServiceData();
    private Mobilerecharge mobile=new Mobilerecharge();
    private InternetPayment internet=new InternetPayment();
    private Donations don=new Donations();

    Vector<String> ser= new Vector<String>();
    public Vector<String> searchForService(){
         obj.service();
        ser=obj.getServices();
        System.out.println("Sercices: "+ser);
        return ser;
    }
    public void addinginternetProvider(String name){
        internet.setProvider(name);

    }
    public void addingmobileProvider(String name){
        mobile.setProvider(name);
    }
    public void addDonationOPtion(String n,double a){
        don.setMap(n,a);
    }
    public void getdonationtions(){
        don.getDonations();
    }
    public void  getmobile(){
        mobile.getProviders();

    }
    public void getinternet(){
         internet.getProviders();
    }
    public void getlandline(){
         obj.getLandline();
    }


}
