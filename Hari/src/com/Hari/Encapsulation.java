package com.Hari;
class finals
{
	 private String name;                      //encapsulation
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
public class Encapsulation {
	public static void main(String[] args) {
		finals obj = new finals();
		obj.setName("hari");
		String x = obj.getName();
		System.out.println(x);	
	}

}
