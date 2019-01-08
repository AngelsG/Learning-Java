package com.company;

import java.util.Scanner;

public class ImpressoraCanco {

    public static int quantsCancons = 0;

    public static void main(String[] args) {
        print("He imprimit " + quantsCancons + " cançons");
        for (int i = 0; i < 10; i++) {
            print("Estrofa #" + numEstrofa(30 + i));
            print("HOLA!");
            print("ADEU!");
        }
        quantsCancons++;
    }

    /**
     * El numero d'estrofa es genera repetint el primer numero
     *
     * @param n el numero
     * @return el numero d'estrofa
     * <p>
     * Ex: 30 => 330, 54 => 554, 97 => 997
     * 30 => 3,0. 3*100+30=330
     * 123 => 1123, 670 => 6670, 900 => 9900
     */
    private static String numEstrofa(int n) {
        return primerNumeroDe(n) + n;
    }

    private static String primerNumeroDe(int n) {
        return "" + n / 10;
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
