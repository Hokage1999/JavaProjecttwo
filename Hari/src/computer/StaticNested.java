package computer;
class Outer
{
	
	static class Inner
	{
		public void show()
		{
		System.out.println("hari");
		}
	}
}
public class StaticNested {

	public static void main(String[] args) {
		//Outer o = new Outer();
		//o.show();     		The method show is undefined for outer
		
	     Outer.Inner i = new Outer.Inner();
	     i.show();
	}

}
