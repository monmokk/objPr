package com.practice;

import java.util.HashMap;
import java.util.Map;

public class HashMapExam2 {
    public static void main(String[] args) {
        Map<Student, Integer> map = new HashMap<>();

        map.put(new Student(1, "mj"), 91);
        map.put(new Student(1, "mjk"), 90);

        System.out.println(map.size());

    }
}
