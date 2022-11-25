package com.Hari;

public class Fields {
	String x;
	
	static int y;
	
	final String u = "vishnu";
	
	static final String str = "hari";
	
	
	
	public static void main(String[] args) {
		Fields obj = new Fields();
		obj.x = "nonstatic";
		System.out.println(obj.x);  ///Nonstatic variable
		
		y = 45;
		System.out.println(y);   //static variable
		
		System.out.println(obj.u);  //nonstatic final variable
		
		System.out.println(str);   //static final variable
		
		
		
	}

}
