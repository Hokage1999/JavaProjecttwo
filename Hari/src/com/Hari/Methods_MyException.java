package com.Hari;

public class Methods_MyException {
			private static String concat(String x,String y) throws Exception
			{
				if (x==null)
					throw new Exception("String x was null");
				if (y==null)
					throw new Exception("String y was null");
				return x+y;				
			}
	public static void main(String[] args) {
		String x = "null";
		String y = "null";
		try {
		String z = concat(x,y);
		System.out.println(z);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		

	}

}
