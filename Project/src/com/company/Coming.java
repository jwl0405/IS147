package com.company;
//Jaewhan Lee
//jaelee5@umbc.edu
public class Coming {

        public void ArrayLoop(){
        final int DAYS=8;
        int [] numbers = new int [DAYS];
        int sum= 0;

        java.util.Scanner input= new java.util.Scanner(System.in);
        for (int i=1;i<DAYS;i++){
            System.out.println("Enter the Budget for trip day " + i+":");
            numbers [i] = input.nextInt();
            sum += numbers[i];
        }
        System.out.println("Traveling budget for 7 days");
        System.out.println("_________________________");
        int totalsales= sum;
        int count=0;
        for(int i=1; i<DAYS;i++){
            System.out.println("Budget for trip day " + i + ": $"+ numbers[i]);
        }
        System.out.println("Total budget for trip during 7 days is: $"+ totalsales);

    }

}

