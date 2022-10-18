package com.sg.foundations.flowcontrol.arrays;

public class FruitBasket {
    public static void main(String[] args) {
        String[] fruitBasket = {"Orange", "Apple", "Orange", "Apple", "Orange", "Apple",
                "Orange", "Apple", "Orange", "Orange", "Orange", "Apple", "Orange", "Orange",
                "Apple", "Orange", "Orange", "Apple", "Apple", "Orange", "Apple", "Apple",
                "Orange", "Orange", "Apple", "Apple", "Apple", "Banana", "Apple", "Orange",
                "Orange", "Apple", "Apple", "Orange", "Orange", "Orange", "Orange", "Apple",
                "Apple", "Apple", "Apple", "Orange", "Orange", "PawPaw", "Apple", "Orange",
                "Orange", "Apple", "Orange", "Orange", "Apple", "Apple", "Orange", "Orange",
                "Apple", "Orange", "Apple", "Kiwi", "Orange", "Apple", "Orange",
                "Dragonfruit", "Apple", "Orange", "Orange"};

        int numOranges = 0;
        int numApples = 0;
        int numOtherFruit = 0;

        // Fruit counting code goes here!
        for(int i=0; i<fruitBasket.length;i++){
            if (fruitBasket[i]=="Apple"){
                numApples = (numApples+1);
            } else if (fruitBasket[i]=="Orange") {
                numOranges= (numOranges+1);
            } else{
                numOtherFruit=numOtherFruit+1;
            }
        }
        System.out.println("Total number of fruit in basket: "+fruitBasket.length);
        System.out.println("Number of Apples: "+numApples);
        System.out.println("Number of Oranges: "+numOranges);
        System.out.println("Number of other fruit: "+numOtherFruit);


    }
}
