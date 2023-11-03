import java.util.*;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        Random random= new Random();
        int  lower= 1;
        int  upper= 100;
        int maxAttempts=10;
        int rounds =0;
        int totalAttempts= 0;

        System.out.println("Welcome to my Guessing Number Game!");
        System.out.println("Generate a random number between 1 and 100.  guess it What a number?.");

        boolean playAgain= true;

        while (playAgain){
            int randomNumber= random.nextInt(upper- lower+ 1) + lower;
            int attempts= 0;
            boolean GuessedCorrectly = false;

            while (attempts < maxAttempts && !GuessedCorrectly) {
                System.out.print("Enter your guess number: ");
                int userGuess = scanner.nextInt();
                attempts++;

                if (userGuess < randomNumber) {
                    System.out.println("Your guess is too low. Try a higher number.");
                } else if (userGuess > randomNumber) {
                    System.out.println("Your guess is too high. Try a lower number.");
                } else {
                    GuessedCorrectly = true;
                    System.out.println("Congratulations! Your guess number " + randomNumber + " in " + attempts + " attempts.");
                }
            }

            if (!GuessedCorrectly) {
                System.out.println("Sorry you have reached the maximum number of attempts. The correct number was " + randomNumber + ".");
            }
            totalAttempts += attempts;
            rounds++;
            System.out.println("Your current score: " + totalAttempts + " total attempts in " + rounds + " rounds.");
            System.out.print("Do you try once more ? (yes/no): ");
            String playAgainResponse = scanner.next().toLowerCase();
            playAgain = playAgainResponse.equals("yes") || playAgainResponse.equals("y");

        }
        System.out.println("Thanks for playing! Your final score: " + totalAttempts + " total attempts in " + rounds + " rounds.");
        System.out.println("CHAL NIKL BHOSDIKE");
    }
}
