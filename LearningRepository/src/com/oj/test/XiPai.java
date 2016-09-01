package com.oj.test;

import java.util.Arrays;
import java.util.Scanner;

public class XiPai{
    public static void main(String[] str){
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        while(N-->0){
            int len = in.nextInt();
            int k = in.nextInt();
            int[] arr = new int[2*len];
            for(int i = 0;i<arr.length;i++){
                arr[i] = in.nextInt();
            }
            while(k-->0){
                arr = flush(arr);
            }
            print(arr);
            
        }
    }
    
    public static int[] flush(int[] arr){
        int len = arr.length;
        int[] tmp1 = Arrays.copyOfRange(arr,0,len/2);
        int[] tmp2 = Arrays.copyOfRange(arr,len/2,len);
//        print(tmp1);
//        print(tmp2);
        for(int i=0;i<len/2;i++){
            arr[2*i] = tmp2[len/2-i-1];
            arr[2*i+1] = tmp1[len/2-i-1];
        }
        arr = reverse(arr);
        return arr;
    }
    
    public static int[] reverse(int[] arr){
        int len = arr.length;
        for(int i = 0;i<len/2;i++){
            arr[i] = arr[i]+arr[len-i-1];
            arr[len-i-1] = arr[i]-arr[len-i-1];
            arr[i] = arr[i]-arr[len-i-1];
        }
        return arr;
}
    
    public static void print(int[] arr){
        for(int i:arr){
            System.out.print(i+" ");
        }
         System.out.println();
    }
}