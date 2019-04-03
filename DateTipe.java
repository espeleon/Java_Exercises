package com.example.java;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateTipe
{
    public static void main(String[] args)
    {
        //al hacerlo así nos sale en formato máquina
        Date d = new Date();
        System.out.println(d);

        //utilizamos la clase GregorianCalendar
        GregorianCalendar gc = new GregorianCalendar(2019, 04,01);
        // siqueremos añadir un día
        gc.add(GregorianCalendar.DATE,1);
        Date d2 = gc.getTime();
        System.out.println(d2);
        // lo de antes es el método antiguo, ahora hay uno nuevo que cuenta
        // los meses de 1 al 12 y no de 0 a 11 como antes

        LocalDateTime ldt= LocalDateTime.now();
        System.out.println(ldt);

        //podemos ponerle formato
        LocalDate ld= LocalDate.of(2019, 04, 01);
        System.out.println(ld);

        // darle nuestro formato local

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("d/M/yyyy");
        System.out.println(dtf.format(ld));



    }
}
