package BusBasicApp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BusMain {

	public static void main(String[] args) {
		 List<Bus>buses = new ArrayList<>();
		List<Booking>bookings = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		Bus Bus1 = new Bus("1",true,3);
		Bus Bus2 = new Bus("2",false,2);
		Bus Bus3 = new Bus("3",true,3);
		buses.add(Bus1);
		buses.add(Bus2);
		buses.add(Bus3);
		
		System.out.println("press 1 to book and 2 to exit");
		int n =sc.nextInt();
		sc.nextLine();
		while(n==1)
		{
			System.out.println("you can start booking and the buses list are: ");
			Bus.displayBusInfo(buses);
			Booking booking = new Booking();
			if(booking.isAvailable(bookings,buses))
			{
				bookings.add(booking);
				System.out.println("Booked");
			}
			else
			{
				System.out.println("sry Seats are full");
			}
			System.out.println("press 1 to book and 2 to exit");
			n =sc.nextInt();
			sc.nextLine();
		}

	}

}
