package com.Hari;

import java.util.ArrayList;
import java.util.Scanner;

public class Credentials
{
	 String name;    //Static poda koodathu
	 String pass;
	 String email;
	 public Credentials(String name,String pass,String email) {
		this.name = name;
		this.pass = pass;	
		this.email = email;
	}
	 static ArrayList<Credentials>lis = new ArrayList<>();
	 public void addList(Credentials a)
	 {
	 lis.add(a);
	 }
	 public boolean signup(Credentials a)
	 {
		 for(int i=0;i<lis.size()-1;i++)
		 {
		 Credentials s = lis.get(i);
		 if(name.equals(s.name)&& pass.equals(s.pass))
		 {
			 lis.remove(a);
			 System.out.println("you are already signed in-please login");
			 a.loginCheck(a);
			 return false;
		 }
		 }
		 System.out.println("signup Success");

		 return true;
	 }
	 
	@Override
	public String toString() {
		return "Credentials [name=" + name + ", pass=" + pass + ", email=" + email + "]";
	}
	 
	 public void loginCheck(Credentials a)
	 {
		 Scanner sc = new Scanner(System.in);
		 String nam = sc.nextLine();
		 String pas = sc.nextLine();
		 for(Credentials x:lis)
			{
				if(x.name.equals(nam)&& x.pass.equals(pas))
				{
					System.out.println("logon Successfull");
				}
				else
				{
					System.out.println("wrong credentials");
					System.out.println("please login again");
					a.loginCheck(a);
				}
			}
	 }	 
}
