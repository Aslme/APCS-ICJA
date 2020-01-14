package com.JackandKelly.hangman;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class InitGame {

    WordList wordList = new WordList();

public int health = 8;

    public void displayWelcome(){
        System.out.println("---------------------------------------------------------------------------\nWelcome to Hangman. This is a game where we will test your wordy skills.\nYou will have to guess the letters to a mystery word and if you don't have\nwhat it takes you will be a murderer. -Joey\n---------------------------------------------------------------------------");
    }

    public void displayWordInBlanks(char[] characterArray){

        for (int i = 0; i < characterArray.length; i++) {
            System.out.print("_");
            System.out.print(" ");
        }
        System.out.println("");
    }




    public void startGame() {
        displayWelcome();
        System.out.println("\n\n");
        wordList.getRandomWord();

    }

    public void showCurrentWordProgress(){
        System.out.println("Here is the current word:");
        displayWordInBlanks(wordList.wordToCharArray(wordList.word));
        wordList.wordToCharArray(wordList.word);
        System.out.println("Please enter a letter...");
        checkAnswer(getUserInput(), wordList.wordToCharArray(wordList.word));
        System.out.println(wordList.wordToCharArray(wordList.word));
    }

    public char getUserInput(){
        Scanner sc = new Scanner(System.in);
        String wordEntered = sc.next();
        char letterEntered = wordEntered.charAt(0);
        return letterEntered;
    }

    public Boolean checkAnswer(char charEntered, char[] wordInCharArray){
        for(int i = 0; i<wordInCharArray.length; i++){
            if(charEntered == wordInCharArray[i]){
                System.out.println("ITS A MATCH");
            }
            else{
                System.out.println("NO LUCK");
            }
        }
        return true;
    }

}
