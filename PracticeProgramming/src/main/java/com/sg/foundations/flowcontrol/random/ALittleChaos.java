package com.sg.foundations.flowcontrol.random;
import java.util.Random;
public class ALittleChaos {
    public static void main(String[]args){

        Random randomiser = new Random();

        System.out.println("Random can make integers: " + randomiser.nextInt());
        System.out.println("Or a double: " + randomiser.nextDouble());
        System.out.println("Or even a boolean: "+randomiser.nextBoolean());

        int num = randomiser.nextInt(100);

        System.out.println("You can store a randomised result: " + num);
        System.out.println("And use it over and over again: "+num+ ", "+num);

        System.out.println("Or just keep generating new values");
        System.out.println("Here's a bunch of numbers from 0 - 100: ");

        System.out.print(randomiser.nextInt(101) + 150+", "); //You can add random numbers in a maths statement
        System.out.print(randomiser.nextInt(1) + ", ");
        System.out.print(randomiser.nextInt(10) + ", ");
        System.out.print(randomiser.nextInt(1000001) + ", ");
        System.out.print(randomiser.nextInt(251) + ", ");
        System.out.println(randomiser.nextInt(7));
    }
}
