package com.sg.foundations.variables;

public class MenuOfChampions {
    public static void main(String[]args){

        //Declare variables
        String restaurantName, food1, food2, food3;
        double food1Price, food2Price, food3Price;

        //Assign values to variables
        restaurantName= "Moonlight Restaurant";
        food1="Spaghetti";
        food1Price= 3.00;
        food2= "Pizza";
        food2Price=5.00;
        food3="Ravioli";
        food3Price= 4.75;

        //Output variables
        System.out.println("Welcome to "+restaurantName+" !");
        System.out.println("Please peruse our menu below: ");
        System.out.println(food1 +" ---"+ food1Price);
        System.out.println(food2 +" ---"+ food2Price);
        System.out.println(food3 +" ---"+ food3Price);
    }
}
