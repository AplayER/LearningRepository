package com.sort.demo;

public class Quick {
	
	public static void sort(Comparable[] a){
		sort(a, 0, a.length-1);
	}
	
	public static void sort(Comparable[] a,int left,int right){
		Comparable p = a[left];
		int low = left;
		int high = right;
		if(left<right) {
			while (left<right&&a[high].compareTo(p)>0) {
				high--;
			}
			a[low] = a[high];
			while (left<right&&a[low].compareTo(p)<0) {
				low++;
			}
			a[high] = a[low];
		}
		a[low] = p;
		sort(a, left, low-1);
		sort(a, low+1, right);
	}

	public static void main(String[] args) {
		Integer[] a = {new Integer(5),new Integer(3),new Integer(6),new Integer(8),
				new Integer(1),new Integer(2)};
		Quick.sort(a);
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		
	}

}
