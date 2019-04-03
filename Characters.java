package com.example.java;

public class Characters {

    public static void main(String[] args) {


    char c1 = '1';
    char c2 = '2';
    char c3 = '3';
    String c4 = "string";

        System.out.println("Char 1:"+ c1);
        System.out.println("Char 2:"+ c2);
        System.out.println("Char 3:"+ c3);
        System.out.println("Char 4:"+ c4);

    char dollarSign= '\u0024';
    System.out.println("Currency: " + dollarSign);

    char a1 = 'a';
    char a2 = 'b';
    char a3 = 'c';
    // no ponemos el ln en el print para que salga junto
        System.out.print(Character.toUpperCase(a1)); // lo pone en mayúsculas
        System.out.print(Character.toUpperCase(a2));
        System.out.println(Character.toUpperCase(a3));



    }
}
