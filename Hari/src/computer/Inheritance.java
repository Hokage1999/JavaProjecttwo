package computer;


class Vehicle
{
	int numberplate = 1234;
	
}

class Car extends Vehicle
{
	int x=7;
	public int getNoPlate()
	{
		return numberplate;
	}
	
}
public class Inheritance {

	public static void main(String[] args) {
     Car obj = new Car();
     System.out.println(obj.getNoPlate());   ///getting by subclass instance with method
     System.out.println(obj.numberplate);    //getting by subclassinstance
	}

}
