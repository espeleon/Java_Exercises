package com.example.java;

public class Debug
{
    public static void main(String[] args)
    {
        String welcome ="Welcome!";
        char[] chars = welcome.toCharArray();

        try {
            for (int i=0; i < chars.length; i++)
            {
                System.out.println(chars[i]);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}

