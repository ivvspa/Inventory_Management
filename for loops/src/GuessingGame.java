import java.util.Scanner;
import java.util.Random;

public class GuessingGame {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);

        int randomNum = rand.nextInt(100);
        System.out.println("Hello and welcome to the amazing Guessing game!\nTry to guess a random number with as few attempts as possible!");
        System.out.println("If you would like to quit, type \"quit\".");



        int n = 0;
        while (n >= 0) {

            if (scan.hasNextInt()) {

                int guess = scan.nextInt();
                System.out.println("Your guess is " + guess + "?");
                System.out.println("Drumroll, please......");


                if (guess == randomNum) {

                    System.out.println("Congratulations! You win!");
                    System.out.println("You won in " + (n + 1) + " guesses.");
                    System.exit(0);

                } else if (guess < randomNum) {

                    System.out.println("Your guess is too low! Try again.");
                    n++;

                } else {

                    System.out.println("Your guess is too high! Try again.");
                    n++;

                }

            }

            else if (scan.hasNext() && scan.next().equals("quit")) {

                System.out.println("Really? Welp, see you soon! \nOh, by the way, it was " + randomNum);
                System.exit(0);

            }

            else {

                String invalidInput = scan.nextLine();
                System.out.println("Error: This is not a valid number.");
                System.out.println("Try not breaking the game next time.");
                System.exit(0);

            }

        }

    }

}