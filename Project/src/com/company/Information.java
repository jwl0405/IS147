package com.company;
//Jaewhan Lee
//jaelee5@umbc.edu
//Conductor

public class Information {
    protected int passPort;

    public Information() {
        this.passPort=123456789;
    }
    public Information (int i){
        this.passPort=i;
    }
    public int getPassPort(){
        return passPort;
    }
    public void setPassPort(int passPort){
        this.passPort=passPort;
    }

}
