package com.Hari;

public class Constructors_EXception {
	String name;
	public Constructors_EXception(String name) throws Exception
	{
		if(name ==null)
			throw new Exception("Sry name is null");
		else
			System.out.println(name);
	}

	public static void main(String[] args) {
		try
		{
       Constructors_EXception obj = new  Constructors_EXception(null);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	
	}
	
}
