package com.example.java;

import java.text.NumberFormat;

public class ConvertToString
{
    public static void main(String[] args) {

        // convertir int to string
        int intvalue = 42;
        String fromInt= Integer.toString(intvalue);
        System.out.println(fromInt);

        // convertir boolean to string
        boolean bollValue= true;
        String fromBool= Boolean.toString(bollValue);
        System.out.println(fromBool);


        // convertirn un long to string
        long longValue= 10_000_000;
        NumberFormat formatter= NumberFormat.getNumberInstance();
        String formatted= formatter.format(longValue);
        System.out.println(formatted);

    }
}
