package com.oj.test;

public class ZhiChuXianYiCi {

	public static void main(String[] args) {
		int[] arr = {2,4,3,6,3,2,5,5};
		int[] num1 = new int[1];
		int[] num2 = new int[1];
		new ZhiChuXianYiCi().FindNumsAppearOnce(arr, num1, num2);
		System.out.println(num1[0]);
		System.out.println(num2[0]);
	}
	public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
        if(array.length<=0) return;
        num1[0] = 0;
        for(int i=0;i<array.length;i++){
            num1[0] = num1[0]^array[i]; 
        }
        int res = 0;
        int count = 0;
        while(res==0){
            res = num1[0]%2;
            num1[0]/=2;
            count++;
        }
        num1[0] =0;
        num2[0] =0;
        for(int i=0;i<array.length;i++){
            if(array[i]/(Math.pow(2,count))%2==1){
                num1[0] ^=array[i];
            }else{
                num2[0] ^=array[i];
            }
        }
        
    }

}
