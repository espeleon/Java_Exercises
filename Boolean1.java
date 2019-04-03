package com.example.java;

public class Boolean1
{

    public static void main(String[] args) {
        boolean b1 = true;
        boolean b2 = false;

        System.out.println("The value of b1 is: " + b1);
        System.out.println("The value of b2 is: " + b2);

        boolean b3= !b1; // b3 vale la negación de b1, es decir, la negació  de verdadero=falso
        System.out.println("The value of b3 is: "+b3);

        int i1= 1; // 1 es // si es 1 b4 será verdadero, si es 0 será falso
        boolean b4= (i1 !=0);
        System.out.println("The value of b4 is: "+b4);

        String sBoolean= "True";
        boolean parsed= Boolean.parseBoolean((sBoolean));
        System.out.println("Parsed: "+parsed);

    }


}
