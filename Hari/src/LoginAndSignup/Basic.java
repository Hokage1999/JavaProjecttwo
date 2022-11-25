package LoginAndSignup;
import java.util.ArrayList;
import java.util.Scanner;
public class Basic {
	public static void main(String[] args) {
		ArrayList<Credentials>lis = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter 1 to signup and 2 to exit");
		int x =sc.nextInt();
		sc.nextLine();
		while(x==1)
		{
		String name = sc.nextLine();
		String pass = sc.nextLine();
		String reenterPas =sc.nextLine();
		String email =sc.nextLine();
		if(pass.equals(reenterPas))
		{
		Credentials a = new Credentials(name,pass,email);
		lis.add(a);
		a.signup(name,pass,lis,a);
		System.out.println("enter 1 to continue and 2 to exit");
		x =sc.nextInt();
		sc.nextLine();
		}
		else
		{
			System.out.println("re pass is wrong");
			System.out.println("enter 1 to continue and 2 to exit");
			x =sc.nextInt();
			sc.nextLine();
		}
		}
		System.out.println(lis.toString());
	}
}
