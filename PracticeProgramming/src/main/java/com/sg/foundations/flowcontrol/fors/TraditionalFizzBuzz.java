package com.sg.foundations.flowcontrol.fors;
import java.util.Scanner;
public class TraditionalFizzBuzz {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("How many units of fizz buzz do you want to find out?");
        int amount = scanner.nextInt();

        for (int i = 1; i <= amount; i++) {
            if(((i%3)==0)&&((i%5)==0)) //3&5
                System.out.println("fizzbuzz");
            else if ((i%3)==0) //3
                System.out.println("fizz");
            else if ((i%5) == 0) //5
                System.out.println("buzz");
            else
                System.out.println(i); //none
        }
        System.out.println("TRADITION!!!!");
    }
}
