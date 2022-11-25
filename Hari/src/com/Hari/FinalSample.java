package com.Hari;
class FinalSampleTestDrive
{
	private String name;
	private String age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
}

public class FinalSample {

	public static void main(String[] args) {
		final FinalSampleTestDrive obj = new FinalSampleTestDrive();
		
		FinalSampleTestDrive obj1 = new FinalSampleTestDrive();
		
		FinalSampleTestDrive obj2 = new FinalSampleTestDrive();
		
		obj.setName("winner");   //we can change the values inside referencing object.
		obj.setName("man");
		obj1.setName("hari");
		obj2 = obj1;
	//	obj = obj1;   //It cannot be done because obj variable refering an object is final,so we cannot change the value of it.but we can change the values inside referencing object. 
		System.out.println(obj.getName());
		System.out.println(obj1.getName());
		System.out.println(obj2.getName());

	}

}
