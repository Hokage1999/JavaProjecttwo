package computer;
interface Company
{
	// private int x =5;   Illegal modifier for the interface field Company.x; only public, static & final are permitted
	//protected void show();  Illegal modifier for the interface method show; only public, private, abstract, default, static and strictfp are permitted
	  public void show();
	 int x =5;
}
interface Lapto
{
	public void flow();
}
public class Interface implements Company,Lapto{
	public void show()
	{
		//x=10; final variable cannot be assigned
		System.out.println("in show");
	}
	public void flow()
	{
		System.out.println(x+5);
		System.out.println("dsgahc");
	}
	public static void main(String[] args) {
		
		Lapto obj =  new Interface();
		obj.flow();
		
	}
	

}
