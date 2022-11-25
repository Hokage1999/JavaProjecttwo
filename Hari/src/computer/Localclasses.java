package computer;

class General {
	private String x ="fshjadb";
    public void printText() {

          class Local {  //Illegal modifier for the local class Local; only abstract or final is permitted
        	private String x ="dsfj";
    		public void show(int y)   //dont want final here
    		{
    			//only final is permiited private String x ="hai";
    			final String x ="gjasdg";
    			System.out.println("hi");	
    			System.out.println(x);

    			System.out.println(y);
    		}
        }

        Local local = new Local();
        local.show(5);
    }

}
public class Localclasses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			General gen = new General();
			gen.printText();
	}

}
