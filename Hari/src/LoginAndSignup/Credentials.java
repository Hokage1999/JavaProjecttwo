package LoginAndSignup;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Credentials
{
	 String name;    //Static poda koodathu
	 String pass;
	 String email;
	 List<String>courses = new ArrayList<>();
	 public Credentials(String name,String pass,String email) {
		this.name = name;
		this.pass = pass;	
		this.email = email;
	}
	 public void signup(String nam,String pas,ArrayList<Credentials>lis,Credentials a)
	 {
		 for(int i=0;i<lis.size()-1;i++)
		 {
		 Credentials s = lis.get(i);
		 if(nam.equals(s.name)&& pas.equals(s.pass))
		 {
			 lis.remove(a);
			 System.out.println("you are already signed in-please login");
			 a.loginCheck(lis,a);
		 }
		 }	 
	 }
	@Override
	public String toString() {
		return "Credentials [name=" + name + ", pass=" + pass + ", email=" + email + "]";
	}
	 
	 public void loginCheck(ArrayList<Credentials> lis,Credentials a)
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
					a.loginCheck(lis,a);
				}
			}
	 }	 
}
