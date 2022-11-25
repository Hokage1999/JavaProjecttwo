package computer;
class V {

    String licensePlate = null;

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public String getLicensePlate() {
        return licensePlate;
    }
}
class Z extends V {

    protected String licensePlate = null;

    @Override
    public void setLicensePlate(String license) {
        super.setLicensePlate(license);
    }

    @Override
    public String getLicensePlate() {
        return super.getLicensePlate();
    }

    public void updateLicensePlate(String license){
        this.licensePlate = license;
    }
    public String returnLicensePlate(){
        return licensePlate;
    }
}

public class Fields {

	public static void main(String[] args) {
		Z car = new Z();

		car.setLicensePlate("123");
		car.updateLicensePlate("abc");

		System.out.println("license plate: "
		        + car.getLicensePlate());
		
		System.out.println("license plate: "
		        + car.returnLicensePlate());
	}

}
