package com.oj.test;

import java.util.Scanner;

public class JinZhi16To10 {
	 public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        while (in.hasNext()) {//注意while处理多个case
	            String str= in.next();
	            int len = str.length();
	            int res = 0;
	            for(int i = 2;i<len;i++){
	                switch(str.charAt(i)){
	                    case 'A':
	                		res +=10*Math.pow(16,len-1-i);
	                        break;
	                	case 'B':
	                		res +=11*Math.pow(16,len-1-i);
	                        break;
	                	case 'C':
	                		res +=12*Math.pow(16,len-1-i);
	                        break;                
	                	case 'D':
	                		res +=13*Math.pow(16,len-1-i);
	                        break; 
	                	case 'E':
	                		res +=14*Math.pow(16,len-1-i);
	                        break;
	                	case 'F':
	                		res +=15*Math.pow(16,len-1-i);
	                        break;
	                    default:
	                		res +=Integer.valueOf(new String(str.charAt(i)+""))*Math.pow(10,len-1-i);
	                		break;
	                }
	                	
	            }
	            System.out.println(res+"");
	        }
	    }
}
