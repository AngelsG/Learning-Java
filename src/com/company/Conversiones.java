
package com.company;
import java.util.Scanner;


public class Conversiones{
    public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);

double valor;
double centimetros = 2.54;
double pulgadas = 1;

System.out.println("Calculadora de pulgadas a centimetros");
System.out.println("-------------------------------");
System.out.println("Dar pulgadas");

valor = sc.nextDouble();

Double result = (valor * centimetros) / pulgadas;
System.out.printf("%f pulgadas es igual a %2f centimetros ", valor, result);




    }
}