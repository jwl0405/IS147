package com.company;
//Jaewhan Lee
//jaelee5@umbc.edu
public class flight extends Inhe{
    private final double TAX= 0.05;
    public void itinerary(double x, double y){
        total= x*y+(x*y*TAX);
        System.out.println("Total price for itinerary with tax is: $"+ total);
    }
}
