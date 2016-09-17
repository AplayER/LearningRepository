//package com.oj.test;
//
//import java.util.Arrays;
//import java.util.HashMap;
//import java.util.Scanner;
//
//public class Solution2 {
//
//	public static void main(String[] args) {
//		Scanner in= new Scanner(System.in);
//		while (in.hasNext()) {
//			int n = in.nextInt();
//			int m = in.nextInt();
//			int[] arr = new int[n];
//			String[] strs = new String[m];
//			HashMap<String,Integer> map = new HashMap<String, Integer>();
//			
//			for(int i = 0;i<n;i++){
//				arr[i] = in.nextInt();
//			}
//			Arrays.sort(arr);
//			for(int i = 0;i<m;i++){
//				strs[i] = in.next();
//				Integer value = map.get(strs[i]);
//				if (value==null) {
//					map.put(strs[i], 1);
//				}else{
//					map.put(strs[i], value+1);
//				}
//			}
//			int[] values = new int[m];
//			int p = 0;
//			for(Integer integer:map.values()){
//				values[p] = integer;
//				p++;
//			}
//			Arrays.sort(values);
//			int max=0;
//			int min = 0;
//			for(int i = 0;i<values.length;i++){
//				min +=arr[i]*values[values.length-i-1]; 
//			}
//			for (int i = 0; i < values.length; i++) {
//				max+=values[values.length-i-1]*arr[arr.length-1-i];
//			}
//			System.out.println(min+" "+max);
//			
//		}
//	}
//
//}
//public static void main(String[] args){
//    Scanner in = new Scanner(System.in);
//    int n = in.nextInt();
//    int m = in.nextInt();
//    int[] arr = new int[n];
//    for(int i=0;i<n;i++){
//        arr[i] = in.nextInt();
//    }
//    int[] persons = new int[m];
//    int[] money = new int[m];
//    for(int i=0;i<m;i++){
//        persons[i] = in.nextInt();
//        money[i] = in.nextInt();
//    }
//    
//    System.out.println(max);
//}
//
//public static void sort(int[] persons,int[] money){
//    int p = 0;
//    int min;
//    int tmp = 0;
//    for(int i=0;i<persons.length;i++){
//        min = Integer.MIN_VALUE;
//        for(int j=i;j<persons.length;j++){
//            if(min>persons[j]){
//                min = persons[j];
//                tmp = money[j];
//            }
//        }
//        persons[i] = min;
//        money[i] = tmp;
//    }
//}
