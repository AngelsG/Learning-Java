package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Pairing {
    public static void main(String[] args) {
        List<String> interviwers = new ArrayList<String>();
        interviwers.add("John");
        interviwers.add("Jane");
        interviwers.add("David");
        interviwers.add("Tom");

        Random random = new Random();

        int randomPerson = random.nextInt(4);
        Scanner scanner = new Scanner(System.in);
        while (true) {
            scanner.nextLine();
            if(randomPerson == 4){
                randomPerson = 0;
            }
            System.out.print(interviwers.get(randomPerson));
            randomPerson = randomPerson + 1;
        }

    }
}
