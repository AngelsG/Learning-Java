package com.company;

public class Main {

    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
        int numeroQueHaTriatLUsuari = Integer.parseInt(args[0]);
        System.out.println("2 + "+numeroQueHaTriatLUsuari + " = " + (2 + numeroQueHaTriatLUsuari));
    }
}

