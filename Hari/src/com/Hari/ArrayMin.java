package com.Hari;

public class ArrayMin {

	public static void main(String[] args) {
		int x[] = new int[5];
		x = new int[] {-1,5,6,2};
		int min =0;
		for(int i=0;i<x.length;i++)
		{
			if(x[i]<min)
			{
				min = x[i];
				}
		}
    System.out.println(min);
	}

}
