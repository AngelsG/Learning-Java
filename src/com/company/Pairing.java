package com.company;

import java.util.ArrayList;
import java.util.List;

public class Pairing {
    public static void main(String[] args) {
        List<String> interviwers = new ArrayList<String>();
        interviwers.add("John");
        interviwers.add("Jane");

        interviwers.forEach(System.out::println);
    }
}
