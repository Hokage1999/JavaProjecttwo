package computer;

public class EscapeChar {

	public static void main(String[] args) {
		/*String s =new String("Hello\nworld");  
		String y =new String("Hello\"world\"");
		String z =new String("Hello\tworld");
		String a =new String("Hello\\world");
		String e =new String("Hello\'world");
		String f =new String("'Helloworld'");
		String r =new String("Hello\rworld");
		System.out.println(r);*/
		String string1 = "Hello World";

		String substring = string1.substring(0,5);
System.out.println(substring);

String text = "one two three two one";

boolean matches = text.matches(".*two.*");
System.out.println(matches);


		

	}

}
