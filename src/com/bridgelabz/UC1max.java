package com.bridgelabz;
import java.util.Scanner;
public class UC1max {


    public static float compareTo(float num1, float num2, float num3)
    {

        if (num1 > num2 && num1 > num3) {
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
        // TODO Auto-generated method stub



        UC1max number = new UC1max();
        System.out.println("max Number =" + number.compareTo(10.50f,20.50f,30.80f));
    }
}