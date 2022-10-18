package com.sg.foundations.flowcontrol.whiles;
import java.util.Random;
public class LazyTeenager {
    public static void main(String[]args){

        Random random= new Random();
        int x=10;


        int i=1;
        do{
            System.out.println("Clean your room!("+i+")");
            i++;
            if((random.nextInt(100))<=x){
                System.out.println("Fine, I'll clean my room!!");
                break;
            }
            else{
                x++;
            }

        }while(i<=7);
        if (i==8) {
            System.out.println("Thats it youre grounded and your xbox is being taken away!!");
        }


    }
}
