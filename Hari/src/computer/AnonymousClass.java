package computer;
class SuperClass
{
	String text  ="saghd";
	public void doIt() {
        System.out.println("class doIt()");
    }
}
public class AnonymousClass {

	public static void main(String[] args) {

		SuperClass instance = new SuperClass() {
			private String text;

		    {  this.text = "textToPrint";  }

		    public void doIt() {
		        System.out.println("Anonymous class doIt()");
		        System.out.println(this.text);
		    }
		};
		
		instance.doIt();

	}

}
