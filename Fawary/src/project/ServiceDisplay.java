package project;
import java.util.Vector;

public class ServiceDisplay {
	public void chooseService(){
        ServiceController control = new ServiceController();
        control.searchForService();


    }
    public void enterServicename(String n){
        ServiceController control = new ServiceController();
        if(n.equals("donations")){
            control.getdonationtions();
        }
        else if(n.equals("Mobile")){
            control.getmobile();
        }
        else if(n.equals("Internet")){
            control.getinternet();
        }
        else if(n.equals("Landline")){
            control.getlandline();

        }

    }
    public void setnewPrviderFormoblie(String n){
        ServiceController control = new ServiceController();
        control.addingmobileProvider(n);
    }
    public void setnewPrviderForinternet(String n){
        ServiceController control = new ServiceController();
        control.addinginternetProvider(n);
    }

}
