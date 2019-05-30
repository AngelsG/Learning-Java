package com.company;

import java.util.Scanner;

public class CalculadoraInfinita {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcion = 0;


        do {
            System.out.println("Operacion\n 1-Suma\n2-Resta\n3-Multiplicacion\n4-Division\n5-Salir");
            opcion = sc.nextInt();

            System.out.println("Elije valor1");
            double valor1 = sc.nextDouble();
            System.out.println("elije valor2");
            double valor2 = sc.nextDouble();


            double resultado;


            switch (opcion) {
                case 1:
                    resultado = valor1 + valor2;
                    System.out.println(resultado);
                    break;
                case 2:
                    resultado = valor1 - valor2;
                    System.out.println(resultado);
                    break;
                case 3:
                    resultado = valor1 * valor2;
                    System.out.println(resultado);
                    break;
                case 4:
                    resultado = valor1 / valor2;
                    System.out.println(resultado);
                    break;
                case 5:
                    System.out.println("Has salido del programa");
                default:
                    System.out.println("Opcion no es posible");

            }

        }while (opcion != 5);
    }
}
