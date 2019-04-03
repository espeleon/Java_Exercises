package com.example.java;

import java.util.Scanner;

public class Calculator
{
    public static void main(String[] args)
    {
// creamos el objeto de Scanner
        Scanner sc = new Scanner(System.in);

        // pedimos que introduzca el primer nº
        System.out.println("Introduce el primer número: ");
        // guardamos y asignamos el valor
        String input1 = sc.nextLine();
        // lo convertimos a número para poder usarlo
        double d1 = Double.parseDouble(input1);

        System.out.println("Introduce el segundo número: ");
        String input2 = sc.nextLine();
        double d2 = Double.parseDouble(input2);

        double result= d1 + d2;

        System.out.println("The answer is ... "+ result);


    }
}
