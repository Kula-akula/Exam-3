package com.company.Task_1;

import java.util.HashSet;

public class Task_1 {
    public static void main(String[] args) {
        HashSet<Integer> setList = new HashSet<>();
        int[] array = new int[100];
        for (int i = 0; i < 100; i++) {
            array[i] = i + 1;
            if (array[i] % 2 == 0) {
                if (array[i] % 5 == 0)
                    setList.add(array[i]);
            }
        }
        for (Integer i:array){
            if (i%2==0)setList.add(i);
        }
//        System.out.println(setList);
//        System.out.println(setList.size());

    }
}
