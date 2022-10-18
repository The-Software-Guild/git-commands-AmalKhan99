import java.util.Scanner;
import java.util.Random;
public class LuckySevens {
    public static void main (String[]args){

        int noOfRolls=0;
        int totDollars;
        int biggestWin;
        int biggestRoll=0;

        //Output dollars
        System.out.println("How many dollars do you have?");
        //Assign total amount of dollars from input
        Scanner input= new Scanner(System.in);
        biggestWin= input.nextInt();
        totDollars=biggestWin;

        while(1<=totDollars){

            //add rolls
            Random random= new Random();
            int D1= random.nextInt(6)+1;
            int D2= random.nextInt(6)+1;
            int totalRoll = D1+D2; //Work out total roll

            //takes money if dice roll is equal to 7
            if(totalRoll==7){
                totDollars=totDollars+4;
                if(totDollars>biggestWin){
                    biggestWin=totDollars;
                    biggestRoll=noOfRolls+1;
                }
            } else {
                totDollars=totDollars-1;
            }
            noOfRolls++;


        }
        System.out.println("You rolled "+noOfRolls+" times and are left with "+totDollars);
        System.out.println("You should have quit when you had "+biggestWin+" dollars at roll "+biggestRoll);
    }
}
