package com.company;

import java.util.Scanner;


public class AprobadoSuspendido {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.print("Cual es tu calificacion");

        Double calificacion = leer.nextDouble();


        if (calificacion < 6) {
            System.out.println("No has aprobado");
        }
            if (calificacion >= 6) {
                System.out.println("Has aprobado");

            }



    }
}

