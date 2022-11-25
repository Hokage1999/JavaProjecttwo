package computer;
interface Finder
{
	public int nameAge(String name,String nameu);
}

public class ParameterReference {
		
	public static void main(String[] args) {
		Finder finder = String::indexOf;
		//@S2C Finder finder = (s1, s2) -> s1.indexOf(s2);
		String s1 = "haraaaaaati";
		String s2 = "a";
		int x = finder.nameAge(s1,s2);
		System.out.println(x);
		var y =32;
		System.out.println(y);
	}
}