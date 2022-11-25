package computer;

interface Default
{
	public void show();
	default void name()
	{
		System.out.println("ghtr");
	}
	//public static void age();   This method requires a body instead of a semicolon
	//private  static void fry();      //  This method requires a body instead of a semicolon
	public static void age()
	{
		System.out.println("24");
	}
}
class ABC implements Default
{
	public void show()
	{
		System.out.println("hasui");
	}
	public void name()              // overeriding class method has higher precedence
	{
		System.out.println("hari");
	}
}
public class InterfaceDefaultMethod {

	public static void main(String[] args) {
		Default obj = new ABC();
		obj.show();
		obj.name();
		Default.age();
	}

}
