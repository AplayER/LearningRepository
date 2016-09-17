package com.oj.test;

import java.util.concurrent.Executors;

public class Test {

	public static void main(String[] args) {
		int[] arr = {4,3,5,6,1};
		QSort(arr);
	}
	
	public static void QSort(int[] arr){
		if(arr.length==0) return;
		QSort(arr, 0, arr.length-1);
		for (int i : arr) {
			System.out.println(i);
		}
	}
	
	public static void QSort(int[] arr,int left,int right){
		if(left<right) {
			int i = partition(arr, left, right);
			QSort(arr, left, i-1);
			QSort(arr, i+1, right);
		}
		
	}
	
	public static int partition(int[] arr,int left,int right){
        int i=left;
        int j=right;
        int pData=arr[left];
        while(i<j){
            while(i<j&&pData<arr[j]){
                j--;
            }
            arr[i] = arr[j];
            while(i<j&&pData>arr[i]){
                i++;
            }
            arr[j] = arr[i];
        }
        arr[i] =pData;
        return i;
    }
	 public static void QuickSort(int[] num,int left,int right) {
	        if(num.length<=0) return;
	        //快拍是一种分治思想的排序，每次选取一个元素p，把序列分为两个部分，比p小的和比p大的，然后迭代
	        //直到有序为止
	        if(left<right) {
	            int p = num[left];
	            int low,high;
	            low = left;
	            high = right;
	            while (low<high) {
	                while (low<high&&num[high]>p) {
	                    high--;
	                }
	                num[low] = num[high];
	                while (low<high&&num[low]<p) {
	                    low++;
	                }
	                num[high] = num[low];
	            }
	            num[low] = p;
	            QuickSort(num, left, low-1);
	            QuickSort(num, low+1, right);
	        }
	    }

}
