/*package computer;
interface ERS
{
	public String nameAge(String name);
}

public class StaticMethodReference {
		static String doFind(String name)
		{
			return name;
		}
	public static void main(String[] args) {
			ERS obj = StaticMethodReference::doFind;
			String z = obj.nameAge("winner");
			System.out.println(z);
	}

}*/
package computer;
interface ERST
{
	public String nameAge(String name);
}

public class InstanceMethodReference {
	public String doFind(String name)
	{
		return name;
	}
	public static void main(String[] args) {
		InstanceMethodReference obj = new InstanceMethodReference();
		ERST ob = obj::doFind;
		String z = ob.nameAge("chillbro");
		System.out.println(z);
	}

}
/*package computer;
interface Factory {
    public void getMessage(String message);
}
class Msg
{
	public Msg(String Message)
	{
		System.out.println(Message);
	}
}
public class ConstructorReference {

	public static void main(String[] args) {
		Factory fact = Msg::new;
		fact.getMessage("hello");	
		
	}
	
}*/


