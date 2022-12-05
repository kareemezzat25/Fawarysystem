package project;
import java.text.SimpleDateFormat;
//import java.time.LocalDateTime;
import java.util.*;
public class UserAccount {
	static Scanner input=new Scanner(System.in);
	private ArrayList<Transaction>listTransaction=new ArrayList<Transaction>();
	public static int id=1;
	
	void maketransction(Authentication authentication)
	{
		
		System.out.println("Enter paidprice");
		double price=input.nextDouble();
		System.out.println("Enter True if exist any discount and False if not");
		boolean isDiscount=input.nextBoolean();
		String todaydate=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
		listTransaction.add(new Transaction(authentication.Username,id,todaydate,price,isDiscount));
		id++;
	}
	void showlistTransaction(String name)
	{
		for(int i=0;i<listTransaction.size();i++)
		{
			if(name.equals(listTransaction.get(i).nameuser))
			{
			System.out.println("The Transaction : "+(i+1));
			System.out.println("id : "+listTransaction.get(i).getid());
			System.out.println("date of transaction : "+listTransaction.get(i).getDate());
			System.out.println("paid price : "+listTransaction.get(i).getpaidPrice());
			System.out.println("this transaction have discount : "+listTransaction.get(i).getisDiscount());
		
			}
		}
	}
	void refund(int id)
	{
		for(int i=0;i<listTransaction.size();i++)
		{
			if(id==listTransaction.get(i).id)
			{
				System.out.println("paid price : "+listTransaction.get(i).getpaidPrice());
				System.out.println("refund has completed successfuly");
			}
		
		}
	}
	

}
