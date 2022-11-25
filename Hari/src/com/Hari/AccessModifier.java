package com.Hari;
class Q
{
	public void show()
	{
		System.out.println("Prince");
	}
}

class B extends Q 
{
	//protected void show()   //override panra methddkku visibility koraikkakooodathu
	public void show()
	{
		System.out.println("Love today");
	}
}
	

public class AccessModifier {
	public static void main(String[] args) {
		B obj = new B();
	obj.show();
		
	}

}
