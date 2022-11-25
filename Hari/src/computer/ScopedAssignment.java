package computer;
class EFG
{
	static String method(String name)
	{
		return(name+"kathukalam");
	}
}
public class ScopedAssignment {

	public static void main(String[] args) {
		String s =null;
		s = (EFG.method("aHri".toLowerCase()));
		System.out.println(s);
		
	}

}
