package com.sort.demo;

public class MaxPQ {
	
	private Comparable[] arr;
	private int size=0;
	
	public MaxPQ(int capacity) {
		arr = new Comparable[capacity+1];
	}
	
	public void insert(Comparable a) throws Exception{
		
		if (size==arr.length-1) {
			throw new Exception("The inner container is full!");
		}
		this.arr[++size] = a;
		swim(arr, size);
		
		
	}
	
	public Comparable delMax() {
		Comparable max=arr[1];
		exch(arr, 1, size--);
		arr[size+1] = null;
		sink(arr, 1);
		return max;
	}
	
	public boolean isEmpty(){
		return size==0;
	}
	
	public int size(){
		return size;
	}
	
	private void exch(Comparable[] arr,int i, int j){
		Comparable tmp = arr[i];
		arr[i] = arr[j];
		arr[j] = tmp;
	}
	
	private void swim(Comparable[] arr,int i){
		while (i>0) {
			if (i/2>0&&arr[i].compareTo(arr[i/2])>0) {
				exch(arr, i, i/2);
				i= i/2;
			}else {
				break;
			}
		}
	}
	
	private void sink(Comparable[] arr,int i){
		while (2*i<=size) {
			int j = 2*i;
			if (j+1<=size&&arr[j].compareTo(arr[j+1])<0) {
				j= j+1;
			}
			if (arr[i].compareTo(arr[j])<0) {
				exch(arr, i, j);
				i=j;
			}else{
				break;
			}
		}
		
	}
	
	public static void sort(Comparable[] arr){
		MaxPQ pq = new MaxPQ(arr.length+1);
		try {
			for (int i = 0; i < arr.length; i++) {
				pq.insert(arr[i]);
			}
			for (int i = 0; i < arr.length; i++) {
				arr[i] = pq.delMax();
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

	public static void main(String[] args) throws Exception {
//		MaxPQ pq = new MaxPQ(100);
		Integer[] a = {2,5,3,8,9,7,1,10,6};
		MaxPQ.sort(a);
		for (Integer integer : a) {
			System.out.println(integer);
		}
//		for (int i = 0; i < a.length; i++) {
//			pq.insert(a[i]);
//		}
//		for (int i = 0; i < a.length; i++) {
//			System.out.println(pq.delMax());
//		}
	}

}

