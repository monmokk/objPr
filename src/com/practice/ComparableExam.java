package com.practice;

import java.util.Iterator;
import java.util.TreeSet;

public class ComparableExam {
    public static void main(String[] args) {
        TreeSet treeSet = new TreeSet<>();
        treeSet.add(new Person("강명지", 30));
        treeSet.add(new Person("정지원", 31));
        treeSet.add(new Person("강명지", 20));
        treeSet.add(new Person("정지원", 32));
        treeSet.add(new Person("강민지", 36));

        Iterator<Person> iterator = treeSet.iterator();
        while (iterator.hasNext()) {
            Person person = iterator.next();
            System.out.println(person.name + ":" + person.age);
        }
    }
}
