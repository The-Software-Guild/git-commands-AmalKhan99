package com.sg.foundations.flowcontrol.ifs;
import java.util.Scanner;
public class KnockKnock {
    public static void main(String[] args) {
        Scanner inputReader = new Scanner(System.in);

        System.out.print("Knock Knock! Guess who!! ");
        String nameGuess = inputReader.nextLine();

        if(nameGuess.equals("Marty McFly")){
            System.out.println("Hey! That's right! I'm back!");
            System.out.println(".... from the Future."); // Sorry, had to!
        }else{
            System.out.println("Dude, do I -look- like " + nameGuess);
        }
    }
}

//if you changed .equals to == nothing would happen on the surface but in reality it would check the memeory and see if it is equal in memory and not the contents
//if you dont type in the right capitalisation it would produce a false output