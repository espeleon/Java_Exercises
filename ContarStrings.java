package com.example.java;

public class ContarStrings
{
    public static void main(String[] args)
    {
        // para contar los caracteres de un string
        String s1= "Welcome to California!";
        System.out.println("Length of string: "+ s1.length());

        // para saber la posición de una palabra (ojo empieza en 0)
        int position = s1.indexOf("California");
        System.out.println("Posición: " + position);

        // para extraer una palabra por la posición
        String sub = s1.substring(11);
        System.out.println(sub);

        // para extraer los espacios en blanco al contar
        String s2 = "Welcome       !";
        int len1= s2.length();
        System.out.println(len1);
        String s3 = s2.trim();   // con trim sacamos los espacios en blanco
        System.out.println(s3.length());

    }
}
