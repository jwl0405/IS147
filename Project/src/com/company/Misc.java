package com.company;
//Jaewhan Lee
//jaelee5@umbc.edu

import java.util.Scanner;

public class Misc {
    public static void main(String[] args) {

    }

    public static void Month() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the month (between 1-12) customer would like to travel");
        byte number = scan.nextByte();

        if (number == 1)
            System.out.println("It is January");

        else if (number == 2)
            System.out.println("It is February");

        else if (number == 3)
            System.out.println("It is March");

        else if (number == 4)
            System.out.println("It is April");

        else if (number == 5)
            System.out.println("It is May");

        else if (number == 6)
            System.out.println("It is June");

        else if (number == 7)
            System.out.println("It is July");

        else if (number == 8)
            System.out.println("It is August");

        else if (number == 9)
            System.out.println("It is September");

        else if (number == 10)
            System.out.println("It is October");

        else if (number == 11)
            System.out.println("It is November");

        else if (number == 12)
            System.out.println("It is December");

        else
            System.out.println("Invalid month");

    }

    public double Max(double i, double j) {

        return Math.max(i, j);


    }
    public static void Random(){
        System.out.println("Thank you for calling Lee's traveling company");
        int randomNumber = (3 + (byte) (Math.random() * 15));
        System.out.println("Your estimated time of waiting is " +
                randomNumber+ " minutes");
    }
}
