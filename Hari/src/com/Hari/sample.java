package com.Hari;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class sample{

		 String uname;    //Static poda koodathu
		 String pass;
		 String mobileNo;
		 List<String>courses = new ArrayList<>(); //change
		 Integer x;
		 @Override
		public String toString() {
			return "sample [uname=" + uname + ", pass=" + pass + ", mobileNo=" + mobileNo + ", courses=" + courses+"]";
		}
	
		 public sample(String uname,String pass,String mobileNo) {
			this.uname = uname;
			this.pass = pass;	
			this.mobileNo = mobileNo;
		 }
		public static void main(String[] args) {
			int n = 0;
			 List<sample>list = new ArrayList<>();
			Scanner sc = new Scanner(System.in);
			while(n!=2)
			{
				System.out.println("name");
				String name = sc.nextLine();
				System.out.println("pass");
				String pass = sc.nextLine();
				System.out.println("mobileno");
				String mobileNo =  sc.nextLine();
				sample obj = new sample(name,pass,mobileNo);
				System.out.println("enter x");
				int x = sc.nextInt();
				sc.nextLine();
				while(x==1)
				{
					String course = sc.nextLine();
					obj.courses.add(course);
					x = sc.nextInt();
					sc.nextLine();
				}
				list.add(obj);
				n++;
			}
				System.out.println(list.toString());
				System.out.println("enter name");
				String name  = sc.nextLine();
				for(int i=0;i<list.size();i++)
				{
					sample s =list.get(i);
					if(name.equals(s.uname))
					{
						s.courses.add("ertyuiop");
					}
				}
				System.out.println(list.toString());
					
					
				
				
				
				
				
				
				
				
				/*sample obj = new sample("hari","123","8849735");
				System.out.println(obj.uname);
				System.out.println(obj.courses);
				obj.courses.add("java");
				obj.courses.add("disguk");
				System.out.println(obj.courses);*/
				
				
				
		}
	
}
