import java.util.Scanner;

public class InterestCalculator {
    public static void main(String[] args) {

        //Variable declarations
        Scanner input=new Scanner(System.in);
        float currentBalance;
        int years;
        float interestRate;
        float newAmount;
        float earnedMoney=0;


        //Gathers data from user and assigns to variables
        System.out.println("How much do you want to invest?");
        currentBalance=input.nextInt();
        System.out.println("How many years do you want to invest?");
        years=input.nextInt();
        System.out.println("What is the interest rate?");
        interestRate=input.nextInt();

        //Output
        for(int i=1;i<=years;i++){
            System.out.println("\n Calculating...");
            System.out.println("Year "+i+":");
            System.out.println("Began with: $"+currentBalance);
            for(int x=0;x<4;x++) {
                newAmount = (currentBalance * (1 + (interestRate/100)));
                earnedMoney=earnedMoney+ (newAmount-currentBalance);
                currentBalance=newAmount;
            }
            System.out.println("Earned $"+earnedMoney);
            earnedMoney=0;
            System.out.println("Ended with $"+currentBalance);
        }

    }
}
