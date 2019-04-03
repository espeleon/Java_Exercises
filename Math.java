package com.example.java;

public class Math {

    public static void main (String[] args){

        int intValue1= 56;
        int intValue2= 42;

        int result= intValue1 +  intValue2;
        System.out.println("The result : "+ result);
        int result2= intValue1 -  intValue2;
        System.out.println("The result : "+ result2);
        int result3= intValue1 *  intValue2;
        System.out.println("The result : "+ result3);

        // al dividir tenemos que cambiar el tipo pq nos puede dar una fracción
        double result4= (double) intValue1 /  intValue2;
        System.out.println("The result : "+ result4);

        int result5= intValue1 %  intValue2;
        System.out.println("The result : "+ result5);

        double doubleValue= -3.999999999;
        long rounded= java.lang.Math.round(doubleValue);
        System.out.println("Rounded: "+ rounded);

        double absValue= java.lang.Math.abs(doubleValue);
        System.out.println("Absolute: "+ absValue);
    }
}
