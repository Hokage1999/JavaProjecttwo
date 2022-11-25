package computer;
public class RecordsExample {

  public static void main(String[] args) {

    Vehitle vehitle = new Vehitle("Mercedes", "UX 1238 A95");
   
    System.out.println( vehitle.brand() );
    System.out.println( vehitle.license() );

    System.out.println( vehitle.toString() );
    String x = vehitle.upperCase();
    System.out.println(x);
    String y = Vehitle.lowerCase(vehitle);
    System.out.println(y);
    

  }
}