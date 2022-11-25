package com.Hari;

import java.nio.charset.Charset;

public class String_Concatenation {
	public static void main(String[] args)
	{
	/*concatenation
	String one = "Hello";
	String two = " World";

	String three = new StringBuilder(one).append(two).toString();
	
	
	System.out.println(three);*/
	/*String Concatenation for loop
	String[] strings = new String[]{"one", "two", "three", "four", "five"};
	String result=null;
	for(String string : strings) {
		result = result + string;
		}
				
		System.out.println(result);*/	
		/*SUbstring
		String string1 = "Hello World";

		String substring = string1.substring(0,5);
		System.out.println(substring);*/
		
		/* indexof String
		 * String theString = "is this good or is this bad?";
		 String substring = "is";
		int index = theString.indexOf(substring);
		while(index != -1) {
		    System.out.println(index);
		    index = theString.indexOf(substring, index+1 );  
		}*/
		/*String text = "one two three two one";
		boolean matches = text.matches(".*to.*");
	    System.out.println(matches);*/
		
		/* equalsignore case*/
		 
		 String one   = "abc";
		 String two   = "def";
		 String three = "ABC";
		 System.out.println( one.equalsIgnoreCase(three) );
		 
		 String text    = "  And he ran across the field   ";
		 String trimmed = text.trim();
		 System.out.println(trimmed);
		 
		 Integer integer = new Integer(123);
		 String intStr = integer.toString();
		 
		 
		 String theString = "This is a good day to code";

		 byte[] bytes1 = theString.getBytes();
		 byte[] bytes2 = theString
		                 .getBytes(Charset.forName("UTF-8"));
		 System.out.println(bytes1);
		 System.out.println(bytes2);
		/* 
		 String input = "Hari %s";
		 String output = input.formatted("is good");
		 System.out.println(output);
		 String x = "%s Hari ";
		 String ou = x.formatted("Welcome");
		 System.out.println(ou);*/
		 
		 String input  = "   Hey This    is indented.";
		 String output = input.stripIndent();

		 System.out.println(output);
		/* String input = "Hey, \\n This is not normally a line break.";
		 System.out.println(input);
		 String output = input.translateEscapes();
		 System.out.println(output);*/
		 
		 
		 
		 
	    
	    
	    
	  
	
	}
}
