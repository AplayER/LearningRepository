package com.oj.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ZUIXiaoDeShu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
public String PrintMinNumber(int [] numbers) {
        
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<numbers.length;i++){
            list.add(numbers[i]);
        }
        
        Collections.sort(list, new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				String str1 = o1+""+o2;
				String str2 = o2+""+o1;
				return str1.compareTo(str2);
			}
		});
        String res="";
        for (Integer integer : list) {
			res += integer;
		}
        return res;

    }

}
