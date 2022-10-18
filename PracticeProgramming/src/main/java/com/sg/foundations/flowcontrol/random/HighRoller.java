package com.sg.foundations.flowcontrol.random;
import java.util.Random;
import java.util.Scanner;
public class HighRoller {
    public static void main(String[] args) {
        //Established random and scanner
        Random diceRoller = new Random();
        Scanner scanner = new Scanner(System.in);

        //Gets number of sides on dice from user
        System.out.println("How many sides does your dice have?");
        int noOfSides= scanner.nextInt();

        int rollResult = diceRoller.nextInt(noOfSides) + 1;

        System.out.println("TIME TO ROOOOOOLL THE DICE!");
        System.out.println("I rolled a " + rollResult);

        if (rollResult == 1) {
            System.out.println("You rolled a critical failure!");
        }
        else if (rollResult==noOfSides){
            System.out.println("You rolled a critical! Nice job!");
        }
    }
}
