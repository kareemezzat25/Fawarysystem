package com.sw.paymentservices.providers;
import java.util.HashMap;
import java.util.Map;

import com.sw.paymentservices.services.Service;


public  interface Provider {
	public double amount=0 ;

	//Map<String,Double> map=new HashMap<String, Double>();


	 public boolean checknumber(String number);

	 
	 
	

}
