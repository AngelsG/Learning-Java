package com.company;

import java.util.Scanner;

public class Media {
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);

        System.out.println("calculo de la media entre?");
        int total = sc.nextInt();

        double suma = 0;

        for(int i = 0; i < total; i++) {
            System.out.println("Dar el valor " + (i+1) + ": ");
            int aux = sc.nextInt();
            suma = aux + suma;
            System.out.println();
        }
        double media = suma /total;
        System.out.println("El valor de la media es " + media);
        }
    }


