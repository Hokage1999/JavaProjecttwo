package com.Hari;

import java.util.Map;

public class instanceofDowncast {

	public static void main(String[] args) {
		/*Object myobj = new String();    //if it is String ,the output will be true
		if(myobj instanceof String)
			String myString  = (String)myobj; 
		else
			System.out.println(false);*/
		/*Integer myInteger = 0;
		Object myObject =new Integer(34);  // get object from somewhere

				if(myObject instanceof String) {
				    String myString = (String) myObject;
				    System.out.println(true);

				} else if(myObject instanceof Integer) {
				    myInteger = (Integer) myObject;
				    System.out.println(false);
				}
		System.out.println(myInteger);*/
		Object myObject = new String("helloworld");
		if(myObject instanceof String) {
		    String str = (String) myObject;
		    System.out.println(str.substring(0,5));         //Downcasting
		}
		
		Object myObj = new String("hworld");
		if(myObj instanceof String myStr) {
		    System.out.println(myStr.substring(0,5));         //Downcasting need not to be explicitly done(pattern matching)
		}

	}

}
