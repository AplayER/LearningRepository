package com.oj.test;

import java.util.HashSet;
import java.util.Scanner;

public class YuanLiao {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		String line;
		while ((line=in.nextLine()).length()!=0) {
			sb.append(line+" ");
		}
		String str = new String(sb).trim();
		System.out.println(str);

		String[] strs = str.split(" ");
		HashSet<String> set = new HashSet<String>();
		for (String string : strs) {
			set.add(string.toUpperCase());
		}
		System.out.println(set.size());
	}

}
