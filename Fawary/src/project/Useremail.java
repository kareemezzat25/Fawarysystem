package project;

public class Useremail {
	String username;
	String email;
	String password;
	String type;
	
	public Useremail(String type,String username,String email,String password)
	{
		this.type=type;
		this.username=username;
		this.email=email;
		this.password=password;
		
	}
	public  String getusername()
	{
		return username;
	}
	public String getemail()
	{
		return email;
	}
	public String getpassword()
	{
		return password;
	}
	
	

}
