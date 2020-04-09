package com.heima.otherClass;

import java.util.Random;

public class Demo2_Random {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();
		
		for (int i = 0; i < 10; i++) {
//			System.out.println(r.nextInt());
			System.out.println(r.nextInt(100));
		}
	}

}
