package com.oj.test;

import java.util.HashSet;
import java.util.Scanner;

public class IsPrime {

	public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] A = new int[n];
        int i=0;
        while(i<n){
           A[i] = in.nextInt();
           i++;
        }
        
        System.out.println(solution(A));
        
    }
   
    public static int solution(int[] A){
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<A.length;i++){
            if(set.contains(Math.abs(A[i]))){
                continue;
            }else{
                set.add(Math.abs(A[i]));
            }
        }
        return set.size();
    }
    
}
