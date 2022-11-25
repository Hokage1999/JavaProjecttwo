package com.Hari;

class Static{
	int x;
	
	static String y;
	
	final String z = "MAss";
	
	static final int t = 578;
}

public class FieldsWithTwoClasses {
		
	public static void main(String[] args) {
		Static obj = new Static();
		obj.x = 34;
		System.out.println(obj.x);   //Nonstatic vera class
		
		System.out.println(Static.y);  //Static vera class
		
		System.out.println(obj.z);   //NonStatic final vera class
		
		System.out.println(Static.t);  //Static final vera class
		
	}

}
