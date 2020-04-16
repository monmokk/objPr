package com.practice;

import java.util.Map;
import java.util.Scanner;

public class Hashtable {
    public static void main(String[] args) {
        Map<String, String> map = new java.util.Hashtable<>();

        map.put("mj", "91");
        map.put("mjk", "91");
        map.put("m", "whenever");

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("아이디, 비번 입력");
            System.out.println("id");
            String id = scanner.nextLine();
            System.out.println("pwd");
            String pwd = scanner.nextLine();
            System.out.println();
            if (map.containsKey(id)) {
                if (map.get(id).equals(pwd)) {
                    System.out.println("login");
                    break;
                } else {
                    System.out.println("failed");
                }
            }
        }
    }
}
