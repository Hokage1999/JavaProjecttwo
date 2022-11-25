package com.Hari;

public class FibonacciSeries {

	public static void main(String[] args) {
		int x = 0;
		int y = 1;
		int z;
		int n = 10;
		System.out.println(x);
		System.out.println(y);
		for(int i=0;i<n-2;i++)
		{
			z = x+y;
			if(z<25)
			{ 
			System.out.println(z);
			x=y;
			y=z;
			}
			else
			{
				break;
			}
		}
		
	}

}
