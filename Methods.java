package com.example.java;

public class Methods
{
    // antes del main declaramos la variable, en este caso un array
    // y será static para poder utilizarlo

     static String [] months = {"January", "February", "March", "April",
            "May", "June", "July", "August", "September", "October",
            "November", "December"};


    public static void main(String[] args)
    {
        loopIt();
    }

    static void loopIt()
    {
        for (int i = 0; i < months.length; i++)
        {
            System.out.println(months[i]);
        }
    }

}
