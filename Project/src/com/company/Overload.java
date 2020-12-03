package com.company;
//Jaewhan Lee
//jaelee5@umbc.edu
import java.util.Scanner;


public class Overload {


        public static String UMBC (int Amount){
            Scanner Scan= new Scanner(System.in);
            System.out.println("How many luggage does customer taking?");
            Amount= Scan.nextInt();
            return ("Total luggage for customer is "+ Amount);
        }
        public static String UMBC (double Total){
            Scanner Scan= new Scanner(System.in);
            System.out.println("Enter the price for each luggage is: ");
            double Number= Scan.nextInt();
            System.out.println("Total number of luggage is: ");
            double Price= Scan.nextInt();
            Total= Number*Price;
            return ("Total price for luggage is: $" + Total);

        }
    }

