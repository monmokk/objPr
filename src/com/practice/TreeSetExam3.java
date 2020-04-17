package com.practice;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetExam3 {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("apple");
        treeSet.add("mj");
        treeSet.add("mjk");
        treeSet.add("jiwon");
        treeSet.add("luv");
        treeSet.add("hi");
        treeSet.add("you");

        NavigableSet<String> rangeSet = treeSet.subSet("a", true, "m", true);
        for (String word : rangeSet) {
            System.out.println(word);
        }
    }
}
