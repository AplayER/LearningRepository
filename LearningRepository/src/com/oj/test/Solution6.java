package com.oj.test;

public class Solution6 {

	 public static void main(String[] args){
	        int[] arr = {1, 6, 7,9,23,29};
	        System.out.println(find(arr,9));
	        
	    }
	    public static int find(int[] arr,int n){
	        int left = 0;
	        int right = arr.length;
	        int mid=0;
	        while(left<right){
	            mid = (left+right)/2;
	            if(arr[mid]>n){
	                right=mid-1;
	            }else if(arr[mid]<n){
	                left=mid+1;
	            }else{
	                return mid;
	            }
	        }
	        return -1;
	    }

}
