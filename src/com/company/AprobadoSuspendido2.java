package com.company;
import java.util.Scanner;


public class AprobadoSuspendido2 {

    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Cual es tu nota?");

        double nota = sc.nextDouble();

        if(nota <6) {
            System.out.println("Te falta esforzarte mas");
        }
        if (nota == 6 && nota <7) {
            System.out.println("De panzazo");
        }
        if (nota ==7 && nota <8) {
            System.out.println("Echale mas punch");
        }
        if (nota ==8 && nota <9) {
            System.out.println("Bien, puedes mejorar");
        }
        if (nota ==9 && nota <10) {
            System.out.println("Muy bien, te falta poquito");
        }
        if (nota == 10) {
            System.out.println("Excelente!");
        }
        else if (nota <1 || nota> 10){
            System.out.println("No es posible");
        }
        }
    }

