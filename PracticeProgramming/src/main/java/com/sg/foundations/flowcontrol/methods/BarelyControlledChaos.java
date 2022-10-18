package com.sg.foundations.flowcontrol.methods;
import java.util.Random;
public class BarelyControlledChaos {
    public static void main(String[] args) {

        String colour = callColour(); // call colour method here
        String animal = callAnimal(); // call animal method again here
        String colourAgain = callColour(); // call colour method again here
        int weight = callNum(5,200); // call number method with a range between 5 - 200
        int distance =callNum(10,20); // call number method with a range between 10 - 20
        int number = callNum(10000,20000); // call number method with a range between 10000 - 20000
        int time = callNum(2,6); // call number method with a range between 2 - 6

        System.out.println("Once, when I was very small...");

        System.out.println("I was chased by a " + colour + ", "
                + weight + "lb " + " miniature " + animal
                + " for over " + distance + " miles!!");

        System.out.println("I had to hide in a field of over "
                + number + " " + colourAgain + " poppies for nearly "
                + time + " hours until it left me alone!");

        System.out.println("\nIt was QUITE the experience, "
                + "let me tell you!");
    }

    // Call colour method
    public static String callColour(){
        Random random = new Random();
        int x = random.nextInt(4);
        switch (x){
            case 0:
                return "blue";
            case 1:
                return "green";
            case 2:
                return "purple";
            case 3:
                return "orange";
            case 4:
                return "yellow";
        }
        return null;
    }
    // Call animal method
    public static String callAnimal(){
        Random random = new Random();
        int x = random.nextInt(4);
        if (x==0) {
            return "giraffe";
        } else if (x==1) {
            return "cat";
        } else if (x==2) {
            return "dog";
        } else if (x==3) {
            return "panda";
        } else if (x==4) {
            return "monkey";
        }
        return null;
    }
    // Call random number from a range method
    public static int callNum(int x, int y){
        Random random=new Random();
        int low=x;
        int high=y;
        int randomNum= random.nextInt((high+1)-low)+low;
        return randomNum;
    }
}
