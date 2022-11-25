package com.Hari;

import java.util.Iterator;

public class forloop {

	public static void main(String[] args) {
		
	/*	for (int i =0;i<10;i++ ) 
		{
			if(x%2==0)
			{
				continue;
			}
			else
			{
				System.out.println(i);
			}
		}*/
	
		int x = 1;
		do {
				if(x%5==0)
				{
					x++;
					continue;
					//x++;    ----unreachable code error
				}
				else
				{
					System.out.println(x);
					x++;
				}	
			 
		}
		while(x!=20);
		
		
		
	}

}
