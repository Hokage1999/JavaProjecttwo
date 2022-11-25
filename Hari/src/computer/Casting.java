package computer;
class Vehicl
{
	
}

class Ca extends Vehicl
{
	
	
}
public class Casting {

	public static void main(String[] args) {
		Ca car = new Ca();
		Vehicl vehicle = car;   //Upcasting
		Ca y = (Ca)vehicle;  //Downcating
		
	}

}
