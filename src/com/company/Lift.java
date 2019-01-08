package com.company;

import java.util.Scanner;

public class Lift {


    public static void main(String[] args) {
        print("Press button from 1 to 5");

        int number = readNumber();
        if (number == 3) {
            print("CLOSED FLOOR");
            int number2 = readNumber();
            if (number2 == 3) {
                print("CLOSED FLOOR");
                int number3 = readNumber();
                if (number3 == 3) {
                    print("CLOSED FLOOR");
                } else if (isOutOfBounds(number3)) {
                    print("There are no more floors");
                } else {
                    print("FLOOR " + (number3));
                }
            } else if (isOutOfBounds(number2)) {
                print("There are no more floors");
                int number3 = readNumber();
                if (number3 == 3) {
                    print("CLOSED FLOOR");
                } else if (isOutOfBounds(number3)) {
                    print("There are no more floors");
                } else {
                    print("FLOOR " + (number3));
                }
            } else {
                print("FLOOR " + (number2));
            }
        } else if (isOutOfBounds(number)) {
            print("There are no more floors");
            int number2 = readNumber();
            if (number2 == 3) {
                print("CLOSED FLOOR");
                int number3 = readNumber();
                if (number3 == 3) {
                    print("CLOSED FLOOR");
                } else if (isOutOfBounds(number3)) {
                    print("There are no more floors");
                } else {
                    print("FLOOR " + (number3));
                }
            } else if (isOutOfBounds(number2)) {
                print("There are no more floors");
                int number3 = readNumber();
                if (number3 == 3) {
                    print("CLOSED FLOOR");
                } else if (isOutOfBounds(number3)) {
                    print("There are no more floors");
                } else {
                    print("FLOOR " + (number3));
                }
            } else {
                print("FLOOR " + (number2));
            }
        } else {
            print("FLOOR " + (number));
        }
    }

    private static boolean isOutOfBounds(int c) {
        return c < 1 || c > 5;
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

