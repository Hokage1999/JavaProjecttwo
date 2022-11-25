package com.Hari;

import java.nio.charset.Charset;

public class StringSplit {

	public static void main(String[] args) {
		String   source = "A man drove with a car.";
		String[] occurrences = source.split("a");
		for(String s:occurrences)
		{
			System.out.println(s);
		}
		String   so = "hari a is a is a is.";
		String[] z = so.split("i",3);
		String[] occur = source.split("i",3);
		for(String s:z)
		{
			System.out.println(s);
		}
		
		//Converting objects to strings
		Integer i = new Integer(34);
		String intstr = i.toString();
		System.out.println(intstr);
		//intstr/23;  /vcant be done type mismatch
		
		
	

}
}