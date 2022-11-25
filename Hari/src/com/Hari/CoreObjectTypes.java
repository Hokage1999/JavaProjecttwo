package com.Hari;

public class CoreObjectTypes {
		
		
	public static void main(String[] args) {
		Integer i = new Integer(56);
		// i = 35;         //ithu possible
		//i = new Integer(35);   //ithu  possible
		method1(i);
		
		System.out.println(i);
	}
	static void method1(Integer i)
	{
		i = i+1;
	}
	
	
}
