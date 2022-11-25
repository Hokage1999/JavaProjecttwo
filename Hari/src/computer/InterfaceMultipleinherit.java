package computer;
interface MultipleInheritance
{
	public void show();
	default void name()
	{
		System.out.println("ghtr");
	}
	public static void age()   //extend panna varathu pola
	{
		System.out.println("24");
	}
}
interface Xyz
{
	public void area();
}

interface Abc extends MultipleInheritance, Xyz
{
	default void name()
	{
		System.out.println("ghtr");
	}
}

public class InterfaceMultipleinherit implements Abc{
	public void show()
	{
		System.out.println("in show");
	}
	public void area()
	{
		System.out.println("in area");
	}
	public static void main(String[] args) {
		Abc  obj = new InterfaceMultipleinherit();
		obj.area();
		obj.show();
		obj.name();
		MultipleInheritance.age();
		
	}

}
