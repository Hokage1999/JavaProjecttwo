package com.Hari;

import java.util.ArrayList;
import java.util.List;

public class ListLoop {

	public static void main(String[] args) {
		List<Integer>list = new ArrayList<>();
		list.add(0);
		list.add(1);
		for(int i=0;i<list.size();i++)
		{
			System.out.println(i+":"+list.get(i));
		}
	}

}
