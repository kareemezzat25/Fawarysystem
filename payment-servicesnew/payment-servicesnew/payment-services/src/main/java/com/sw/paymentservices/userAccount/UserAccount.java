package com.sw.paymentservices.userAccount;

import org.springframework.stereotype.Component;
public class UserAccount {
	String userName;
	String type;
	String email;
	String password;

	public UserAccount()
	{}
	public UserAccount(String type,String userName,String email,String password)
	{
		this.type=type;
		this.userName=userName;
		this.email=email;
		this.password=password;
	}
	public void setUserName(String userName)
	{
		this.userName=userName;
		
	}
	public void setPassword(String password)
	{
		this.password=password;
		
	}
	public void setEmail(String email)
	{
		this.email=email;
		
	}
	public  String getUserName()
	{
		return userName;
	}
	public String getEmail()
	{
		return email;
	}
	public String getType(){return type;}
	public String getPassword()
	{
		return password;
	}
	
	

}
