package com.practice;

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class TreeMapExam3 {
    public static void main(String[] args) {
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("apple", 1);
        treeMap.put("cider", 2);
        treeMap.put("luv", 5);
        treeMap.put("tired", 10);
        treeMap.put("how to make", 2);
        treeMap.put("ariana", 4);

        NavigableMap<String, Integer> rangeMap = treeMap.subMap("c", true, "tired", true);
        for (Map.Entry entry : rangeMap.entrySet()) {
            System.out.println(entry.getKey());
        }
    }
}
