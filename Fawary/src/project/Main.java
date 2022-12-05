package project;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String type;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter type user , admin : ");
		type=input.next();
		Lcddisplay lc=new Lcddisplay();
		if(type.equals("user"))
			lc.displayuser();
		else if(type.equals("admin"))
			lc.displayadmin();		
	}
}
