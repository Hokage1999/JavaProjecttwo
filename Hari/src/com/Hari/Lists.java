package com.Hari;

import java.util.ArrayList;
import java.util.List;

public class Lists {

	public static void main(String[] args) {
		List<Integer>values = new ArrayList<>();
		values.add(2);
		values.add(3);
		values.set(0,4);
		values.add(1,456);
		System.out.println(values.get(0));
		System.out.println(values);

	}

}
