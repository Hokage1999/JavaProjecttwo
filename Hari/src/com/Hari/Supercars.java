package com.Hari;

class Cars
{
	String brandName;
	String color;
	String gears;
	public Cars(String brandName, String color, String gears) {
		super();
		this.brandName = brandName;
		this.color = color;
		this.gears = gears;
	}
	
	
	
}

public class Supercars {

	public static void main(String[] args) {
		Cars obj = new Cars("ferrari","red","5");
		Cars ob = new Cars("safari","black","24");
		System.out.println(ob.brandName);
		

	}

}
