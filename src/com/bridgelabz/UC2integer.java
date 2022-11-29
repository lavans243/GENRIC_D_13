package com.bridgelabz;

import java.util.Scanner;

public class UC2integer {

    public static Integer compareTo(Integer num1, Integer num2, Integer num3)
    {

        if (num1 > num2 && num1 > num3)
        {
            return num1;
        } 
        else 
        	if (num2 > num3)
        	{
            return num2;
        }
        	else
        	{
            return num3;
        }
    }


    public static void main(String[] args) {
       
    	UC2integer integer = new UC2integer();

        System.out.println("max Number for 1st test case=" + integer.compareTo(10, 20, 30));
    }
}