package com.example.java;

import java.util.Scanner;

public class ConstruirCadena
{
    public static void main(String[] args) {

        // haciendolo así creamos 3 objetos y esto significa más uso de memoria
    String str1 = "Hello";
    String str2 = "World";
    String str3= str1 +", " +str2 + "!";
        System.out.println(str3);

     // podemos hacerlo usando StringBuilder (único objeto)

     StringBuilder sb = new StringBuilder("Hello");
     sb.append(", ");
     sb.append("World");
     sb.append("!");
        System.out.println(sb);

        // el resultado es el mismo pero usando menos memoria

      // con esto así también funciona y se usa menos código

        StringBuilder sb1 = new StringBuilder("Hello") // sin ;
                .append(", ")
                .append("World")
                .append("!");
        System.out.println(sb1);

       //  introducir datos por teclado

        Scanner escaneo= new Scanner(System.in);
        //creamos el objeto y lo instanciamos con el constructor
        System.out.print("Enter value: "); // pedimos que la introducza
        //print no lleva ln
        String input= escaneo.nextLine(); // lo guardamos en un string
        System.out.println(input);

        // AHORA HAREMOS UN MIX DE LOS DOS, ENTRADA DATOS Y STRING BUILDER

        // primero borramos los datos del String Builde
        sb1.delete(0, sb.length()); //coge dos argumentos
        for (int i = 0; i <3 ; i++) // ponemos 3 pq son los append que tenemos
        {
            System.out.print("Enter another value: ");
            input= escaneo.nextLine(); //pedimos que introduzca texto
            // lo hará 3 veces, pq repetirá el loop 3 veces
            sb1.append(input + "\n"); // asignamos
        }
        // cuando acabe el loop imprimimos lo introducido
        System.out.println(sb1);

    }
}
