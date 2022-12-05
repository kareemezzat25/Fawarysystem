package project;

import java.util.ArrayList;
import java.util.Scanner;

public class Authentication  {
	Scanner input=new Scanner(System.in);
	String Username;
	String email;
	String password;
	public ArrayList<Useremail>users=new ArrayList<Useremail>();
	
	public void signup(String Username,String email,String password)
	{
		this.Username=Username;
		this.email=email;
		this.password=password;
		if(checksignup()==0)
			System.out.println("You register before");
		else
		{
			users.add(new Useremail(Username,email,password));
			System.out.println("your register has complete successfully");
		}
	}
	
	public void signin(String email,String password)
	{
		
		this.email=email;
		this.password=password;
		if(checksignin()==0)
			System.out.println("Welcome to fawary system");
		else
			System.out.println("you should register before signin");
		
	}
	int checksignup()
	{
		for(int i=0;i<users.size();i++)
		{
			if(Username.equals(users.get(i).username)||email.equals(users.get(i).email))
				return 0;
		}
		return 1;
		
	}
	int checksignin()
	{
		for(int i=0;i<users.size();i++)
		{
			if(email.equals(users.get(i).email)&&password.equals(users.get(i).password))
				return 0;
		}
		return 1;
	}
	

}
