package com.company;

public class arrays {

    public static void main (String[]args){

        int array1[] = new int[5];// 5 espacios vacios

        int array2[] = {1,2,3,4,5,6}; //6 espacios pero con los valores

        array1[1] = 100;
        array1[2] = 500;
        array1[3] = 10;
        array1[4] = 200;
        array1[0] = 1;


        System.out.println("array1 en la posición 3: " + array1[3]);
        System.out.println("array1 en la posición 2: " + array1[2]);
        System.out.println("array1 en la posición 0: " + array1[0]);

        array1[3] = 555;
           System.out.println("array1 en la posición 3: " + array1[3]);
        
        //----------------
        System.out.println("---------------");

        System.out.println("array2 en la posición 0: " + array2[0]);
        System.out.println("array2 en la posición 3: " + array2[3]);
        System.out.println("array2 en la posición 5: " + array2[5]);
        array2[3] = 20;
        System.out.println("Array2 en la posición 3: " + array2[3]);

       //-----------------
        System.out.println("---------------");


       for(int i = 0; i< array1.length; i++) {
           System.out.println("array1 en la posición " + i + ":" + array1[i]);
       }
       System.out.println("---------------");
       
       for (int i = 0; i< array2.length; i++) {
           System.out.println("array2 en la posición " + i + ":" + array2[i]);
           
       }
           
        }
        
    }

