package com.company;

import java.util.Scanner;

public class Read {
  public static void main (String[]args){
  Scanner scanner = new Scanner (System.in);
  System.out.println ("Que edad tienes?");
          int edad = scanner.nextInt();
  System.out.println("yo tambien tengo " + edad + " años");

  System.out.println ("cual es tu peso?");
  double peso = scanner.nextDouble();
  System.out.print("yo peso " + (peso + 5) + " kilos");

System.out.println("cual es tu nombre?");
String nombre = scanner.next();
System.out.println("yo también me llamo " + nombre);

  }
}

