package com.company;

import java.util.Scanner;


public class Calculadora2 {

    public static void main (String[] args){

        Scanner sc = new Scanner (System.in);

        System.out.println("Calculadora basica");
        System.out.println("1-suma\n2-resta\n3-multiplicacion\ndivision");

        int opcion = sc.nextInt();
        double resultado;


        System.out.println("Introduce un numero");
        double variable1 = sc.nextDouble();
        System.out.println("Introduce otro numero");
        double variable2 = sc.nextDouble();


        switch (opcion){
            case 1:
                opcion = 1;
                resultado =  variable1 + variable2;
                System.out.println("El resultado es " + resultado);
                break;
            case 2:
                opcion = 2;
                resultado =  variable1 - variable2;
                System.out.println("El resultado es " + resultado);
                break;
            case 3:
                opcion = 3;
                resultado =  variable1 * variable2;
                System.out.println("El resultado es " + resultado);
                break;
            case 4:
                opcion = 4;
                resultado =  variable1 / variable2;
                System.out.println("El resultado es " + resultado);
                break;
            default:
            System.out.println("L aopcion no existe");
        }

    }
}
