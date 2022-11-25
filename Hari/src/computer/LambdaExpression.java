package computer;

import java.lang.reflect.AccessibleObject;

interface E
{
	public void nameAge(String name,String age);
}
interface X
{
	public boolean add(int a,int b);
}
public class LambdaExpression {

	public static void main(String[] args) {
		
		E obj = (String name,String age)->System.out.println(name+" "+age);
		obj.nameAge("hari", "24");
		
		/************Return type**************/
		X ob = (a1, a2) -> { return a1 > a2; };
		System.out.println(ob.add(4, 6));
		
		
		
		/*************SIngle param**************
		 * E obj = name->System.out.println(name+" ");
		 
		obj.nameAge("hari");*/
		/******************Anonymous class****************/	
		/*E obj = new E(){
				public void nameAge(String name,String age){
					System.out.println(name+" "+age);
				}
				};
				obj.nameAge(name,age);*/
	}

}
