package project;

import java.util.ArrayList;
import java.util.Scanner;

public class Authentication  {
	Scanner input=new Scanner(System.in);
	String Username;
	String email;
	String password;
	String type;
	public ArrayList<Useremail>users=new ArrayList<Useremail>();
	
	public void signup(String type ,String Username,String email,String password)
	{
		this.type=type;
		this.Username=Username;
		this.email=email;
		this.password=password;
		if(type.equals("admin"))
		{
		if(checksignup()==0)
			System.out.println("You register before");
		else
		{
			users.add(new Useremail(type,Username,email,password));
			System.out.println("your register has complete successfully");
		}
		}
		else if(type.equals("user"))
		{
			if(checksignup()==0)
				System.out.println("You register before");
			else
			{
				users.add(new Useremail(type,Username,email,password));
				System.out.println("your register has complete successfully");
			}
			
		}
	}
	
	public void signin(String type,String email,String password)
	{
		if(type.equals("admin"))
		{
		this.email=email;
		this.password=password;
		if(checksignin()==0)
			System.out.println("Welcome to fawary system");
		else
			System.out.println("you should register before signin");
		}
		else if(type.equals("user"))
		{
			this.email=email;
			this.password=password;
			if(checksignin()==0)
				System.out.println("Welcome to fawary system");
			else
				System.out.println("you should register before signin");
			
		}
	}
	int checksignup()
	{
		if(type.equals("admin"))
		{
		for(int i=0;i<users.size();i++)
		{
			if(Username.equals(users.get(i).username)||email.equals(users.get(i).email))
				return 0;
		}
		return 1;
		}
		else if(type.equals("user"))
		{
			for(int i=0;i<users.size();i++)
			{
				if(Username.equals(users.get(i).username)||email.equals(users.get(i).email))
					return 0;
			}
			return 1;
			
		}
		return 0;
	}
	int checksignin()
	{
		if(type.equals("admin"))
		{
		for(int i=0;i<users.size();i++)
		{
			if(email.equals(users.get(i).email)&&password.equals(users.get(i).password))
				return 0;
		}
		return 1;
	
		}
		else if(type.equals("user"))
		{
			for(int i=0;i<users.size();i++)
			{
				if(email.equals(users.get(i).email)&&password.equals(users.get(i).password))
					return 0;
			}
			return 1;
		
		}
		return 0;
	

	}
	}
