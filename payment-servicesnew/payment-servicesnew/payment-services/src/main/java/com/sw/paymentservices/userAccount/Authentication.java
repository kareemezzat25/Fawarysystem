package com.sw.paymentservices.userAccount;

import org.apache.catalina.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class Authentication {
	String username;
	String email;
	String password;
	String type;
	public static ArrayList<UserAccount> users = new ArrayList<UserAccount>();
	public static ArrayList<String> useremail=new ArrayList<>();
	public String signUp(UserAccount userAccount) {
		this.type = userAccount.type;
		this.username = userAccount.userName;
		this.email = userAccount.email;
		this.password = userAccount.password;
		if (userAccount.getType().equals("user")) {
			if (checkSignUp() == 0)
				return "You register before";
			else {
				users.add(new UserAccount(type, username, email, password));
				useremail.add(email);
				return "your register has complete successfully";
			}
		} else if (userAccount.getType().equals("admin")) {
			if (checkSignUp() == 0)
				return "You register before";
			else {
				//users.add(new UserAccount(type, userName, email, password));
				return "your register has complete successfully";
				}

		}

		return "";
	}
	public String signIn(UserAccount userAccount) {
		this.email = userAccount.email;
		this.password = userAccount.password;
		if (checkSignIn() == 0) {
			useremail.add(email);
			return "Welcome to fawary system";
		}
		else
			return "you should register before signin";
	}

	int checkSignUp() {
		{
			for (UserAccount user : users) {
				if (username.equals(user.getUserName()) || email.equals(user.getEmail()))
					return 0;
			}
		}
		return 1;
	}
	int checkSignIn() {

		for (UserAccount user : users) {
			if (email.equals(user.getEmail()) && password.equals(user.getPassword()))
				return 0;
		}
		return 1;
	}
	public UserAccount check(String email, String password) {
		for (UserAccount user : users) {
			if (user.getEmail().equals(email) && user.getPassword().equals(password) && user.getType().equals("user"))
				return user;
		}
		return null;
	}


	public String getUserName() {
		for (UserAccount user:users)
		{
			if(useremail.get(useremail.size()-1).equals(user.getEmail())&&user.getType().equals("user"))
				return user.userName;
		}
		return " ";
	}
}

