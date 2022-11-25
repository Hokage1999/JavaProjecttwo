package computer;
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

}
