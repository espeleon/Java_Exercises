package com.example.java;

public class convertir {

    public static void main (String[] arg){

        int intValue1=56;
        int intvalue2= intValue1;
        System.out.println("The 2nd Value is: "+ intvalue2);

        // para convertir un int en un long
        // es decir uno pequeño a uno grande

        long longValue1= intValue1; // lo podemos hacer directamente.
        System.out.println("The new valor es: "+ longValue1);

        // si lo queremos convertir a un short
        //si no ponemos (short) nos da un error, mirando el error y escogiendo
        //la primera opción, lo cambiamos y entonces funciona.
        short shortValue1= (short) intValue1;

        // ahora cogemos un int más grande para pasarlo a byte
        // nos dará el mismo error
        // que podemos corregir
        // pero al pasarlo el resultado será 0
        // porque hemos perdido datos
        int intValue3= 1024;
        byte byteValue= (byte) intValue3;
        System.out.println(("El valor de byte: "+ byteValue));

        // ahora intentamos pasar un doble a un int
        double doubleValue= 3.99999999d;
        int intValue4= (int) doubleValue;
        System.out.println(("Double to int: "+ intValue4));
        // al hacer esto perdemos información
        // nos ha devuelto 3, por lo que el resto se ha perdido


    }
}
