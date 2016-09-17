package com.oj.test;
import java.util.*;
public class TopMinK {

	public static void main(String[] args) {
		int[] input = {1,4,3,7,9,2,0};
		ArrayList<Integer> list = new TopMinK().GetLeastNumbers_Solution(input, 3);
		for (Integer integer : list) {
			System.out.println(integer);
		}
//		new TopMinK().getMinK(input, 0, input.length-1, 0);
//		for (int i : input) {
//			System.out.println(i);
//		}
	}
	public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        if(k>input.length) return list;
        getMinK(input,0,input.length-1,k);
        for(int p=0;p<k;p++){
            list.add(input[p]);
        }
        return list;
        
    }
    public void getMinK(int[] arr,int left,int right,int k){
        if(left<right){
            int p = partition(arr,left,right);
            if(p>=k) getMinK(arr,left,p-1,k);
            else{
                getMinK(arr,left,p-1,k);
                getMinK(arr,p+1,right,k);
            }
        }
    }
    public int partition(int[] arr,int left,int right){
        int i=left;
        int j=right;
        int pData=arr[left];
        while(i<j){
            while(i<j&&pData<arr[j]){
                j--;
            }
            arr[i] = arr[j];
            while(i<j&&pData>arr[i]){
                i++;
            }
            arr[j] = arr[i];
        }
        arr[i]=pData;
        return i;
    }

}
