package project;

import java.time.LocalDateTime;

public class Transaction {
	
	String nameuser;
	int id;
	String date;
	double paidPrice;
	boolean isDiscount;
	public Transaction(String nameuser,int id,String date,double paidPrice,boolean isDiscount)
	{
		this.nameuser=nameuser;
		this.id=id;
		this.date=date;
		this.paidPrice=paidPrice;
		this.isDiscount=isDiscount;
		
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
	public int getid()
	{
		return id;
	}
	public double getpaidPrice()
	{
		return paidPrice;
	}
	public boolean getisDiscount()
	{
		return isDiscount;
	}
	public String getDate()
	{
		return date;
	}

}
