package com.devix.www;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        String candidateString = "This is a Java example.This is another Java example.";
        Pattern pattern = Pattern.compile("Java");

        Matcher matcher = pattern.matcher(candidateString);
        matcher.find();
        int nextIndex = matcher.end();

        System.out.println("The last index of Java is");
        System.out.println(nextIndex);
    }
}
