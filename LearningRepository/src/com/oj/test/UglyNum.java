package com.oj.test;

public class UglyNum {

	public static void main(String[] args) {
		int n = 74;
		System.out.println(GetUglyNumber_Solution(n));

	}
	public static int GetUglyNumber_Solution(int index) {
        int[] uglyNum;
        if(index<=5){
            uglyNum = new int[5];
        }else{
            uglyNum = new int[index];
        }
        
        for(int i=0;i<5;i++){
            uglyNum[i] = i+1;
        }
        int i=5;
        for(int num=6;i<index;num++){
            for(int j=i-1;j>0;j--){
                if(num%uglyNum[j]==0&&(num/uglyNum[j]==2||num/uglyNum[j]==3||num/uglyNum[j]==5)){
                    uglyNum[i] = num;
                    i++;
                    break;
                }
                    
            }
            
        }
        return uglyNum[index-1];
	}

}
