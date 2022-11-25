package computer;

public record Vehitle(String brand,String license) {   //
		public Vehitle(String brand)  ////extra constructor
		{
			this(brand, null);
		}
		public String upperCase()     ///public method
		{
			return brand.toUpperCase();
		}
		
		public static String lowerCase(Vehitle vehitle)    //static method
		{
			return vehitle.brand.toLowerCase();
		}
		
}
