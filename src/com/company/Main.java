package com.company;

import java.io.InputStream;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int selectedNumber = readNumber();
        int userNum = readNumber();
        String message = sum(selectedNumber, userNum);
        print(message);
    }

    private static String sum(int number, int number2) {
        int result = number + number2;
        return number + " + " + number2 + " = " + result;
    }

    private static int readNumber() {
        return Integer.parseInt(readLine(System.in));
    }

    private static String readLine(InputStream in) {
        return new Scanner(in).nextLine();
    }

    private static void print(String message) {
        System.out.println(message);
    }
}

