package com.blackjack;

public class RegexPractise {
    public static void main(String[] args) {
//        System.out.println("jat".matches("[^a-fA-F]at"));
//        System.out.println("123-123-1234".matches("\\d\\d\\d-\\d\\d\\d-\\d\\d\\d\\d"));
//        System.out.println("123-123-1234".matches("\\d{3}-\\d{3}-\\d{4}"));
        System.out.println("123-123-1234".matches("\\d{3}[-,]\\d{3}[-,]\\d{4}"));

    }
}
