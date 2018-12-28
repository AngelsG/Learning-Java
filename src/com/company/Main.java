package com.company;

import java.util.Scanner;

public class Main {

    public static final int NO_ES_POT_FER = -1;

    public static void main(String[] args) {
        print("Escriu un numero:");

        int number = readNumber();
        print("vols multiplicar (BOTO_NUM_1) o sumar(BOTO_NUM_2)?");

        int number2 = readNumber();
        if (number2 == 1) {
            if (multiplyBy3(number) == NO_ES_POT_FER) {
                print("No es pot fer");
            } else {
                print("El teu numero es = " + multiplyBy3(number) + "...");
            }
        } else {
            print("" + (number2 + 3));
        }
    }

    private static int multiplyBy3(int num) {
        int result = num * 3;
        if (result > 10) {
            return NO_ES_POT_FER;
        } else {
            return result;
        }
    }

    private static int readNumber() {
        String line = readLine();
        return Integer.parseInt(line);
    }

    private static String readLine() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    private static void print(String message) {
        System.out.println(message);
    }
}

