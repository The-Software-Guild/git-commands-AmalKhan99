package com.sg.foundations.flowcontrol.whiles;
import java.util.Scanner;
public class StayPositive {
    public static void main(String[]args){

        int x=1;

        Scanner input= new Scanner(System.in);
        System.out.println("What should I count down from?");
        int i = input.nextInt();
        if (i>=0) {
            System.out.println("Counting down...");
            while (i >= 0) {
                if (x <= 10) {
                    System.out.print(i + " ");
                    i--;
                    x++;
                } else {
                    System.out.println();
                    x = 1;
                }
            }
            System.out.println("Blast off!!");
        }
        else{
            System.out.println("Sorry, please only input a positive value :(");
        }
    }
}
