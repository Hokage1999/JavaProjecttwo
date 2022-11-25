package com.Hari;
class Vehicle
{
	public Vehicle()
	{
		System.out.println("in vehicle");
	}
	public Vehicle(String Brand)
	{
		System.out.println("in vehicle with brand:"+Brand);
	}
}
class Car extends Vehicle
{
	public Car()
	{
		super();
		System.out.println("in Car");
	}
	public Car(String Brand)
	{
		super();
		System.out.println("in Car with Brand:"+Brand);
	}
}

public class Constructor_Inheritance {

	public static void main(String[] args) {
		
		Car obj = new Car("audi");
	}

}
