package com.Hari;

public class constructor {
	String userName;
	String userAge;
	String pass;
	String name;
	String age;
	String password;
	public constructor()         //Default Constructor
	{
		System.out.println("hari");
	}
	public constructor(String x)          //parametrized Constructor
	{
		System.out.println(x +" is a gud boy");
	}
	public constructor(String name,String age)    //Without this keyword
	{
		userName = name;
		userAge = age;
	}
	
	public constructor(String name,String age,String password)    //With this keyword
	{
		this.name = name;
		this.age = age;
		this.password =password;
	}
	public static void main(String[] args) {
		constructor obj = new constructor();
		constructor ob = new constructor("hari");
		constructor without = new constructor("hari","23");
		constructor with = new constructor("vshnu","234","dkhf");
		System.out.println(without.userName);
		System.out.println(without.userAge);
		System.out.println(with.name);
		System.out.println(with.password);
		

	}

}
