package computer;



class Container
{
	public void show()
	{
		System.out.println("Any no of wheels");
	}	
}

class Truck extends Container
{
	@Override           //annotation
	public void show()
	{
		super.show();   ////Superclassa call panorm
		System.out.println("heels");
	}
}
public class Annnotation {
	public static void main(String[] args) {
		Truck car = new Truck();
		car.show();

	}

}
