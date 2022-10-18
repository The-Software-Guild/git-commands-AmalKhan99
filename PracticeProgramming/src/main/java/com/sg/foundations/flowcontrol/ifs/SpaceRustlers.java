package com.sg.foundations.flowcontrol.ifs;

public class SpaceRustlers {
    public static void main(String[] args) {

        //if performs code based on if the condition is true and else if performs code if the 'if' condition isnt true and if instead another specified condition is true
        //if you remove 'else' from 'else if' then the code executes as a seperate if conditional and is not based on the first if condition being true
        int spaceships = 10;
        int aliens = 25;
        int cows = 100;

        if(aliens > spaceships){
            System.out.println("Vrroom, vroom! Let's get going!");
        } else{
            System.out.println("There aren't enough green guys to drive these ships!");
        }

        if(cows == spaceships){
            System.out.println("Wow, way to plan ahead! JUST enough room for all these walking hamburgers!");
        } else if (cows > spaceships){
            System.out.println("Dangit! I don't how we're going to fit all these cows in here!");
        } else {
            System.out.println("Too many ships! Not enough cows.");
        }

        if(aliens > cows){
            System.out.println("Hurrah, we've got the grub! Hamburger party on Alpha Centauri!");
        } else if (aliens >= cows){
            System.out.println("Oh no! The herds got restless and took over! Looks like we're hamburger now!!");
        }
    }
}
