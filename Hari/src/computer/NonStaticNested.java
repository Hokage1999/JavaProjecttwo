package computer;


class Outers
{
private String x ="try";
	class Inners
	{
		private String x ="fshjadb";
		public void show()
		{
			System.out.println("hi");
			System.out.println(Outers.this.x);
			System.out.println(x);
			
		}
	}
}
public class NonStaticNested {

	public static void main(String[] args) {
		Outers o = new Outers();
		Outers.Inners i = o.new Inners();
		//o.show();   undefined
		i.show();
	}
}
