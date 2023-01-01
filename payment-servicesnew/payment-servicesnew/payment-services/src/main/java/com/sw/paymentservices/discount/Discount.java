package com.sw.paymentservices.discount;

import com.sw.paymentservices.providers.Provider;
import com.sw.paymentservices.services.Services;
import org.springframework.stereotype.Component;

import java.util.HashMap;


public class Discount  {
	public	int discountPercentage ;
	double amount;

	public HashMap<String,Double> servicePrice=new HashMap<String, Double>();
	public HashMap<String,Integer> serviceDiscount=new HashMap<String, Integer>();
	public Discount()
	{
		servicePrice.put("Mobile recharger",40.0);
		servicePrice.put("Landline",150.0);
		servicePrice.put("Internetpayment", 220.0);
	}



}


