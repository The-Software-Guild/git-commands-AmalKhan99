package com.sg.foundations.flowcontrol.ifs;
import java.util.Scanner;
public class YourLifeInMovies {
    public static void main(String[] args) {

        System.out.println("What year were you born in");
        Scanner input = new Scanner(System.in);
        int year= input.nextInt();

        if(year<2005){
            System.out.println("Pixar's 'UP' came out before you were born");
        }
        if(year<1995){
            System.out.println("The first Harry Potter came out over 15 years ago");
        }
        if(year<1985){
            System.out.println("Space Jam came out not last decade, but the one before THAT");
        }
        if(year<1975){
            System.out.println("The original Jurassic Park release is closer to the first lunar landing than it is to today");
        }
        if(year<1965){
            System.out.println("The MASH TV series has been around for almost half a century!");
        }

    }
}
