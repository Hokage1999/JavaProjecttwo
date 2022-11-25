package com.Hari;


public class UnicodeChar {
	private static String UnicodeChar(char ch) {
        return String.format("\\u%04x", (int) ch);
    }
    public static void main(String[] args) {
    	
    	 String s = "\u0930";
    	 System.out.println(s);
        String str="jAva2blog";
        String char1 = UnicodeChar(str.charAt(1));
        System.out.println("Unicode value of character A: "+char1);
 
        String char2 = UnicodeChar('क');
        System.out.println("Unicode value of character क: "+char2);
    }
   
 
    
    
    
}