package com.performence.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Queue;

public class FibImpl {
	
	private volatile int m;
	public int Fib(int n){
		if (n==0) {
			return 0;
		}
		if (n==1) {
			return 1;
		}
		return Fib(n-1)+Fib(n-2);
	}
	
	
	public void doTest(){
		int l;
		long then = System.currentTimeMillis();
		for (int i = 0; i < 15; i++) {
			l = Fib(i);
		}
		long now = System.currentTimeMillis();
		System.out.println("The running time is " + (now-then));
		
	}
	
	public void doContrast(){
		
		long then = System.currentTimeMillis();
		for (int i = 0; i < 15; i++) {
			m = Fib(i);
		}
		long now = System.currentTimeMillis();
		System.out.println("The running time is " + (now-then));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FibImpl fibImpl = new FibImpl();
		fibImpl.doTest();
		fibImpl.doContrast();
		String jvmPropertys = System.getProperties().toString();
		String[] jvmProperties = jvmPropertys.split(",");
		for (String string : jvmProperties) {
			System.out.println(string);
		}
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(11);
		list.add(22);
		list.add(33);
		list.add(1, 115);
		System.out.println("list");
		for (Integer integer : list) {
			System.out.println(integer);
		}
		int[] a = {1,2,3,4,5};
		int[] b =Arrays.copyOfRange(a, 0,1 );
		for (int i : b) {
			System.out.println(i);
		}
		Integer integer =2;
		System.out.println((double)integer);
 	}

}
