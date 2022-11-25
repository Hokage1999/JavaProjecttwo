package com.Hari;

import java.util.Arrays;

public class ArrayCopy {

	public static void main(String[] args) {
		int[] source = new int[10];

		for(int i=0; i < source.length; i++) {
		    source[i] = i;
		}

		int[] dest = Arrays.copyOf(source, source.length);
		System.out.println(dest);

	}

}
