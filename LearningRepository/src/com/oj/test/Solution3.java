package com.oj.test;

import java.util.Arrays;
import java.util.Scanner;

public class Solution3 {

	public static void main(String[] args){
        int[] t = {1,3,2,4};
        int[] s = {1,3,2,4};
        sort(t, s);
        for (int i = 0; i < s.length; i++) {
			System.out.println();
		}
    }
	
	 public static void sort(int[] persons,int[] money){
	        int p = 0;
	        int min;
	        int tmp = 0;
	        for(int i=0;i<persons.length;i++){
	            min = Integer.MIN_VALUE;
	            for(int j=i;j<persons.length;j++){
	                if(min>persons[j]){
	                    min = persons[j];
	                    tmp = money[j];
	                }
	            }
	            persons[i] = min;
	            money[i] = tmp;
	        }
	    }
}
