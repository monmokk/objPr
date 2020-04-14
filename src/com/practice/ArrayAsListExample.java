package com.practice;

import java.util.Arrays;
import java.util.List;

public class ArrayAsListExample {
    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("명지", "명지짱", "헤에?");
        for (String mj : list1) {
            System.out.println(mj);
        }

        List<Integer> list2 = Arrays.asList(1, 2, 3);
        for (int value : list2) {
            System.out.println(value);

        }
    }
}
