
package com.company;
import java.util.Scanner;

public class Divisas{

    public static void main(String[]args){
        Scanner leer = new Scanner(System.in); // Creando instancia de Scanner

        System.out.println("Calculadora de divisas de Dolares a Pesos");
        System.out.println();

                double cantidad;
                double peso = 19.10;
                double dolar = 1;

        System.out.println("Cuantos dolares tienes?");
        cantidad = leer.nextDouble();

        double resultado = (cantidad * peso) /dolar;
        System.out.printf("Tienes %.2f dolares y son + %.2f pesos\n", cantidad, resultado);


    }
}