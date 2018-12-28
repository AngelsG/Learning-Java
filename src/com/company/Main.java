package com.company;

import java.io.InputStream;
import java.util.Scanner;

public class Main {

    public static final int NO_ES_POT_FER = -1;

    public static void main(String[] args) {
        print("Escriu un numero:");

        int number = readNumber();

        if(multiply(3) == NO_ES_POT_FER){
            print("No es pot fer");
        } else {
            print("El teu numero es = " + multiply(number) + "...");
        }
    }

    private static int multiply(int num) {
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
        return new Scanner(System.in).nextLine();
    }

    private static void print(String message) {
        System.out.println(message);
    }
}

