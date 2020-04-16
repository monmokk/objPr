package com.practice;

import java.util.HashSet;
import java.util.Set;

public class HashSetExam2 {
    public static void main(String[] args) {
        Set<Member> set = new HashSet<>();

        set.add(new Member("명쥐쓰", 30));
        set.add(new Member("명쥐", 30));

        System.out.println("총 객체수 : "+set.size());
    }
}
