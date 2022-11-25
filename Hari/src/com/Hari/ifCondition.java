package com.Hari;
class Check
{
	static void methodOne (String input) {

	    if ( isValid(input) ) {
	        System.out.println(input + " is valid");
	    } else {
	        System.out.println(input + " is not valid");
	    }

	}

	static boolean isValid(String value) {
	    return( "123".equals(value) ) ;
	}
}

public class ifCondition {

	public static void main(String[] args) {
			String input = null;
			Check.methodOne(input);
			
			
			String object =null;
			String name = "hari";
			String age="fcij".equals(name)?"john":"vixzxcji";    //ternary operator
			String value = object != null ? object/*object.getValue()*/ : null;   //doubt
			System.out.println(age);
   
	}

}
