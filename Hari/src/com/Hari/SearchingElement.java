package com.Hari;

import java.util.Arrays;
import java.util.Scanner;

public class SearchingElement {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int [] arr = {1,23,4,56,7};
		int x =sc.nextInt();
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==x)
				System.out.println(i);
		}
		int [] ar = new int[5];
		Arrays.fill(ar,3,4,123);
		
		for(int s:ar)
		{
			System.out.println(s);
		}
		
	}

}
