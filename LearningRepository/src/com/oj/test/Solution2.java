package com.oj.test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Solution2 {

	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		while (in.hasNext()) {
			int n = in.nextInt();
			int m = in.nextInt();
			int[] arr = new int[n];
			String[] strs = new String[m];
			HashMap<String,Integer> map = new HashMap<String, Integer>();
			
			for(int i = 0;i<n;i++){
				arr[i] = in.nextInt();
			}
			Arrays.sort(arr);
			for(int i = 0;i<m;i++){
				strs[i] = in.next();
				Integer value = map.get(strs[i]);
				if (value==null) {
					map.put(strs[i], 1);
				}else{
					map.put(strs[i], value+1);
				}
			}
			int[] values = new int[m];
			int p = 0;
			for(Integer integer:map.values()){
				values[p] = integer;
				p++;
			}
			Arrays.sort(values);
			int max=0;
			int min = 0;
			for(int i = 0;i<values.length;i++){
				min +=arr[i]*values[values.length-i-1]; 
			}
			for (int i = 0; i < values.length; i++) {
				max+=values[values.length-i-1]*arr[arr.length-1-i];
			}
			System.out.println(min+" "+max);
			
		}
	}

}
