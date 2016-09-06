package com.oj.test;

import java.util.*;
public class HuoYuJia{
    public static void main(String[] args){
//        Scanner in = new Scanner(System.in);
//        int x = in.nextInt();
//        int k = in.nextInt();
//        for(int i=1;;i++){
//            if(x+i==(x|i)){
//                k--;
//                if(k==0){
//                    System.out.println(i);
//                    break;
//                }
//            }
//        }
    	Scanner in = new Scanner(System.in);
        int n= in.nextInt();
        if(n<=0) return;
        String[] strs = new String[n];
        for (int i = 0; i < strs.length; i++) {
			strs[i] = in.next();
		}
//        for (String string : strs) {
//			System.out.println(string);
//		}
        final HashMap<Character,Integer> map = getEcho(strs);
        
        Character[] ch = new Character[strs[0].length()];
        int i = 0;
        for(Character c : map.keySet()){
            ch[i] = c; 
        }
        Arrays.sort(ch, new Comparator<Character>() {

			@Override
			public int compare(Character o1, Character o2) {
				if(map.get(o1)>map.get(o2)){
					return 1;
				}else if(map.get(o1)<map.get(o2)){
					return -1;
				}
				return 0;
			}
		});
        int sum = 0;
        for(int p = 0;p<strs.length;p++){
        	for(int q = 0;q<ch.length;q++){
        		char tmp = strs[p].charAt(q);
        		strs[p].replace(tmp,(char)getArrayIndex(ch, tmp));
        	}
        	System.out.println(strs[p]);
//        	sum+=Integer.valueOf(strs[p].trim());
        	
        }
        System.out.println(sum);
        
        
    }
    public static HashMap<Character,Integer> getEcho(String[] strs){
        HashMap<Character,Integer> map = new HashMap<>();
        int m = strs.length;
        int n = strs[0].length();
        int[][] s = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                s[i][j] = (int) Math.pow(10.0, n-j-1);
                Integer value=map.get(strs[i].charAt(j));
                if(value==null){
                    map.put(strs[i].charAt(j),s[i][j]);
                }else{
                    map.put(strs[i].charAt(j),value+s[i][j]);
                }
            }
        }
        return map;
        
    }
    
    public static int getArrayIndex(Character[] ch,Character c){
    	for(int i = 0;i<ch.length;i++){
    		if(c==ch[i]){
    			return i+1;
    		}
    	}
    	return ch.length+1;
    }
}