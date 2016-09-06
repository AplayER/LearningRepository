package com.oj.test;

import java.util.ArrayList;
import java.util.Scanner;

public class QianMXiang {

	public static void main(String[] args){
    	Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        int count = 0;
        for(int i = m;i<=n;i++){
        	int[] tmp = new int[3];
            tmp[0] = i%10;
            tmp[1] = (i/10)%10;
            tmp[2] = (i/100);
            System.out.println(tmp[0]);
            System.out.println(tmp[1]);
            System.out.println(tmp[2]);

            
            if(tmp[0]*tmp[0]*tmp[0]+tmp[1]*tmp[1]*tmp[1]+tmp[2]*tmp[2]*tmp[2]==i){
                  list.add(i);
            }
        }
        if(list.size()==0) System.out.println("no");
        else{
              for(int i = 0;i<list.size()-1;i++){
              	System.out.print(list.get(i)+" ");
              }
              System.out.print(list.get(list.size()-1));
        }
    }

}
