package com.company;
import java.io.PrintStream;
import java.util.Scanner;


public class Divisas2 {

    public static void main (String[]args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Calculadora de Divisas");
        System.out.println("1-Dolares a Pesos");
        System.out.println("2-Pesos a Dolares");

        int opcion = sc.nextInt();
        double cantidad;

        double dolares = 1;
        double pesos = 18.90;

        switch(opcion){
            case 1:
                System.out.println("Dolares a pesos");
            System.out.println("Cuantos dolares tienes?");
            cantidad = sc.nextDouble();
            cantidad = (cantidad * pesos/dolares);
            System.out.printf("Tienes %2f dolares", cantidad);
                break;
            case 2:
            System.out.println("Dolares a pesos");
            System.out.println("Cuantos dolares tienes?");
            cantidad = sc.nextDouble();
            cantidad = (cantidad * dolares/pesos);
            System.out.printf("Tienes %2f pesos", cantidad);
            break;
            default:
            System.out.println("La opcion no existe");

        }
    }
}
