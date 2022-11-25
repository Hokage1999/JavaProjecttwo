package com.Hari;

public class SwitchStatements {
	public static void main(String[] args)
	{
		Size size = Size.LARGE;
	show(size);
	char key ='\t';
	blow(key);
	}
	
	public static enum Size
	{
		SMALL,MEDIUM,LARGE;
	}
	public static void show(Size size)
	{
		switch(size)
		{
		case SMALL,LARGE:System.out.println("5");break;
		case MEDIUM:System.out.println("10");break;
		default:System.out.println("nil");break;	
		}
		System.out.println(size.SMALL);
	}
	
	public static void blow(char key)
	{
		switch(key)
		{
		case('\t'):
		case('\r'):System.out.println("nil");break;	
			
		}
	}
}
