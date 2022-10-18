package com.sg.foundations.flowcontrol.ifs;
import java.util.Scanner;
public class GuessMe {
    public static void main(String[] args) {
        int num= 32;
        System.out.println("Pick a number");

        Scanner input = new Scanner(System.in);
        int guess= input.nextInt();
        System.out.println("You guessed "+ guess);

        if(guess==num){
            System.out.println("Wow, nice guess! That was it!");
        } else if (guess<num) {
            System.out.println("Ha, nice try - too low! I chose #"+num);
        } else if (guess>num) {
            System.out.println("Too bad, way too high. I chose #"+num);
        }

    }
}
