package com.oj.test;

public class QuickSort {

	public static void main(String[] args) {
		int[] arr = {1,4,3,7,9,2,0};
		sort(arr, 0, arr.length-1);
		for (int i : arr) {
			System.out.println(i);
		}

	}
	public static void sort(int[] arr,int left,int right){
		if(left<right){
			int p = partition(arr, left, right);
			sort(arr, left, p-1);
			sort(arr, p+1, right);
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
        arr[i]=pData;
        return i;
    }

}
