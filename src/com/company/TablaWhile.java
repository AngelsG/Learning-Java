package com.company;
import java.util.Scanner;

public class TablaWhile {
    public static void main(String[]args) {

        Scanner sc = new Scanner(System.in);

        int tabla = 9;
        int limite = 10;
        int contador = 1;

        while (contador <= limite) {

            System.out.println(tabla * contador);

            contador++;
        }

        System.out.println("Temrino while");

        contador = 1;

        do{
            System.out.println(tabla * contador);

            contador++;

        }while(contador <= limite);

        System.out.println("temrino el Do-wile");
    }


}
