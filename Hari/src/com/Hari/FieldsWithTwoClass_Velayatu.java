package com.Hari;

class XYZ{
	int x;
	
	static String y;
	
	final String z = "Mass";
	
	static final int t = 578;
}
public class FieldsWithTwoClass_Velayatu{
		int x =32973540;
		
		static String y;
		
		final String z = "manorama";
		
		static final int t = 47890;
	public static void main(String[] args) {
		XYZ obj = new XYZ();
		obj.x = 34;
		System.out.println(obj.x);   //Nonstatic vera class
		
		System.out.println(XYZ.y);  //Static vera class
		
		System.out.println(obj.z);   //Nonstatic final vera class
		
		System.out.println(XYZ.t);  //static final vera class
		
		FieldsWithTwoClass_Velayatu ob = new  FieldsWithTwoClass_Velayatu();
		System.out.println(ob.x);      //Same variable x in both classes(nonstatic)
		
		System.out.println(y="dsiofj");	//Same variable y in both classes(static)
		
		System.out.println(ob.z);  //Same variable z in both classes(Nonstatic)
		
		System.out.println(t);     //Same variable t in both classes(static)
	}

}
