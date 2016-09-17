package com.oj.test;

public class Solution5 {

	public static void main(String[] args) {
		String test = "aabcccccaaa";
		String resString = zipString(test);
		System.out.println(resString);
	}
	
	public static String zipString(String iniString) {
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<iniString.length();i++){
            int count=0,j;
            for(j=i;j<iniString.length()-1;i++){
                char tmp = iniString.charAt(j);
                //count=0;
                if(iniString.charAt(j+1)==tmp){
                    count++;
                    continue;
                }else{
                    break;
                }
            }
            sb.append(iniString.charAt(i)+""+(count+1));
            i=j;
        }
        if(sb.length()>=iniString.length()) return iniString;
        else return new String(sb);
    }

}
