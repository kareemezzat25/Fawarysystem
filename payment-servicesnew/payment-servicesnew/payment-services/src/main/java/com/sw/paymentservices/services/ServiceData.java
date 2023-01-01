package com.sw.paymentservices.services;
import java.util.Vector;
public class ServiceData {
	Vector<String> services= new Vector<String>();
    Vector<String> landline= new Vector<String>();
    public void setService(String s){
        services.add(s);
    }
    public void service(){
        services.add("Mobile Recharge");
        services.add("Internet");
        services.add("Donations");
        services.add("Landline");
    }
    public Vector<String> getServices(){
        return services;
    }
    public void landline(){

        landline.add("Quarter Receipt");
        landline.add("Monthly Receipt");

    }

    public void setlandline(String s){

        landline.add(s);
    }
    public Vector<String> getLandline(){
        landline();
        return landline;
    }


}
