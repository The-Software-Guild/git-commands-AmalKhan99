package com.sg.foundations.scanner;

import java.util.Scanner;

public class DoItBetter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("How many miles can you run");
        int miles = input.nextInt();
        System.out.println("I can run"+((2*miles)+1)+"miles more than you");

        System.out.println("How many hot dogs can you eat");
        int hotDogs = input.nextInt();
        System.out.println("I can eat"+((2*hotDogs)+1)+" hot dogs more than you");

        System.out.println("How many languages do you know?");
        int languages = input.nextInt();
        System.out.println("I know "+((2*languages)+1)+" more languages than you");


    }
}
