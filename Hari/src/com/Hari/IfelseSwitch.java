package com.Hari;

public class IfelseSwitch {
		public static boolean isEquals(String value)
		{
			if("123".equals(value))
				return true;
			return false;
		}
	public static void main(String[] args) {
		/*int x =20;
		if(x<30)
			System.out.println("good");
		else
			{System.out.println("bad");
			System.out.println("nl"); }  //outside the else statement   */
		/*String input = null;
		
		if(isEquals(input))
			System.out.println("valid");
		else
			System.out.println("not valid"); */
		
		/*************************************ternary operator****************************/
		  int a = 10;
		  int b =25;
		  int max = a>b?a:b;
		  System.out.println(max);
		 
		  String name = "hari";
		  String password = "1234";	  
		 String x = (name.length()>=4 && password.length()>=4) ? "success":"failed";
		 System.out.println(x);
		 /**************************SwitchStatements************************/
		 int salary = 30000;
		 switch(salary)
		 {
		 case 30000:
			 System.out.println("manager");
			 break;
		 case 10000:
			 System.out.println("labour");
			 break;
		 case 20000:
			 System.out.println("employee");
			 break;
		 default:
			 System.out.println("yarumilla poda");
			 break;
		 }
	}
}
