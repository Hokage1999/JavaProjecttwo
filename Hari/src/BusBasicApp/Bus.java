package BusBasicApp;

import java.util.List;

public class Bus {
	public String busNo;
	public boolean ac;
	public int capacity;
	
	public Bus(String busNo, boolean ac, int capacity) {
		super();
		this.busNo = busNo;
		this.ac = ac;
		this.capacity = capacity;
	}

	public  static void displayBusInfo(List<Bus>buses )
	{
		for(Bus b:buses)
		{
			System.out.println("BusNo:"+b.busNo+" "+"AC:"+b.ac+" "+"Capacity:"+b.capacity);
		}
	}
	
	
	
	


}
