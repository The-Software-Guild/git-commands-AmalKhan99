package BasicProgrammingAssess;
import java.util.Scanner;
public class HealthyHeart {
    public static void main(String[]args){
        System.out.println("Whats your age?");

        Scanner scanner= new Scanner(System.in);
        int age= scanner.nextInt();

        int maxHR= 220-age;
        double lhr = 0.5*maxHR;
        double hhr =0.85*maxHR;

        System.out.println("Your max heart rate should be"+ maxHR+" beats per minute");
        System.out.println("Your target heart rate zone is "+lhr+" - "+ hhr+ " beats per minute");
    }
}