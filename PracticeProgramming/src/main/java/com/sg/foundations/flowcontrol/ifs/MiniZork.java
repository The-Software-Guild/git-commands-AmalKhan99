package com.sg.foundations.flowcontrol.ifs;
import java.util.Scanner;
public class MiniZork {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        System.out.println("You are standing in an open field west of a white house,");
        System.out.println("With a boarded front door.");
        System.out.println("There is a small mailbox here.");
        System.out.println("There is also a small hole in a ditch");
        System.out.print("Go to the house, open the mailbox or jump in the ditch and explore the hole explore the hole or run away? ");

        String action = userInput.nextLine();

        if (action.equals("open the mailbox")) {
            System.out.println("You open the mailbox.");
            System.out.println("It's really dark in there.");
            System.out.print("Look inside or stick your hand in? ");
            action = userInput.nextLine();

            if (action.equals("look inside")) {
                System.out.println("You peer inside the mailbox.");
                System.out.println("It's really very dark. So ... so very dark.");
                System.out.print("Run away or keep looking? ");
                action = userInput.nextLine();

                if (action.equals("keep looking")) {
                    System.out.println("Turns out, hanging out around dark places isn't a good idea.");
                    System.out.println("You've been eaten by a grue.");
                } else if (action.equals("run away")) {
                    System.out.println("You run away screaming across the fields - looking very foolish.");
                    System.out.println("But you alive. Possibly a wise choice.");
                }
            } else if(action.equals("stick your hand in")) { }
        } else if (action.equals("go to the house")) {
            System.out.println("Within the house there are some stairs do you stay exploring downstairs or move upstairs");
            action = userInput.nextLine();
            if(action.equals("explore downstairs")){
                System.out.println("You keep exploring below, looking for what no one knows");
            }
            else if(action.equals("Explore upstairs")){
                System.out.println("You walk up the creaky old stairs to a dusty attic upstairs");
            }
        }
        else if (action.equals("jump in the ditch")){
            System.out.println("As you jump into the ditch you see that it actually appears to be a lake where you can swim down, however the hole you spotted before leads elsewhere. What do you choose?");
            action = userInput.nextLine();
            if (action.equals("swim down")) {
                System.out.println("You keep swimming and spot something glittering on the ground");
                System.out.println("It's gold! You could use this for later!");
            }
            else if(action.equals("explore the hole"));{
                System.out.println("The hole turns out to be a trench. You crawl into it to see where it leads and the reach a fork in the trench. The left path smells foul whilst the right you hear some growling noises. Do you choose the right or left path?");
                action = userInput.nextLine();
                if (action.equals("left")){
                    System.out.println("You fall into a sewer! That's not going to come out in the wash...");
                }
                else if(action.equals("right")){
                    System.out.println("Oh no you must fight!!!");
                }
            }
        } else if (action.equals("run away")) {
            System.out.println("You run away and bash straight into a tree, you pass out for some time and wake up when its dark. It's not safe staying in the open but travelling at night is also dangerous. Do you move on or stay and camp the night out?");
            action = userInput.nextLine();
            if(action.equals("move on")){
                System.out.println("You move on trekking into the depths and darkness of the forest...");
            } else if (action.equals("stay and camp")) {
                System.out.println("You start a fire and set up camp for the night, everything is fine..for now...");
            }
        }
    }
}
