package com.company;
import java.util.Scanner;

public class OperadoresLogicos {

    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);

        System.out.println ("cual es tu edad");
        int age = sc.nextInt();

        if (age >=1 && age <=10){
            System.out.println("Eres un niño");
        }

        if (age >=11 && age <=17){
            System.out.println("Eres adolescente");
        }

        if (age >=18 && age <=30){
            System.out.println("Eres adulto");
        }

        if (age >=31 && age <=80){
            System.out.println("Eres mayor");
        }

        else {
            System.out.println("No es posible la edad");
        }
        }
    }

