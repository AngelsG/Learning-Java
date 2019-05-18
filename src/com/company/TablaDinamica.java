package com.company;
import java.util.Scanner;


public class TablaDinamica {
    public static void main (String[]args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Qué numero quieres multiplicar?");

        int tabla = sc.nextInt();

   for (int x = 1; x<=10; x++) {
       int multiplicacion = tabla * x;
       System.out.println(multiplicacion);

   }
    }
}
