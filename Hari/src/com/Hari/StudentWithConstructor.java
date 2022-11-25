package com.Hari;
class Stud
{
	String name;
	String rollNo;
	int[] marks = new int[3];
	
	public Stud(String name,String rollNo,int[] marks)
	{
		this.name = name;
		this.rollNo = rollNo;
		this.marks = marks;
	}
	public int marksTotal()
	{
		int z = 0;
		for(int i:marks)
		{
			z+=i;
		}
		return z;
	}
}
public class StudentWithConstructor {
	public static void main(String[] args) {
	  int[] marks = new int[] {12,13,14}; 
	  int[] marks2 = new int[] {12,133,144}; 
	  Stud obj = new Stud("hari","127",marks);
	  Stud ob = new Stud("vishnu","14527",marks2);
	  int x= obj.marksTotal();
	  int z= ob.marksTotal();
	  System.out.println(ob.name+":"+z);
	  System.out.println(obj.name+":"+x);
	}
}
