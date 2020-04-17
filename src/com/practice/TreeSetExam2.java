package com.practice;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetExam2 {
    public static void main(String[] args) {
        TreeSet<Integer> scores = new TreeSet<>();
        scores.add(87);
        scores.add(88);
        scores.add(89);
        scores.add(90);
        scores.add(91);
        scores.add(92);

        NavigableSet<Integer> descendingSet = scores.descendingSet();
        for (Integer score : descendingSet) {
            System.out.println(score + " ");
        }
        System.out.println();

        NavigableSet<Integer> ascendingSet = descendingSet.descendingSet();
        for (int score : ascendingSet) {
            System.out.println(score + " ");
        }
    }
}
