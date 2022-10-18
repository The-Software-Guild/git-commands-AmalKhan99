package com.sg.foundations.variables;

public class TheOrderOfThings {
    public static void main(String[] args) {

        double number;
        String opinion, size, age, shape, colour, origin, material, purpose;
        String noun;

        number = 5.0;
        opinion = "AWESOME";
        size = "teensy-weensy";
        age = "new";
        shape = "oblong";
        colour = "yellow";
        origin = "Martian";
        material = "platinum";
        purpose = "good";

        noun = "dragons";

        // Using the + with strings doesn't add -- it concatenates!
        System.out.println(origin + " " + opinion + " " + colour + " " + age + " " + shape
                + " " + noun + " " + number + " " + material + " " + purpose + " " + size);
    }
}
