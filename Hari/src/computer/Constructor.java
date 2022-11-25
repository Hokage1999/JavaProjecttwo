package computer;

final class MyClass {

}
class Computer
{
	
	public Computer(int i)
	{
		System.out.println("hi");
	}
}



class Laptop extends Computer
{
	int i;
	public Laptop(int i)
	{
		//super();       //The constructor Computer is undefined
		super(i);
		System.out.println("nil");
	}
}
public class Constructor {

	public static void main(String[] args) {
		
		Laptop c = new Laptop(4);
		
	}

}
