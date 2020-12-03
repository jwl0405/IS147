package com.company;
//Jaewhan Lee
//jaelee5@umbc.edu
import java.util.Scanner;

public class Main {
    //Modifier
    private static double Total=0;
    private static int Amount=0;

    public static void main(String[] args) {

        //Using Java library class such as Date, Random etc
        Misc.Random();
        Summary();


    }
    public static void T(String TT) {


        switch (TT) {
            case "Yes":
            case "yes":
            case "Y":
            case "y":
                System.out.println("Yes, customer is over the age of 14");
                break;
            case "No":
            case "no":
            case "N":
            case "n":
                System.out.println("No, customer is under the age of 14");
                break;
            default:
                System.out.println("Invalid answer");
                break;
        }
    }
    public static void Summary(){
        //Using Scanner
        Scanner scan= new Scanner(System.in);
        System.out.println("Please Enter customer's Last name");
        String LastName= scan.next();
        System.out.println("Please Enter customer's first name");
        String FirstName= scan.next();
        System.out.println("Please enter customer's passport number");
        //Conductor and this statement
        int passportNumber= scan.nextInt();
        Information First= new Information(passportNumber);
        System.out.println("---------------------------------------\nTrip Summary for "+ LastName+ " "+FirstName);
        System.out.println("Customer's passport number is: "+ First.getPassPort());
        System.out.println("Customer's full name is: "+ LastName+" "+FirstName);
        //Conditional operator
        Misc.Month();
        //Inheritance
        flight test= new flight();
        System.out.println("Enter the price for the hotel");
        double a= scan.nextDouble();
        System.out.println("Enter the duration of stay");
        double b= scan.nextDouble();
        System.out.println("Enter the price for the itinerary");
        double c= scan.nextDouble();
        System.out.println("Enter how many customers are traveling");
        double d= scan.nextDouble();
        test.hotel(a,b);
        test.itinerary(c,d);
        //Constant variable
        final double TAX= 0.05;
        System.out.println("Tax for hotel is: $"+ TAX*a*b);
        System.out.println("Tax for itinerary is: $"+ TAX*c*d);
        //Method overload
        System.out.println(Overload.UMBC(Amount));
        System.out.println(Overload.UMBC(Total));
        //Array and loop
        Coming come = new Coming();
        come.ArrayLoop();
        //Math class method,passing argument by values,
        // and return value from method
        Misc Math= new Misc();
        System.out.println("Most expensive cost of trip is: $"+Math.Max(a,c));





    }
}
