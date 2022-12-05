package project;
import java.util.*;
public class Lcddisplay {
	
	Authentication obj=new Authentication();
	UserAccount obj2=new UserAccount();
	ServiceDisplay servise=new ServiceDisplay();
    PaymentDisplay py=new PaymentDisplay();
	ServiceDisplay servicedisplay=new ServiceDisplay();
	Scanner input= new Scanner(System.in);
	String Username,email,password;
	
	
	void displayuser()
	{	
		
		while(true)
		{
		System.out.println("Enter 1 to signup : ");
		System.out.println("Enter 2 to signin : ");
		System.out.println("Enter 3 to Exit  : ");
		int i=input.nextInt();
		
		if(i==1)
		{
			
			System.out.println("Enter UserName : ");
			Username=input.next();
			System.out.println("Enter Email : ");
			email=input.next();
			System.out.println("Enter Password : ");
			password=input.next();
			obj.signup("user",Username,email,password);
		}
		else if(i==2)
		{
			System.out.println("Enter Email : ");
			email=input.next();
			System.out.println("Enter Password : ");
			password=input.next();
			obj.signin("user",email,password);
			displayoperations1();
		}
		else if(i==3)
		{
			break;
		}
		}
	}
		
		
	
	void displayadmin()
	{
		
			while(true)
			{
			System.out.println("Enter 1 to signup : ");
			System.out.println("Enter 2 to signin : ");
			System.out.println("Enter 3 to Exit  : ");
			int i=input.nextInt();
			
			if(i==1)
			{
				
				System.out.println("Enter UserName : ");
				Username=input.next();
				System.out.println("Enter Email : ");
				email=input.next();
				System.out.println("Enter Password : ");
				password=input.next();
				obj.signup("admin",Username,email,password);
			}
			else if(i==2)
			{
				System.out.println("Enter Email : ");
				email=input.next();
				System.out.println("Enter Password : ");
				password=input.next();
				obj.signin("admin",email,password);
				displayoperations2();
			
			
			}
			else if(i==3)
			{
				break;
			}
			}
		}
		
	
	void displayoperations1()
	{	int i;
		while(true)
		{
			System.out.println("Enter 1 to make transaction : ");
			System.out.println("Enter 2 to show list of transaction : ");
			System.out.println("Enter 3 to refund : ");
			System.out.println("Enter 4 to display services : ");
			System.out.println("Enter 5 to search for service using name : ");
			System.out.println("Enter 6 to mobile recharge using credit card : ");
			System.out.println("Enter 7 to internet payment using credit card : ");
			System.out.println("Enter 8 to donations using credit card : ");
			System.out.println("Enter 9 to landline using credit card : ");
			System.out.println("Enter 10 to mobile recharge using cash : ");
			System.out.println("Enter 11 to  internet payment using cash : ");
			System.out.println("Enter 12 to donations using cash : ");
			System.out.println("Enter 13 to Exit : ");

			i=input.nextInt();
			if(i==1)
			{
				obj2.maketransction(obj);
			}
			else if(i==2)
			{
				obj2.showlistTransaction(obj.Username);
			}
			else if(i==3)
			{
				requestrefund();
			}
			else if(i==4){
                 servise.chooseService();}
             else if(i==5){
                 System.out.println("enter service name");
                 String st = input.next();
                 servise.enterServicename(st);

             }
             else if(i==6){
                 System.out.println("enter Account number , amount,Phone number");
                 String acc = input.next();
                 double amount=input.nextDouble();
                 String phone = input.next();
                 System.out.println("for pay using wallet enter 2,using credit enter 1");
                 int x= input.nextInt();
                 if(x==1){py.MobilerechargeCredit(acc, amount,phone);}
                 else if(x==2){py.payusingwallet(amount,acc);}

                 }
             else if(i==7){
                 System.out.println("enter Account number , amount,Phone number");
                 String acc = input.next();
                 double amount=input.nextDouble();
                 String phone = input.next();
                 System.out.println("for pay using wallet enter 2,using credit enter 1");
                 int x= input.nextInt();
                 if(x==1){py.getInternetCredit(acc, amount,phone);}
                 else if(x==2){py.payusingwallet(amount,acc);}

             }
             else if(i==8){
                 System.out.println("enter Account number , amount");
                 String acc = input.next();
                 double amount=input.nextDouble();
                 System.out.println("for pay using wallet enter 2,using credit enter 1");
                 int x= input.nextInt();
                 if(x==1){py.getDonationCredit(acc, amount);}
                 else if(x==2){py.payusingwallet(amount,acc);}

             }
             else if(i==9){
                 System.out.println("enter Account number , amount, name of receipt");
                 String acc = input.next();
                 double amount=input.nextDouble();
                 String re= input.next();
                 System.out.println("for pay using wallet enter 2,using credit enter 1");
                 int x= input.nextInt();

                 if(x==1){py.getlandlidCredit(acc,amount,re);}
                 else if(x==2){py.payusingwallet(amount,acc);}}
             else if(i==10) {
                 System.out.println("enter phone number, amount");
                 String phone = input.next();
                 double amount=input.nextDouble();
                 py.MobilerechargeCash( amount,phone);
                 }

             else if(i==11){
                 System.out.println("enter phone number, amount");
                 String phone = input.next();
                 double amount=input.nextDouble();
                 py.getInternetCash( amount,phone);}
             else if(i==12){
                 System.out.println("enter  amount");
                 double amount=input.nextDouble();
                 py.getdonationtCash(amount);}

			else if(i==13)
			{
				break;
			}
			
		}	
	}
	void displayoperations2()
	{
		int i;
		while(true)
		{
		System.out.println("Enter 1 to add discount : ");
		System.out.println("Enter 2 to add provider mobile name :");
		System.out.println("Enter 3 to add provider internet name :");
		System.out.println("Enter 4 to Exit :");
		i=input.nextInt();
		if(i==1)
		{
		int s , p;
		DiscountController discount = new DiscountController() ;
		Services service ;
		System.out.println("Enter Service" ) ;
		System.out.println("Enter 1 for Mobile recharge : " ) ;
		System.out.println("Enter 2 for Internet payment : " ) ;
		System.out.println("Enter 3 for Donations : " ) ;
		System.out.println("Enter 4 for Landline : " ) ;
		 s = input.nextInt();
		 if(s == 1) {
			  service = Services.MOBILE_RECHARGE;
			  System.out.println("Enter Persentage : " ) ;
				p = input.nextInt();
			  discount.setDiscountPercentage(service,"Mobile recharger",p);
		 }
		 else if(s == 2) {
			  service = Services.INTERNET_PAYMENT;
			  System.out.println("Enter Persentage : " ) ;
				p = input.nextInt();
			  discount.setDiscountPercentage (service,"Internet payment",p);
		 }
		 else if(s == 3) {
			  service = Services.DONATIONS;
			  System.out.println("Enter Persentage : " ) ;
				p = input.nextInt();
			  discount.setDiscountPercentage (service,"Donatiions",p);
		 }
		 else{
			   service = Services.LANDLINE;
			   System.out.println("Enter Persentage : " ) ;
				p = input.nextInt();
			   discount.setDiscountPercentage (service,"Landline",p);
		 }
		 
		 
		
		//discount.setDiscountPercentage (p);
		}
		else if(i==2){
            System.out.println("enter provider mobile name");
            String str= input.next();
            servise.enterServicename(str);}

        else if(i==3){
            System.out.println("enter provider internet name");
            String st= input.next();
            servise.enterServicename(st);}
        else if(i==4)
        {
        	break;
        }
		
		}
	}
	void requestrefund()
	{
		servicedisplay.chooseService();
		System.out.println("Enter your service : ");
		String service=input.next();
		servicedisplay.enterServicename(service);
		obj2.showlistTransaction(obj.Username);
		System.out.println("Enter id of transaction you want to refund : ");
		int id=input.nextInt();
		obj2.refund(id);
		
	}

	
}
