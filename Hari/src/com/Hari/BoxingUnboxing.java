package com.Hari;

public class BoxingUnboxing {

	public static void main(String[] args) {
		//Boxing
		int x = 5;
		Integer myInteger = new Integer(x);
		System.out.println(myInteger);
		
		//Autoboxing
		
		//int y = 10;
		Integer z = 10;
		System.out.println(z);
		
		//Unboxing
		Integer a = new Integer(45);
		int b = a.intValue();
		System.out.println(b);
		
		//Autounboxing
		
		Integer p = new Integer(34);
		int q= p;
		System.out.println(q);

	}

}
