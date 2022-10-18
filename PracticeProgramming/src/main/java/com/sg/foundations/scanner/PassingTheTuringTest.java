package com.sg.foundations.scanner;

import java.util.Scanner;

public class PassingTheTuringTest {
    public static void main(String[] args) {
        System.out.println("Hello! Whats your name?");

        Scanner input = new Scanner(System.in);
        String name = input.nextLine();

        System.out.println("Hello "+name+ ", I am Amal!!");
        System.out.println("Whats your fav colour?");
        String favColour = input.nextLine();

        System.out.println(favColour+" is nice, mine is blue!");
        System.out.println("Whats your favourite food and number?");
        String favourite = input.nextLine();
        System.out.println(favourite + "are very good choices!");
        System.out.println("Well anyways goodbye!!");


    }
}
