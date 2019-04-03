package com.example.java;

public class ComparingString {
    public static void main(String[] args) {

        String str1 = "Hello ";
        String str2 = "World";
        String str4 = str1 + str2;
        String str5 = "Hello World";

        if (str4.equalsIgnoreCase(str5)) {
            System.out.println("They Match!");
        } else {
            System.out.println(("They DON'T Match!"));
        }
    }
}
