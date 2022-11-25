package com.Hari;

public class Arr2 {

	public static void main(String[] args) {
			int Array[] = new int[10];   //Primitive datatype array
			System.out.println(Array[0]+Array[1]);
			//Object Reference Array(String)
			String[] arr = new String[10];
			System.out.println(arr[0]);
			//Object Reference(Arr2)
			Arr2[] a = new Arr2[10];
			System.out.println(a[0]);
			System.out.println(a.length);
			String[] stringArray = new String[10];

			for(int i=0; i < stringArray.length; i++) {
			    stringArray[i] = "String no " + i;
			}

			for(int i=0; i < stringArray.length; i++) {
			    System.out.println( stringArray[i] );
			}

			
	}
}
