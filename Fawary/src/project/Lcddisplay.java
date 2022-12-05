package project;
import java.util.*;
public class Lcddisplay {
	
	Authentication obj=new Authentication();
	UserAccount obj2=new UserAccount();
	Scanner input= new Scanner(System.in);
	String Username,email,password;
	void display()
	{	
		while(true)
		{
		System.out.println("Enter 1 to signup or 2 to signin");
		System.out.println("Enter 3 to Exit ");
		int i=input.nextInt();
		
		if(i==1)
		{
			
			System.out.println("Enter UserName : ");
			Username=input.next();
			System.out.println("Enter Email : ");
			email=input.next();
			System.out.println("Enter Password : ");
			password=input.next();
			obj.signup(Username,email,password);
		}
		else if(i==2)
		{
			System.out.println("Enter Email : ");
			email=input.next();
			System.out.println("Enter Password : ");
			password=input.next();
			obj.signin(email,password);
			displayoperations();
		
		
		}
		else if(i==3)
		{
			break;
		}
		}
	}
	void displayoperations()
	{	int i;
		while(true)
		{
			System.out.println("Enter 1 to make transaction ");
			System.out.println("Enter 2 to show list of transaction ");
			System.out.println("Enter 3 to Exit ");

			i=input.nextInt();
			if(i==1)
			{
				obj2.maketransction();
			}
			else if(i==2)
			{
				obj2.showlistTransaction();
			}
			else if(i==3)
			{
				break;
			}

		}
		
	}

	
}
