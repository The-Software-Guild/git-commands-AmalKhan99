package com.sg.foundations.scanner;

import java.util.Scanner;

public class AllTheTrivia {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("What unit is equivalent to 1,024 Gigabytes?");
        String A1= input.nextLine();
        System.out.println(A1);
        System.out.print("Which planet is the only one that rotates clockwise in our Solar System?");
        String A2= input.nextLine();
        System.out.println(A2);
        System.out.print("The largest volcano ever discovered in our Solar System is located on which planet?");
        String A3= input.nextLine();
        System.out.println(A3);
        System.out.print("What is the most abundant element in the earth's atmosphere?");
        String A4= input.nextLine();
        System.out.println(A4);

        System.out.println("Wow, 1,024 Gigabytes is a"+A2+" \n"+
                "I didn't know that the largest ever volcano was discovered on " +A1+
                "That's amazing that "+A3+" is the most abundant element in the atmosphere...\n" +
                A4+" is the only planet that rotates clockwise, neat!");

    }
}
