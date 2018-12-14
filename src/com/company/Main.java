package com.company;

import java.io.InputStream;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int selectedNumber = readNumber();
        String message = sum2(selectedNumber);
        print(message);
    }

    private static String sum2(int selectedNumber) {
        int result = 2 + selectedNumber;
        return "2 + " + selectedNumber + " = " + result;
    }

    private static void print(String message) {
        System.out.println(message);
    }

    private static int readNumber() {
        return Integer.parseInt(readLine(System.in));
    }

    private static String readLine(InputStream in) {
        return new Scanner(in).nextLine();
    }
}

