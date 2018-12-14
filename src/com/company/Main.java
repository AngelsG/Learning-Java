package com.company;

import java.io.InputStream;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int numeroQueHaTriatLUsuari = Integer.parseInt(readLine(System.in));
        System.out.println("2 + "+numeroQueHaTriatLUsuari + " = " + (2 + numeroQueHaTriatLUsuari));
    }

    private static String readLine(InputStream in) {
        return new Scanner(in).nextLine();
    }
}

