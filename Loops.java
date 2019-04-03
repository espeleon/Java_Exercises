package com.example.java;

public class Loops
{

    public static void main(String[] args)
    {

        String [] months = {"January", "February", "March", "April",
        "May", "June", "July", "August", "September", "October",
        "November", "December"};

        // bucle for
        for (int i = 0; i < months.length; i++)
        {
            System.out.println(months[i]);
        }
        System.out.println("\n");
         // bucle for descendiente
        for (int i = months.length-1; i >= 0; i--)
        {
            System.out.println(months[i]);
        }

        System.out.println("\n -------------------");

        // for each loop

        for (String month: months)
        {
            System.out.println(month);
        }

        System.out.println("\n -------------------");

        // while loop

        int counter = 0;
        while (counter < months.length)
        {
            System.out.println(months[counter]);
            counter ++;
        }

        System.out.println("\n -------------------");

        // do while loop

        int counter2 = 0;
        do {
            System.out.println(months[counter2]);
            counter2++;
        }
        while (counter2 < months.length);


    }
}
