package com.sg.foundations.variables;

public class InABucket {
    public static void main(String[] args) {

        // You can declare all kinds of variables
        String walrus;
        double piesEaten;
        float weightOfTeacupPig;
        int grainsOfSand;

        // But declaring them just sets up the space for data to use the variable, you have to put data in it first!
        walrus = "Sir Leroy Jenkins III";
        piesEaten = 42.1;
        weightOfTeacupPig= 37;
        grainsOfSand = 12;


        System.out.println("Meet my pet walrus, " + walrus);
        System.out.print("He was a bit hungry today, and ate this many pies : ");
        System.out.println(piesEaten);
        System.out.println("I also have a teacup pig that weighs " + weightOfTeacupPig+ " grams, and " +grainsOfSand+ " grains of sand");
    }
}
