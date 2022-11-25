package com.Hari;

public class methods {
		public boolean show()
		{
			int x = 5;
			int y = 6;
			if(x+y>14)
				return true;
			return false;
			
		}
	public static void main(String[] args) {
		methods obj = new methods();
		boolean z= obj.show();
		System.out.println(z);
	}
}
