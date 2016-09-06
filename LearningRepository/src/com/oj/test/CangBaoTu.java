package com.oj.test;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class CangBaoTu {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str1 = in.nextLine();
		String str2 = in.nextLine();
		if (solution(str1, str2)) {
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
		
	}
	
	public static boolean solution(String str1,String str2){
		if(str2==null) return true;
		char[] a1 = str1.toCharArray();
		char[] a2 = str2.toCharArray();
		int a =0;
		int b =0;
		while (a<a1.length) {
			if (a1[a++]==a2[b]) {
				b++;
				if (b==a2.length) {
					return true;
				}
			}
		}
		return false;
		
	}
	
	public int FirstNotRepeatingChar(String str) {
		LinkedHashMap<Character, Integer> hashMap = new LinkedHashMap<Character, Integer>();
		for(int i = 0;i<str.length();i++){
			if (hashMap.containsKey(str.charAt(i))) {
				int value = hashMap.get(str.charAt(i));
				hashMap.put(str.charAt(i), value+1);
			}else{
				hashMap.put(str.charAt(i), 1);
			}
		}
		for(Character c :hashMap.keySet()){
			if (hashMap.get(c)==1) {
				return str.indexOf(c);
			}
		}
		return -1;
	        
	}

}
