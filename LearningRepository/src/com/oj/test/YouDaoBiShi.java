package com.oj.test;

import java.util.LinkedList;
import java.util.Scanner;


public class YouDaoBiShi {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		while (N-->0) {
			int k = in.nextInt();
			print(solution(k));
		}
		
	}
	
	public static int[] solution(int k){
		
		LinkedList<Integer> queue = new LinkedList<Integer>();
		
		int[] res = new int[k];
		for(int i = k;i>0;i--){
			queue.addFirst(i);
		}
		int j = 0;
		while(!queue.isEmpty()){
			int x = queue.peekLast();
			queue.pollLast();
			queue.addFirst(x);
			
			x = queue.peekLast();
			res[j] = x;
			queue.pollLast();
			j++;
		}
		
		int arr[] = new int[res.length];
		for (int i = 0; i < arr.length; i++) {
			arr[res[i]-1] = i+1;
		}

		return arr;
	}
	
	public static void print(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[arr.length-1-i]+" ");
        }
         System.out.println();
    }

}
