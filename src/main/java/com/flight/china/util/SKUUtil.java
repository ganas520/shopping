package com.flight.china.util;

import java.util.Random;

public class SKUUtil {

	private static String[] letters = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
	
	public static String getSku() {
		Random random = new Random();
		int s = random.nextInt(23) + 1;
		int i=(int)(Math.random()*900)+100;
		return letters[s]+String.valueOf(System.currentTimeMillis())+i;
	}
}
