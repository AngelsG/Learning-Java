package com.company;
import java.util.Scanner;

public class TablaWhileDinamica {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.println("Dar le valor de la tabla");

        int tabla = leer.nextInt();
        int contador = 1;
        int limite = 10;


        while (contador < limite) {
            System.out.println(tabla * contador);
            contador++;
        }
            System.out.println("Termina el while");

        contador = 1;


        do {
            System.out.println(tabla * contador);
            contador++;

        } while (contador <= limite);

    }
}



