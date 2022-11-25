package com.Hari;

import java.io.FileReader;
import java.io.BufferedReader; 

public class FileRead {
	public static boolean loginCheck(String uname,String pass)
		{
		boolean x = false;
		try 
		{   
	        BufferedReader br = new BufferedReader(new FileReader("/home/sysadmin/Documents/Demo.csv"));
	        String line = "";
	        String[] file;
	        if(br.readLine()==null)
	        {
	        	
	        }
	        while ((line = br.readLine()) != null) {
	        	System.out.println(line);
	            file = line.split(",");
	            System.out.println(file[0]);
	            if(file[0].equals(uname)&& file[1].equals(pass))
	            {
	            	System.out.println(file[0]+file[1]);
	            	x = true;
	            }
	            else
	            {
	            	System.out.println(file[0]+file[1]);
	            }
	        }
	    }
	    catch (Exception e) {
	        e.printStackTrace();
	    }
		return x;
		}
		public static void main(String[] args) {
			
		System.out.println(loginCheck("a","1"));
		
		}
		
}

