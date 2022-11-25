package com.Hari;
class R
{
	int length;
	int breadth;
	int height;
	public R(int length,int breadth,int height)
	{
		this.length = length;
		this.breadth = breadth;
		this.height = height;
	}
	
	public R doubleBox()
	{
		R temp = new R(2*this.length,2*this.breadth,2*this.height);
		//temp.length = 2*this.length;
		//temp.breadth = 2*this.breadth;
		//temp.height = 2*this.height;	
		return temp;
	}
}
public class ReturningObjects {

	public static void main(String[] args) {
		R b1 = new R(4,5,6);
		R b2 = b1.doubleBox();
		System.out.println(b2.length);

	}

}
