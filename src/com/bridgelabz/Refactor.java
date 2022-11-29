package com.bridgelabz;

public class Refactor {



    public static <T extends Comparable<T>> T maximum(T num1, T num2, T num3) {

        if (num2.compareTo(num1) > 0) {
            return num2;
        } else if (num3.compareTo(num2) > 0) {
            return num3;
        } else {
            return num1;
        }

    }

    public static void main(String[] args) {

        System.out.println("Maximum number integers is: " + maximum(11, 18, 10));
        System.out.println("Maximum number  float is: " + maximum(5.8f, 5.7f, 8.8f));
        System.out.println("Maximum string is: " + maximum("idly", "Dhosa", "biriyani"));
    }

}