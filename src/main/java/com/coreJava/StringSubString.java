package com.coreJava;

public class StringSubString {
    public static void main(String[] args) {
        String inputString = "Your input string, with a trailing comma";

        System.out.println("Output String: " + removeTrailingComma(inputString));
    }

    private static String removeTrailingComma(String input) {
        return input.replaceAll(",$", "");
    }
}
