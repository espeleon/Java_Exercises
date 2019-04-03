package com.example.java;
import java.util.Arrays;
public class ArraysTypes
{

    public static void main(String[] args)
    {

        System.out.println("Array of primitives");
        int[] ints = {9, 6, 3}; // create array
        Arrays.sort(ints); // order array
        for (int i= 0; i < ints.length; i++)  // recorrer array
        {
            System.out.println(ints[i]);   // print all the elements of the array
        }


        System.out.println("Array of strings");
        String[] strings = {"Red", "Green", "Blue"};
        Arrays.sort(strings); // order array
        for (String color : strings)  // foreach loop
        {
            System.out.println(color);
        }

        System.out.println("Setting an initial size");
        int[] sized = new int[10]; // array of 10 elements

        for (int i = 0; i < sized.length; i++) // recorremos el array
        {
            sized[i] = i * 100;     // que rellene cada elemento con esto
        }
        for (int value: sized)
        {
            System.out.println(value);
        }

        System.out.println(("Copying an array"));
        int [] copied = new int[5]; // create a new array with 5 elements
        System.arraycopy(sized, 4, copied, 0, 5); // copy the array
        // first array to copy, initial position to copy, destiny array, first position where copy, lenght
        for (int value: copied) // we can reuse the variable value
        {
            System.out.println(value);
        }


    }
}
