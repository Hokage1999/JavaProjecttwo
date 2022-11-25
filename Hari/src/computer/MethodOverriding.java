package computer;



class Vehic
{
	public void show()
	{
		System.out.println("Any no of wheels");
	}	
}

class C extends Vehic
{
	
	public void show()
	{
		System.out.println("Any no of wheels");
	}
}
public class MethodOverriding {
	public static void main(String[] args) {
		C car = new C();
		car.show();

	}

}
