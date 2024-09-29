package ControlFlowStatements;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int randomNumber = random.nextInt(100)+1;
        int userGuess = 0;
        int userAttempt = 0;

        System.out.println("Welcome to the number guessing game");
        System.out.println("I have selected a number between 1 to 100.  Try to guess it!!!");

        while ( userGuess != randomNumber){
            System.out.println("Enter your guess: ");
            userGuess = scanner.nextInt();
            userAttempt++;

            if(userGuess < randomNumber){
                System.out.println("Guess is too low. Try Again!!");
            } else if (userGuess > randomNumber) {
                System.out.println("Guess is too high. Try Again!!");
            } else {
                System.out.println("Guessed Number is correct!! You took " +userAttempt+ " attempts");
            }
        }

        scanner.close();
    }
}
