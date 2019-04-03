package com.example.java;

import java.text.NumberFormat;
import java.util.Locale;

public class FormatoNumerosString
{
    public static void main(String[] args) {

        // esteblecemos el idioma y el país
        Locale locale = new Locale("es", "ES");

        double doubleValue = 1_234_567.89;

        // pone el número en nuestro formato puntos y comas
        NumberFormat numF = NumberFormat.getNumberInstance(locale);
        System.out.println("Number: "+ numF.format(doubleValue));

        // pasa de dolar a nuestro formato de moneda, el euro
        NumberFormat curf= NumberFormat.getCurrencyInstance(locale);
        System.out.println(("Currency: "+ curf.format(doubleValue)));

        // pone el numero en nuestro formato, formato decimal
        NumberFormat intf= NumberFormat.getIntegerInstance(locale);
        System.out.println("Integer: "+ intf.format(doubleValue));

    }
}
