package com.oj.test;

public class OnesNum {

	public static void main(String[] args) {
		String str = "s";
		System.out.println(str.contains("s"));
		int count=0;
		int n=20;
    	for(int i=1;i<=n;i++){
            if((""+i).contains("1")){
                count++;
            }
        }
    	StringBuilder sb = new StringBuilder();
    	
    	System.out.println(count);

	}

}
