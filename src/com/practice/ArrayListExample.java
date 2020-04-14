package com.practice;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("명지");
        list.add("명지짱");
        list.add("명지쨩 카와이");
        list.add(2, "mjkkk");
        list.add("이거 언제까지 넣냐");

        int size = list.size();
        System.out.println(size);
        System.out.println();

        String skill = list.get(2);
        System.out.println(skill);
        System.out.println();

        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i);
            System.out.println(i+": " + str);
        }
        System.out.println();

        list.remove(2);
        list.remove(2);
        list.remove("명지");

        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i);
            System.out.println(i+": "+str);
        }
    }
}
