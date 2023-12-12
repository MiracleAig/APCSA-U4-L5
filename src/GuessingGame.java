import java.util.Scanner;

public class GuessingGame {

    static Scanner scan = new Scanner(System.in);
    static int randomNumber = (int) (Math.random() * 1000 + 1);
    static int numberOfGuesses;
    public static void main(String[] args) {

        System.out.println("---Guessing Game---");
        System.out.println("I picked a number from 1 to 1000. Try to guess it.");
        makeGuess();
    }

    public static void makeGuess(){
        System.out.print("Enter a guess: ");
        int guess = scan.nextInt();
        System.out.println();
        tryGuess(guess);

    }

    public static void tryGuess(int guess){
        if(guess < randomNumber){
            System.out.println("Too low, try again.");
            numberOfGuesses++;
            makeGuess();
        }else if (guess > randomNumber){
            System.out.println("Too high, try again.");
            numberOfGuesses++;
            makeGuess();
        } else if (guess == randomNumber) {
            numberOfGuesses++;
            System.out.println("You got my number in " + numberOfGuesses + " guesses!");
        }
    }


}
