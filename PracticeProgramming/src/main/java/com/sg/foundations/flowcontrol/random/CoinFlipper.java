package com.sg.foundations.flowcontrol.random;
import java.util.Random;
public class CoinFlipper {
    public static void main(String[]args){

        //Declare random
        Random coinFlip = new Random();
        Boolean result= coinFlip.nextBoolean();

        System.out.println("Ready, set, flip....!!!");

        if (result==true){
            System.out.println("You got TAILS!!!!");
        }
        else {
            System.out.println("You got HEADS!!!!");
        }
    }
}
