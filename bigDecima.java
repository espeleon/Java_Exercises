package com.example.java;

import java.math.BigDecimal;

public class bigDecima {

    public static void main(String[] args){

        double value = .012;
        double psum= value + value + value;

        System.out.println("Sum of primitives are: "+psum);
        // vemos que el resultado no es exacto.
        // podemos usar BigDecimal
        // primero tenemos que pasarlo a String

        String strValue= Double.toString(value);
        System.out.println("strValue: "+strValue);
        BigDecimal bigValue= new BigDecimal(strValue); // instanciamos un objeto de la clase Bigdecimal

        // creamos un objeto de BigDecimal y hacemos la suma
        BigDecimal bsum= bigValue.add(bigValue).add(bigValue);
        System.out.println("Sum of BigDecimals: "+bsum.toString());

    }

}
