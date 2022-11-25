package com.Hari;

public class forLoop {
	public static void main(String[] args) {

		String[] strings = {
			    "John", "Jack", "Abraham", "Jennifer", "Ann" };

			
			for(int i=0; i < strings.length; i++) {
			    if(!strings[i].toLowerCase().startsWith("j")) {
			        continue;
			    }
			    else
			    {
			    	System.out.println(strings[i]);
			    }
			}
			for(String s:strings)
			{
				if(s.toLowerCase().startsWith("j"))
				{
					continue;
				}
				else
				{
					System.out.println(s);
				}
			}


	}

}
