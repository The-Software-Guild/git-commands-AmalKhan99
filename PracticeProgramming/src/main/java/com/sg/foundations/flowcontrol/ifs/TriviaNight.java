package com.sg.foundations.flowcontrol.ifs;
import java.util.Scanner;
public class TriviaNight {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int correct=0;
        System.out.println("Whats the capital of Wales?\n A)Edinburgh \nB)Newquay \nC)Cardiff");
        String answer1= input.nextLine();
        if(answer1.equals("C")){
            correct++;
        }

        System.out.println("Whats the capital of England?\n A)Edinburgh \nB)Newquay \nC)Cardiff");
        String answer2= input.nextLine();
        if(answer2.equals("A")){
            correct++;
        }
        System.out.println("Whats the capital of Austria?\n A)Vienna \nB)Newquay \nC)Cardiff");
        String answer3= input.nextLine();
        if(answer3.equals("A")){
            correct++;
        }

        if (correct==1){
            System.out.println("Maybe brush up on some geography, you got "+correct+" correct");
        } else if (correct==2) {
            System.out.println("Not bad, you got "+correct+" correct");
        } else if (correct==3) {
            System.out.println("Amazing!! You got"+correct+" correct");
        }

    }
}
