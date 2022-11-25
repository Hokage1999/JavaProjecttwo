/*package computer;
interface ABCD
{
	public String create(String name);
}
public class LocalVariableCapture {

	public static void main(String[] args) {
		String z = "hariiyom";                    //Local variable capture
		ABCD abcd = (name)->{return name+":"+z;};
		String x = abcd.create("hari");
		System.out.println(x);
	}

}*/
/*package computer;
interface ABCD
{
	public String create(String name);
}
public class LocalVariableCapture {
	static String z = "hariiyom";                    //static  variable capture
	public static void main(String[] args) {
		
		ABCD abcd = (name)->{return name+":"+z;};
		String x = abcd.create("hari");
		System.out.println(x);
	}

}*/
package computer;
interface ABCD
{
	public String create(String name);
}
public class LocalVariableCapture {
	String z = "hariiyom";                    //instance  variable capture
	public static void main(String[] args) {
		LocalVariableCapture instance = new  LocalVariableCapture();
		ABCD abcd = (name)->{return name+":"+instance.z;};
		String x = abcd.create("hari");
		System.out.println(x);
	}

}