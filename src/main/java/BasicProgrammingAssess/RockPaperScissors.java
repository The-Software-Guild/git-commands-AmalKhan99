package BasicProgrammingAssess;
import java.util.Objects;
import java.util.Scanner;
import java.util.Random;
public class RockPaperScissors {
    public static void main(String[] args) {
        //Variable declarations
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int randomNo;
        int userAnswer = 0;
        String userChoice;
        String[] compChoice = new String[]{"rock", "paper", "scissors"};
        String computerAnswer;
        int wins = 0;
        int losses = 0;
        int ties = 0;
        boolean playMoreRounds= true;
        do {
            //Prompt user for number of rounds between 1 and 10
            System.out.println("How may rounds between 1 and 10 would you like to play?");
            int rounds = scanner.nextInt();

            //Starts loop of game
            if (rounds <= 10) { //Only runs game if the rounds are within range

                for (int i = 0; i < rounds; i++) { //loops for set amount of rounds

                    //Gathers whether user chooses rock, paper of scissors
                    System.out.println("Please choose between rock, paper or scissors");
                    Scanner input = new Scanner(System.in);
                    userChoice = input.nextLine();
                    //Assigns user choice to a number
                    if (userChoice.equals("rock")) {
                        userAnswer = 0;
                    } else if (userChoice.equals("paper")) {
                        userAnswer = 1;
                    } else if (userChoice.equals("scissors")) {
                        userAnswer = 2;
                    }

                    //Computer chooses rock, paper or scissors
                    randomNo = random.nextInt(3);
                    computerAnswer = compChoice[randomNo];
                    System.out.println("I have chosen " + computerAnswer);

                    //Decide who wins the round
                    if (userAnswer == randomNo) {
                        System.out.println("Its a tie!!!");
                        ties++;
                    } else if (userAnswer == 0) {
                        if (randomNo == 1) {
                            System.out.println("I win!");
                            losses++;
                        } else if (randomNo == 2) {
                            System.out.println("You win");
                            wins++;
                        }
                    } else if (userAnswer == 1) {
                        if (randomNo == 0) {
                            System.out.println("You win");
                            wins++;
                        } else if (randomNo == 2) {
                            System.out.println("I win");
                            losses++;
                        }
                    } else if (userAnswer == 2) {
                        if (randomNo == 0) {
                            System.out.println("I win");
                            losses++;
                        } else if (randomNo == 2) {
                            System.out.println("You win");
                            wins++;
                        }
                    }
                }
                //Outputs total losses, ties and wins
                System.out.println("You have won " + wins + " times, drawn with me " + ties + " times, and lost to me " + losses + " times.");

                //Calculate who won overall
                if ((ties > losses) && (ties > wins)) {
                    System.out.println("We have tied overall");
                } else if (losses > wins) {
                    System.out.println("You have lost and I've won!!!");
                } else if (wins > losses) {
                    System.out.println("You've won!!! Congrats!!!");
                }

                //Determine whether to play again
                System.out.println("Would you like to play again? type y/n");
                Scanner answer1 = new Scanner(System.in);
                String answer = answer1.nextLine();

                if (answer.equals("y")) {
                    playMoreRounds = true;
                } else if (answer.equals("n")) {
                    playMoreRounds = false;
                }
            } else {
                System.out.println("Sorry that's not within the valid range of rounds!");
            }
        } while (playMoreRounds == true);
    }
}
