package com.company;

import java.util.Scanner;

public class Gender {

    public static void main(String[]args){

        Scanner sc = new Scanner (System.in);

        System.out.println("Gender? \n1) Woman 2)Man");


        int gender = sc.nextInt();


        if (gender == 1){
            System.out.println("What a woman!");
        }else if (gender == 2){
            System.out.println("What a man!");

        }else {
            System.out.println("Not an option");
        }
        }
    }

