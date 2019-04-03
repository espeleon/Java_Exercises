package com.example.java;



import java.util.Scanner;

public class Calculadora2
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first value:");
        String input1 = sc.nextLine();
        double d1 = Double.parseDouble(input1);

        System.out.println("Enter the second value:");
        String input2 = sc.nextLine();
        double d2 = Double.parseDouble(input2);

        System.out.println("Choose an operation ( + - * /:");
        String operation = sc.nextLine();

        switch (operation)
        {
            case "+":
                System.out.println("The result is: "+ (d1+d2));
                break;
            case "-":
                System.out.println("The result is: "+ (d1-d2));
                break;
            case "*":
                System.out.println("The result is: "+ (d1*d2));
                break;
            case "/":
                System.out.println("The result is: "+ (d1/d2));
                break;
            default:
                System.out.println("Wrong option");
        }

    }




}
