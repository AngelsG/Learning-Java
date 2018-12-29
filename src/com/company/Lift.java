package com.company;

import java.util.Scanner;

public class Lift {


    public static void main(String[] args) {
        print("Press button from 1 to 5");

        int number = readNumber();
        print("FLOOR " + (number));

        int number2 = readNumber();
        if (number2 == 3) {
            print("CLOSED FLOOR");
        } else {
            print("FLOOR " + (number2));
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

