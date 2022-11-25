package com.Hari;

import java.nio.charset.Charset;

public class STringgetBytes {

	public static void main(String[] args) {
		String theString = "€";
		
		byte[] bytes1 = theString.getBytes();
		byte[] bytes2 = theString
		                .getBytes(Charset.forName("UTF-16"));
		for(byte s:bytes1)
		{
			System.out.println(s);
		}
		for(byte s:bytes2)
		{
			System.out.println(s);
		}
		// STring formatting
		String input = "hello %s";
		String put = input.formatted("world");
		System.out.println(put);

	}

}
