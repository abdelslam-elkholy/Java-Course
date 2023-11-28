package com.blackjack;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexPractise {
    public static void main(String[] args) {
//        System.out.println("jat".matches("[^a-fA-F]at"));
//        System.out.println("123-123-1234".matches("\\d\\d\\d-\\d\\d\\d-\\d\\d\\d\\d"));
//        System.out.println("123-123-1234".matches("\\d{3}-\\d{3}-\\d{4}"));
//        System.out.println("123-123-1234".matches("\\d{3}[-,]\\d{3}[-,]\\d{4}"));
//        System.out.println("123-  123-1234".matches("\\d{3}[-,\\s.]+\\d{3}[-,]\\d{4}"));
//        System.out.println("123123-1234".matches("\\d{3}[-,\\s.]*\\d{3}[-,]\\d{4}"));
//        System.out.println("123123-1234".matches("\\d{3}[-,\\s.]?\\d{3}[-,]\\d{4}"));
        String regex = "(\\d{3,4}[-,\\s.]?){2}\\d{4,}";
        String string = "1231243-12445";

        System.out.println(string.matches(regex));

        Pattern pat = Pattern.compile(regex);
        Matcher mat = pat.matcher(string);

        if(mat.matches()){
            System.out.println(mat.group(1));
            System.out.println(mat.group(2));
        }
    }
}
