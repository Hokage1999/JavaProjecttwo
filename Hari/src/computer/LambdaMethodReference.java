package computer;


interface ER
{
	public void nameAge(String name);
}
public class LambdaMethodReference {

	public static void main(String[] args) {
		/******************Normal lambda expression***************
		ER obj = (String s)->{System.out.println(s);};
		obj.nameAge("s");*/
		ER obj =  s->System.out.println(s);     ///konjam change aairukku
		obj.nameAge("sou");
		ER ob = System.out::println;      ///Methodreference
		ob.nameAge("hari");          
		
	}

}
