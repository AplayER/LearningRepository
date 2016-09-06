package com.oj.test;

import java.util.Arrays;
import java.util.Scanner;

public class Solution3 {

	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		while (in.hasNextInt()) {
			int n = in.nextInt();
			int m = in.nextInt();
			int[] arr = new int[n+1];
			Arrays.fill(arr, Integer.MAX_VALUE);
			for(int i = 0;i<m;i++){
				int d = in.nextInt();
				int h = in.nextInt();
				arr[d] = h;
			}
			if(m==n){
				Arrays.sort(arr);
				System.out.println(arr[arr.length-1]);
			}
			for (int i = 0; i < arr.length-1; i++) {
				if(arr[i]!=Integer.MAX_VALUE&&arr[i+1]-arr[i]<=1||
						arr[i+1]-arr[i]>=-1){
					continue;
				}else{
					System.out.println("IMPOSSIBLE");
					break;
				}
			}
		}
	}

}
