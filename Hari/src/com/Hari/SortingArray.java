package com.Hari;

import java.util.Arrays;

public class SortingArray {

	public static void main(String[] args) {
		int [] arr = {12,45,778,43};
		int [] ar = {12,45,778,43};
		int[] az = {12,35,67,998};
		System.out.println(Arrays.equals(ar, arr));   //true
		System.out.println(Arrays.equals(az, arr));		//false
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i;j<arr.length;j++)
			{
				int x=0;
				if(arr[i]>arr[j])
				{
					x= arr[i];
					arr[i] = arr[j];
					arr[j] = x;
				}
			}		
		}

	for(int s:arr)
	{
		System.out.println(s);
	}
	System.out.println(Arrays.binarySearch(arr,45));    //index
	System.out.println(Arrays.binarySearch(arr,44));    //-(index to be added)-1
	System.out.println(Arrays.binarySearch(arr,779));	//-(length)-1
	System.out.println(Arrays.binarySearch(arr,0,1,43)); //Doubt    */
		for(int i =0;i<=5;i++)
		{
			if(i==3)
			{
				break;
			}
			System.out.println(i);
		}
	
	
	}

}
