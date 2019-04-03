package com.example.java;

public class MaxValues {

        public static void main(String[] args) {

            byte b= 127;
            System.out.println("Byte: "+ b);

            if (b<Byte.MAX_VALUE) { // si el valor no ha llegado al máximo del tipo byte
                b++;
            }

            System.out.println("Byte: "+ b);

        }
    }


