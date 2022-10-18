package com.sg.foundations.scanner;
import java.util.Scanner;
public class HealthyHearts {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Whats your age?");
        int age= input.nextInt();

        int maxHeartRate= 220-age;
        System.out.println("Your max heart rate should be "+maxHeartRate);
        System.out.println("Your healthy heart range is between "+(0.5*maxHeartRate)+" and "+(0.85*maxHeartRate));

    }
}
