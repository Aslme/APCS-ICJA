package com.JackandKelly.hangman;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String[] possibleWords = {"watch", "tap", "hi"};

        boolean weArePlaying = true;
        while (weArePlaying == true) {
            System.out.println("---------------------------------------------------------------------------\nWelcome to Hangman. This is a game where we will test your wordy skills.\nYou will have to guess the letters to a mystery word.\n---------------------------------------------------------------------------");

            char[] randomWordToGuess = possibleWords[random.nextInt(possibleWords.length)].toCharArray();
            int amountOfGuesses = randomWordToGuess.length * 2;
            char[] playerGuess = new char[amountOfGuesses/2];

            for(int i = 0; i < playerGuess.length; i++){
                playerGuess[i] = '_';
            }

            boolean wordIsGuessed = false;
            int tries = 0;
            while(!wordIsGuessed && tries != amountOfGuesses) {
                System.out.print("Current guesses: ");
                printArray(playerGuess);
                System.out.printf("You have %d lives left.\n", amountOfGuesses - tries);
                System.out.println("Enter a character... (lowercase)");
                char playerInput = scanner.nextLine().charAt(0);
                tries++;
                System.out.println();

                if (playerInput=='-'){
                    weArePlaying = false;
                    wordIsGuessed = true;
                } else {
                    for (int i = 0; i < randomWordToGuess.length; i++) {
                        if(randomWordToGuess[i]==playerInput){
                            playerGuess[i] = playerInput;

                        }
                    }

                    if(ifTheWordGuessed(playerGuess)) {
                        wordIsGuessed = true;
                        System.out.println("You Win!");
                    }
                }




            }

            if (!wordIsGuessed){
                System.out.println("You ran out of guesses");
            }
            System.out.println("Do you want to play another game? (yes/no)");
            String anotherGame = scanner.nextLine();
            if(anotherGame=="yes"){
                weArePlaying = true;
            }else if(anotherGame=="no"){
                weArePlaying = false;
            }

        }

        System.out.println("Game Over...");


        // write your code here
    }


    private static void printArray(char[] array) {

        for(int i = 0; i < array.length; i++){
            array[i] = '_';
            System.out.print(array[i] + " ");
        }

        System.out.println();

    }

    private static boolean ifTheWordGuessed(char[] playerGuess) {
        for (int i = 0; i < playerGuess.length; i++) {
            if (playerGuess[i]!='_') {
                return true;
            }
        }
        return false;
    }


}
