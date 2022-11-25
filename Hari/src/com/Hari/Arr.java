package com.Hari;
import java.util.Arrays;
public class Arr {
	public static void main(String[] args)
    {
		String[] Array = new String[10];
		System.out.println(Array[5]);
		
		int[][] arr;
		arr = new int[][]{{1,2,3},{3,4,5}};
		
		//multidimensional array
		/*for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				if(i==1 && j==2)
					arr[i][j] = 4;
			}
		}
		System.out.println(arr[1][2]);*/
		/*int[] ints = {1,2,3,4,56,67};
		int insertIndex = 1;
		int newElement =467;
		for(int i =ints.length-1;i>insertIndex;i--)
		{
			ints[i] = ints[i-1];
		}
		ints[insertIndex] = newElement;
	for(int s:ints)
	{
		System.out.println(s);
	}*/
		/*int[] ints   = {1,2,3,4,5,7,6};  //Removing the 3rd postion elemnt and the last element will be there twice.

		ints[3] = 123;

		int removeIndex = 3;

		for(int i = removeIndex; i < ints.length -1; i++){
		    ints[i] = ints[i + 1];
		}
		for(int s:ints)
		{
			System.out.println(s);
		}*/
		
		/*array copy*/
		
		/*  int[] source = new int[10];

		for(int i=0; i < source.length; i++) {
		    source[i] = i;
		}

		int[] dest = Arrays.copyOfRange(source,0,source.length);

		System.out.println(Arrays.toString(dest));*/
		
		
		/*int[]   ints = new int[10];

		for(int i=0; i < ints.length; i++){
		    ints[i] = 10 - i;
		}

		System.out.println(Arrays.toString(ints));*/
		
		int[] intArray = new int[10];

		Arrays.fill(intArray,3,4,23);

		System.out.println(Arrays.toString(intArray));
		
		
		
		
				
    }
}
