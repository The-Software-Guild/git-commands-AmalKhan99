package com.sg.foundations.variables;

public class MoreBucketsMoreFun {
    public static void main(String[] args) {

        // Declare all variable
        int butterflies, beetles, bugs;

        // Give values to the variables
        butterflies = 5;
        beetles = 9;

        bugs = butterflies + beetles;
        System.out.println("There are only " + butterflies + " butterflies,");
        System.out.println("but there are " + bugs + " bugs in all.");

        System.out.println("Uh oh, my dog ate one.");
        butterflies--;
        System.out.println("Now there are only " + butterflies + " butterflies left.");
        System.out.println("But there are still " + bugs + " bugs left..."); //Using the plus operator to show the dog ate a bug
        System.out.println("Wait a minute!");
        System.out.println("... maybe my computer can't do math, after all!");
        //The number of bugs dont change when we remove a butterfly because we calculate number of bugs we perform the calculation before number of butterflies
    }
}
