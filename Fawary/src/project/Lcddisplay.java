package project;
import java.util.*;
public class Lcddisplay {
	Authentication obj=new Authentication();
	UserAccount obj2=new UserAccount();
	Scanner input= new Scanner(System.in);
	void display()
	{	
		while(true)
		{
		System.out.println("Enter 1 to signup or 2 to signin");
		System.out.println("Enter 3 to Exit ");
		int i=input.nextInt();
		
		if(i==1)
		{
			
			obj.signup("kareem", "kareem1", "kareem2");
		}
		else if(i==2)
		{
			
			obj.signin("kareem1", "kareem2");
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
				obj2.maketransction(obj);
			}
			else if(i==2)
			{
				obj2.showlist();
			}
			else if(i==3)
			{
				break;
			}

		}
		
	}
}

