package com.oj.test;

import java.util.Arrays;


public class KMP {
	
	public void kmpMatch(String str1,String str2){
		
	}
	
	public int[] getNext(String str){
		char[] letters = str.toCharArray();
		int[] next = new int[str.length()];
		next[0] = 0;
		next[1] = 1;
		for (int i = 2;i<str.length();i++) {
			int j=i-1;
			while(j>=0){
				
				if (new String(Arrays.copyOfRange(letters, 0, j)).equals
					(new String(Arrays.copyOfRange(letters, i-j, i)))) {
					next[i] = j+1;
					break;
				}
//				String str1 = new String(Arrays.copyOfRange(letters, 0, j));
//				String str2 = new String(Arrays.copyOfRange(letters, i-j, i));
//				System.out.println(str1+"  "+str2);
//						if (str1.equals(str2)) {
//								next[i] = j+1;
//								break;
//							}
					j--;
				
			}
			if(j==0) next[i] = 1;
		}
		return next;
	}

	public static void main(String[] args) {
		String str = "abaabcac";
		char[] a = {'a','b'};
		char[] b = {'a','b'};
		;
		for (char c : Arrays.copyOfRange(a, 0, 1)) {
			System.out.println(c);
		}
//		int[] next = new KMP().getNext(str);
//		for (int i : next) {
//			System.out.println(i);
//		}

	}

}
