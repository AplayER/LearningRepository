package com.oj.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class ReplaceSpace {
	public static void main(String[] args){
//		StringBuffer buffer = new StringBuffer("a dog is cute!");
//		String str = "a dog 1";
//		str=str.replace(" ", "%20");
//		System.out.println(str);
		int[] a = {1,4,6,7,9,2,3};
		print(Arrays.copyOfRange(a, 0,3));
		System.out.println(Integer.bitCount(1));
	}
	
	public static void print(int[] a){
		for (int i : a) {
			System.out.println(i);
		}
	}
}
