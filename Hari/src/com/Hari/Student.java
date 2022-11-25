package com.Hari;
class Details
{
	String name;
	String rollNo;
	int[] marks = new int[3];
	
	static int marksTotal(int[] marks)
	{
		int z = 0;
		for(int i:marks)
		{
			z+=i;
		}
		return z;
	}
}
public class Student {

	public static void main(String[] args) {
		Details s1 = new Details();
		s1.name = "hari";
		s1.rollNo = "127";
		s1.marks = new int[]{100,100,99};
		int Total  = Details.marksTotal(s1.marks);
		Details s2 = new Details();
		s2.name ="vishnu";
		s2.rollNo = "932";
		s2.marks = new int[] {43,56,78};
		int Tot = s2.marksTotal(s2.marks);
		System.out.println(s1.name+" "+s1.rollNo+" "+Tot);
		

	}

}
