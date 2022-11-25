package com.Hari;

public class Varaiable {
    static char myByte;
    public static void main(String[] args)
    {
    	double x=0.01D;
    	for(int i=0;i<100;i++)
    	{
    		x+=0.01D;
    	}
    	System.out.println(x); ///Floating point precision.
    	
    	
    	double result3 = Math.floorDiv(-109,9); //Mathfloor div rounding down.
    	System.out.println("result3: " + result3);

    	double result4 = -109 / 9;
    	System.out.println("result4: " + result4);
    	
    	double random = Math.random() * 100D;  //returns a number bw 1 to 100
    	System.out.println((int)random);
    	
    	double exp1 = Math.exp(1);  //exponential to the power e
    	System.out.println("exp1 = " + exp1);
    	double z = Math.log(exp1);   //log to the base e
    	System.out.println(z);
    }	
}
