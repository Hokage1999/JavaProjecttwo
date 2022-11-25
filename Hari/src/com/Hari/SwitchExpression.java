package com.Hari;

public class SwitchExpression {
	public static void main(String[] args)
	{
		String token = "1456";
		
		String retToken = switch(token)
				{
		case "123"-> "A";
		case "1345"->"G";
		case "1456"->"T";
		default ->"Y";
				};
				
				
				//Switch yield expression
		System.out.println(retToken);
	
			String tok = "1345";
			
			String retTok = switch(tok)
					{
			case "123": yield "A";
			case "1345": yield "G";
			case "1456": yield "T";
			default : yield "Y";
					};
			System.out.println(retTok);
			
			
			int y = 2;
			
			String x = switch(y)
					{
			case 1 ->"A";
			case 2 ->"B";
			case 3 ->"C";
			case 4 ->"D";
			case 5 ->"E";
			default ->"nil";
			
					};
					System.out.println(x);
			
			
			
			
			
	}
}
