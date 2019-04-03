package com.example.java;

public class Methods2
{
    // antes del main declaramos la variable, en este caso un array
    // y será static para poder utilizarlo

     static String [] months = {"January", "February", "March", "April",
            "May", "June", "July", "August", "September", "October",
            "November", "December"};


    public static void main(String[] args)
    {
        loopIt("Months of the year");
        loopIt("Second Round");
        loopIt("Third round");
    }

    static void loopIt(String label) // ahora le hemos pasado un parámetro
    {
        System.out.println(label); // imprimimos el valor de label que le pasaremos al declararlo

        // queremos poner un subrayado a lo largo de label
        for (int i = 0; i < label.length() ; i++)
        {
            System.out.print("*"); // print no println
        }
        System.out.println(" ");

        for (int i = 0; i < months.length; i++)
        {
            System.out.println(months[i]);
        }
    }

}
