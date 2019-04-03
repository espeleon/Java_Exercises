package com.example.java;

import java.util.Scanner;

public class OverloadMethods
{

    public static void main(String[] args)
    {
        // asignamos a la variable s1 la función para recoger info
        String s1= getInput("Enter Value 1: ");
        String s2 = getInput("Enter value 2: ");
        String s3 = getInput("Enter value 3: "); // añadido para el segundo método


        double result = addValues(s1, s2);
        System.out.println("The answer is "+ result);

        // para el segundo método ponemos esto
        double result2 = addValues(s1, s2, s3);
        System.out.println("The answer is "+ result2);

        // para el método con parámetros n
        double result3 = addValues(s1, s2, s3, s1, s2, s3);
        System.out.println("The answer finally is "+ result3);
    }

    // creamos un método para recoger información de teclado

    static String getInput (String prompt)
    {
        System.out.print(prompt);
        Scanner sc = new Scanner((System.in));

        return sc.nextLine();
    }

    // creamos un método q añade los valores

    static double addValues( String s1, String s2)
    {
        double d1= Double.parseDouble(s1); // convertimos
        double d2= Double.parseDouble(s2); // convertimos
        double result = d1 + d2; // hacemos la operación
        return result;
    }

    // utilizamos la anterior pero le añadimos otro parámetro

    static double addValues( String s1, String s2, String s3)
    {
        double d1= Double.parseDouble(s1); // convertimos
        double d2= Double.parseDouble(s2); // convertimos
        double d3= Double.parseDouble(s3);
        double result= d1 + d2+ d3; // hacemos la operación
        return result;
    }

    // método con indeterminados parámetros
    static double addValues (String ... values)
    {
        double result = 0; // creamos variable donde iremos guardando
        for (String value : values)
        {
            double d = Double.parseDouble(value);
            result += d; // iremos añadiendo a result lo que vaya saliendo del loop
        }
            return result;

    }


}
