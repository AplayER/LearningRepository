package com.sort.demo;

public class Heap {
	
	public static void sort(Comparable[] arr){
		int size = arr.length-1;
		for(int i=arr.length/2;i>=0;i--){
			sink(arr, i, size);
		}
		while (size>0) {
			Comparable tmp = arr[0];
			arr[0] = arr[size];
			arr[size] = tmp;
			size--;
			sink(arr, 1, size);
		}
		
	}
	
	public static void sink(Comparable[] arr,int i,int size){
		while (2*i+1<=size) {
			int j = 2*i+1;
			if (j+1<=size&&arr[j].compareTo(arr[j+1])<0) {
				j++;
			}
			if (arr[i].compareTo(arr[j])<0) {
				Comparable tmp = arr[i];
				arr[i] = arr[j];
				arr[j] = tmp;
				i=j;
			}else {
				break;
			}
		}
	}

	public static void main(String[] args) {
		Integer[] a = {2,5,3,8,9,7,1,10,6};
		Heap.sort(a);
		for (Integer integer : a) {
			System.out.println(integer);
		}
	}

}
