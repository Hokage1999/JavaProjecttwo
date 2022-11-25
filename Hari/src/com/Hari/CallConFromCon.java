package com.Hari;

public class CallConFromCon {
	public CallConFromCon(String name,String age)
	{
		System.out.println(name+" "+age);
	}
	public CallConFromCon(String Name)
	{
		this(Name,"23");
	}

	public static void main(String[] args) {
		 CallConFromCon obj = new CallConFromCon("hari");
	}

}
