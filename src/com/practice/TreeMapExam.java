package com.practice;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExam {
    public static void main(String[] args) {
        TreeMap<Integer, String> scores = new TreeMap<>();
        scores.put(1, "명지");
        scores.put(2, "명지1");
        scores.put(3, "명지11");
        scores.put(4, "명지12");
        scores.put(5, "명지13");
        scores.put(6, "명지121");
        scores.put(7, "명지13");
        scores.put(18, "명1지1");
        scores.put(10, "명1지3");

        Map.Entry<Integer, String> entry = null;

        entry = scores.firstEntry();
        System.out.println(entry.getKey());

        entry = scores.lastEntry();
        System.out.println(entry.getKey() + entry.getValue());

        System.out.println(scores.lowerEntry(10));
        System.out.println(scores.higherEntry(10));
        System.out.println(scores.floorEntry(17));
        System.out.println(scores.ceilingEntry(8));
        System.out.println();

        while (!scores.isEmpty()) {
            entry = scores.pollFirstEntry();
            System.out.println(entry.getKey());
        }

    }
}
