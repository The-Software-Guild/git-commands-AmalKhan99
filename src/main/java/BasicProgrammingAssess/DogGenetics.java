package BasicProgrammingAssess;
import java.util.Scanner;
import java.util.Random;
public class DogGenetics {
    public static void main(String[]args){
        System.out.println("What is your dogs name?"); //Output dog name
        Scanner scanner=new Scanner(System.in);
        String dogName= scanner.nextLine(); //Establishes input as dog name

        System.out.println("Oh! I have a report on "+dogName+". The report says that "+dogName+" is:");

        int prevP=100;//declare probability variable
        int totalProb = 0; //declares the variable for total probability outputted so far
        String[] breeds={"Cocker Spaniel","Shih Tzu","Labrador","Bull Terrier","German Shephard"}; //initialises array

        //Randomly assign percentage to 5 dog breeds
        for(int i=0;i<((breeds.length)-1);i++){

            Random random = new Random();
            int percentage= random.nextInt(prevP)+1; //Generates random percentage
            System.out.println(percentage+"% "+breeds[i]+"."); //Outputs percentage for that element in array
            prevP= prevP-percentage; //Takes away outputted percentage from bound to use in random generator
            totalProb= totalProb+percentage;
        }
        System.out.println((100-totalProb)+"% "+breeds[4]);


    }
}