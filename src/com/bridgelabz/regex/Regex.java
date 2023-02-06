package com.bridgelabz.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {

    static Pattern pattern = Pattern.compile("[A-Z]{3}$");

    public static void main(String[] args) {
        String testString = "ABC";
        Matcher matcher = pattern.matcher(testString);
        if (matcher.matches()) {
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");
        }
    }
}

