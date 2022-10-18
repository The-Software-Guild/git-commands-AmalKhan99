package com.sg.foundations.flowcontrol.whiles;

public class WaitAWhile {
    public static void main(String[]args){

        int timeNow= 5;
        int bedTime=10;

        while(timeNow<bedTime){
            System.out.println("It's only " +timeNow+ " o'clock!");
            System.out.println("I think I'll stay up just a liiiiitttle longer...");
            timeNow++; //Time passes
        }
        System.out.println("Oh. It's "+timeNow+" o'clock.");
        System.out.println("Guess I should go to bed...");
    }
}

//If bedTime changes to 11 then the loop would run for one extra time
//changing timeNow to 11 would automatically print out the guess I should go to bed line
//The loop keeps running at its 5 o clock and keeps printing the "I'll stay a little longer" line infinitely
