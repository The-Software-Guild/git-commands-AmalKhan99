package com.sg.foundations.flowcontrol.ifs;
import java.util.Scanner;
public class BirthStones {
    public static void main(String[] args) {
        //Ask user for number and assign it to variable
        System.out.println("Can I have a number");
        Scanner inp = new Scanner(System.in);
        int number = inp.nextInt();

        //Checks what number that is equal to in month and birthstone and prints it out
        if(number==1){
            System.out.println("January's birthstone is Garnet");
        } else if (number==2) {
            System.out.println("February's birthstone is Amethyst");
        }else if (number==3) {
            System.out.println("March's birthstone is Aquamarine");
        }else if (number==4) {
            System.out.println("April's birthstone is Diamond");
        }else if (number==5) {
            System.out.println("May's birthstone is Emerald");
        }else if (number==6) {
            System.out.println("June's birthstone is Pearl");
        }else if (number==7) {
            System.out.println("July's birthstone is Ruby");
        }else if (number==8) {
            System.out.println("August's birthstone is Peridot");
        }else if (number==9) {
            System.out.println("September's birthstone is Sapphire");
        }else if (number==10) {
            System.out.println("October's birthstone is Opal");
        }else if (number==11) {
            System.out.println("November's birthstone is Topaz");
        }else if (number==12) {
            System.out.println("December's birthstone is Turquoise");
        }else {
            System.out.println("Sorry put in  anumber between 1 and 12");
        }
    }
}
