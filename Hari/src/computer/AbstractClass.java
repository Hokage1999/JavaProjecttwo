package computer;
abstract class MyAbstractClass {

    public abstract void abstractMethod();
    public abstract void method();
    public void show()
    {
    	System.out.println("in show");
    }
}
class S1 extends MyAbstractClass
{
	public void abstractMethod()
	{
		System.out.println("in abstract method");
	}
	public void method()
	{
		System.out.println("in method");
	}
}
class S2 extends MyAbstractClass
{
	public void abstractMethod()
	{
		System.out.println("shg");
	}
	public void method()
	{
		System.out.println("asfui");
	}
}

public class AbstractClass {

	public static void main(String[] args) {
		MyAbstractClass obj = new S2();
		obj.show();
		obj.method();
		obj.abstractMethod();
	
		
		
	}

}
