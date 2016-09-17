package com.oj.test;

import java.util.*;

/**
 * Created by WangJun on 2016/9/6.
 */
public class Solution4{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        //int[] tableMaxPeople = new int[n];
        ArrayList<Integer> tableMaxPeople = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            //tableMaxPeople[i] = sc.nextInt();
            tableMaxPeople.add(sc.nextInt());
        }
        ArrayList<Consumer> consumers = new ArrayList<>(m);
        for (int i = 0; i < m; i++) {
            consumers.add(new Consumer(sc.nextInt(), sc.nextInt()));
            //consumers[i] = new Consumer(sc.nextInt(), sc.nextInt());
        }
        Collections.sort(tableMaxPeople);
        Collections.sort(consumers, new Comparator<Consumer>() {
            @Override
            public int compare(Consumer o1, Consumer o2) {
                if (o1.c > o2.c) {
                    return -1;
                } else if (o1.c < o2.c) {
                    return 1;
                } else {
                    return 0;
                }
            }
        });
        int sum = 0;
        for (int i = 0; i < consumers.size(); i++) {
            Consumer con = consumers.get(i);

            for (int j = 0; j < tableMaxPeople.size(); j++) {
                if(con.b <= tableMaxPeople.get(j)){

                    sum += con.c;
                    tableMaxPeople.remove(j);
                    break;
                }
            }
        }
        System.out.print(sum);

    }

    static class Consumer {

        public Consumer(int b, int c) {
            this.b = b;
            this.c = c;
        }

        int b;//人数
        int c;//金额

    }


}

