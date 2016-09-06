package com.oj.test;

import java.util.Scanner;

public class FeiXingQi {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i = (int)Math.sqrt(n)+1;i>=0;i--){
            if(i*(i+1)<=n){
                System.out.println(i);
                break;
            }
        }
	}

}
