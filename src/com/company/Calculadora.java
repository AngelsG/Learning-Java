package com.company;
import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("Calculaora basica");
        System.out.println("Opciones:\n1-Suma\n2-Resta\n3-Multiplicacion\n4-Division");

        int opcion = sc.nextInt();


        if(opcion >4){
            System.out.println("La opcion no es posible");
        }else{

            System.out.println("Dar el primer valor");
            double variable1 = sc.nextDouble();
            System.out.println("Dar el segundo valor");
            double variable2 = sc.nextDouble();
            double resultado;


            if(opcion ==1){
            resultado = variable1 + variable2;
            System.out.println("La suma es: " + resultado);

        }else{
            if(opcion == 2){
                resultado = variable1 - variable2;
                System.out.println("La resta es: "  + resultado);

            }else if(opcion==3){
                resultado = variable1 * variable2;
                System.out.println("La multiplicacion es: " + resultado);

            }else if(opcion == 4){
                resultado = variable1 /variable2;
                System.out.println("La division es: " + resultado);

            }
        }
        }




    }
}
