package com.practice;

import java.util.Stack;

public class StackExam {
    public static void main(String[] args) {
        Stack<Coin> coinBox = new Stack<>();

        coinBox.push(new Coin(100));
        coinBox.push(new Coin(1000));
        coinBox.push(new Coin(500));
        coinBox.push(new Coin(300));
        coinBox.push(new Coin(5300));
        coinBox.push(new Coin(1100));

        while (!coinBox.isEmpty()) {
            Coin coin = coinBox.pop();
            System.out.println(coin.getValue()+"원");
        }
    }
}
