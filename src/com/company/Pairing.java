package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Pairing {
    public static void main(String[] args) {
        List<String> interviwers = new ArrayList<String>();
        interviwers.add("John");
        interviwers.add("Jane");
        interviwers.add("David");
        interviwers.add("Tom");

        int randomPerson = new Random().nextInt(4);

        System.out.print(interviwers.get(randomPerson));

    }
}
