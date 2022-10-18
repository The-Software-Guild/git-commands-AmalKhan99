import java.util.Scanner;

public class Factoriser {

    public static void main(String[]args) {

        int noOfFactors = 0;
        //Get number from user
        System.out.println("What number would you like to factor?");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println("The factors of " + num + " are:");


        //Loop to work out factors
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.print(i+", ");
                noOfFactors++;
            }
        }
        System.out.println();
        System.out.println(num + " has a total of " + noOfFactors + " factors.");
        if (noOfFactors > 2) {
            System.out.println(num+" is not a prime number");
        } else System.out.println(num+" is a prime number");
    }
}
