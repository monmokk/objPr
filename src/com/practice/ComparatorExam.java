package com.practice;

import java.util.TreeSet;

public class ComparatorExam {
    public static void main(String[] args) {
        /*TreeSet<Fruit> treeSet = new TreeSet<>();
        treeSet.add(new Fruit("사과", 1000));
        treeSet.add(new Fruit("배", 2000));
        treeSet.add(new Fruit("수박", 15000));
        treeSet.add(new Fruit("참외", 3000));
        treeSet.add(new Fruit("귤", 300000));
        treeSet.add(new Fruit("한라봉", 30000));
        treeSet.add(new Fruit("천혜향", 30000));
        */

        TreeSet<Fruit> treeSet = new TreeSet<>(new DescendingComparator());
        treeSet.add(new Fruit("사과", 1000));
        treeSet.add(new Fruit("배", 2000));
        treeSet.add(new Fruit("수박", 15000));
        treeSet.add(new Fruit("참외", 3000));
        treeSet.add(new Fruit("귤", 300000));
        treeSet.add(new Fruit("한라봉", 30000));
        treeSet.add(new Fruit("천혜향", 30000));

    }
}
