package com.sg.foundations.scanner;
import java.util.Scanner;
public class MiniMadLibs {
    public static void main(String[]args){

        Scanner scanner= new Scanner(System.in);
        String noun1, adj1, noun2, adj2, pnoun1, pnoun2, pnoun3, presentTenseVerb, sameVerbPastTense;
        int number;

        System.out.println("Give me a noun");
        noun1= scanner.nextLine();
        System.out.println("Give me a adjective");
        adj1= scanner.nextLine();
        System.out.println("Give me another noun");
        noun2= scanner.nextLine();
        System.out.println("Give me a number");
        number= scanner.nextInt();
        System.out.println("Give me a adjective");
        adj2= scanner.nextLine();
        System.out.println("Give me a plural noun");
        pnoun1= scanner.nextLine();
        System.out.println("Give me another plural noun");
        pnoun2= scanner.nextLine();
        System.out.println("Give me another plural noun");
        pnoun3= scanner.nextLine();
        System.out.println("Give me a present tense verb");
        presentTenseVerb= scanner.nextLine();
        System.out.println("Give me that same verb in the past tense");
        sameVerbPastTense= scanner.nextLine();

        System.out.println(noun1+" the "+adj1+" frontier. These are the voyages of the starship "+noun2+" Its "+number+" year mission: to explore strange "+adj2+pnoun1+", to seek out "+adj2+ pnoun2+" and "+adj2+ pnoun3+", to boldly "+presentTenseVerb+" where no one has "+sameVerbPastTense+" before.");

    }
}
