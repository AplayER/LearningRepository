package com.oj.test;

import java.util.Arrays;

public class XingYunDaiZi {
	
	public static boolean isLucyBag(int[] ball){
		Arrays.sort(ball);
		long sum = 0;
		long product = 1;
		for (int i = 0; i < ball.length; i++) {
			sum +=ball[i];
			product *=ball[i];
		}
		if (sum>product) {
			return true;
		}else{
			return false;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
