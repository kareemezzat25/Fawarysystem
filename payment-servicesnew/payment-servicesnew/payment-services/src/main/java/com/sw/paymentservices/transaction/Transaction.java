package com.sw.paymentservices.transaction;
import java.util.ArrayList;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Transaction {
	
	String nameUser,nameService,paymentMethod;
	 int id;
	String date;
	double paidPrice;
	boolean isDiscount=false;
	public static ArrayList<Transaction>listTransaction=new ArrayList<Transaction>();
	public static ArrayList<Transaction>listRefund=new ArrayList<Transaction>();
	public Transaction()
	{
	}
	public Transaction(String nameUser,int id,double paidPrice,String nameService,String paymentMethod)
	{
		this.id=id;
		this.nameUser=nameUser;
		String todayDate=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
		this.date=todayDate;
		this.paidPrice=paidPrice;
		this.isDiscount=isDiscount;
		this.nameService=nameService;
		this.paymentMethod=paymentMethod;
	}
	public Transaction(String nameUser,int id,double paidPrice)
	{
		this.nameUser=nameUser;
		this.id=id;
		this.paidPrice=paidPrice;
	}
	public void setid(int id)
	{
		this.id=id;
	}
	public void setpaidPrice(double paidPrice)
	{
		this.paidPrice=paidPrice;
	}
	public void setDatetime(String date)
	{
		this.date=date;
	}
	public void setisDiscount(boolean isDiscount)
	{
		this.isDiscount=isDiscount;
	}
	public void setnameservice(String nameService)
	{
		this.nameService=nameService;
	}
	public void setpaymentmethod(String paymentMethod)
	{
		this.paymentMethod=paymentMethod;
	}


	public int getId()
	{
		return id;
	}
	public double getPaidPrice()
	{
		return paidPrice;
	}
	public boolean getIsDiscount()
	{
		return isDiscount;
	}
	public String getDate()
	{
		return date;
	}
	public String getnNameService()
	{
		return nameService;
	}
	public String getPaymentMethod()
	{
		return paymentMethod;
	}
	public String getNameUser()
	{
		return nameUser;
	}
	

}
