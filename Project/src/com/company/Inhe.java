package com.company;
//Jaewhan Lee
//jaelee5@umbc.edu

class Inhe {
     public double total;
     private final double TAX= 0.05;

    public void hotel(double x,double y){
        total= x*y+(x*y*TAX);
        System.out.println("Total price for hotel with tax is: $"+total);

    }
}
