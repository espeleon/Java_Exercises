package com.example.java;

public class StringClass {

    public static void main(String[] args) {

    String s1= "This is a String";
        System.out.println(s1);

    // lo hacemos ahora con un constructor
        String s2= new String("This is also a string");
        System.out.println(s2);

        // podemos concatenar y operar
        String s3= "Shirt size";
        String s4 = "M";
        String s5= s3 + s4 + ", Quantity: "+4;
        System.out.println(s5);

        // pasamos un array a String
        char[] chars= {'H', 'e', 'l', 'o'};
        String s6= new String(chars);
        System.out.println(s6);

        // ahora de un string a un array

        char [] chars2 = s6.toCharArray();
        // tenemos que recorrer el array con un for para imprimir cada caracter

        for (char c : chars2){
            System.out.println(c);
        }

    }
}
