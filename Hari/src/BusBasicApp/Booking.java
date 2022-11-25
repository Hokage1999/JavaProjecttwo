package BusBasicApp;

import java.util.List;
import java.util.Scanner;

public class Booking {
	String passengerName;
	String busNo;
	public Booking()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your name");
		passengerName = sc.nextLine();
		System.out.println("enter the busNo you want");
		busNo = sc.nextLine();
	}
	public boolean isAvailable(List<Booking>bookings, List<Bus>buses)
	{
		int cap = 0;
		for(Bus s:buses)
		{
			if(s.busNo.equals(busNo)&&s.capacity>0)
			{
				cap = s.capacity--;
			}
			
		}
		int booked = 0;
		for(Booking b:bookings)
		{
			if(b.busNo.equals(busNo))
			{
				booked++;
			}
		}
		if(cap>0)
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}
}
