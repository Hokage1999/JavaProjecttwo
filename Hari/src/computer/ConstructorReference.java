package computer;
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

}
