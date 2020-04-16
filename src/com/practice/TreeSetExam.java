package com.practice;

import java.util.TreeSet;

public class TreeSetExam {
    public static void main(String[] args) {
        TreeSet<Integer> scores = new TreeSet<>();
        scores.add(91);
        scores.add(90);
        scores.add(100);

        Integer score = null;

        score = scores.first();
        System.out.println(score);

    }
}
