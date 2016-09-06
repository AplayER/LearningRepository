package com.oj.test;

import java.util.Scanner;

public class UpperToBackward {
	 public static void main(String[] args){
	        Scanner in = new Scanner(System.in);
	        String str;
	        while(in.hasNext()){
	            if((str=in.next()).length()!=0){
	                System.out.println(upperToBackford(str));
	            }
	        }
	    }
	    public static String upperToBackford(String str){
	        char[] s = str.toCharArray();
	        for(int i=0;i<s.length;i++){
	            for(int j=0;j<s.length-i-1;j++){
	                if(s[j]>=65&&s[j]<=90&&s[j+1]>=97&&s[j+1]<=122){
	                    char tmp = s[j];
	                    s[j] = s[j+1];
	                    s[j+1] = tmp;

	                }
	            }
	        }
	        return new String(s);
	    }
}
