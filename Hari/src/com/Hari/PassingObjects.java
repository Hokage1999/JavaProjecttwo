package com.Hari;
class Box
{
	int length;
	int breadth;
	int height;
	public Box(int length, int breadth, int height) {
		super();
		this.length = length;         
		this.breadth = breadth;
		this.height = height;
	}
	public Box(Box b)   //copy constructor
	{
		this.length = b.length;
		this.breadth = b.breadth;
		this.height = b.height;	
	}
	public boolean isEqual(Box b)
	{
		if(this.length==b.length  && this.breadth==b.breadth && this.height==b.height)
			return true;
		return false;
	}
	public int volume()
	{
		return length*breadth*height;
	}
}
public class PassingObjects {
	public static void main(String[] args) {
		Box b1 = new Box(5,5,3);
		System.out.println(b1.length);
		int z = b1.volume();    //b1.volumena b1 oda valuesthaa pogapothu so athu length breadth heightnuthaa irukku athe maarithaa b3.isequalla b3 oda values length breadth heightnuthaa irukkum.
		System.out.println(z);
		Box b2 =new Box(b1);
		System.out.println(b2.breadth);
		Box b3 = new Box(6,4,3);
		System.out.println(b3.isEqual(b2));	
	}
}
