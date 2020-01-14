package com.JackandKelly.hangman;

import java.util.Scanner;

public class InitGame {

WordList wordList = new WordList();

String word = wordList.word;




public int health = 8;

public int turnNumber = 0;
public char[] wrongAnswers = new char[20];


    public void displayWelcome(){
        System.out.println("---------------------------------------------------------------------------\nWelcome to Hangman. This is a game where we will test your wordy skills.\nYou will have to guess the letters to a mystery word and if you don't have\nwhat it takes you will be a murderer. -Joey\n---------------------------------------------------------------------------");
    }

    char userWordUpdated[] = new char[20];

    public char[] displayWordInBlanks(char[] characterArray){



        for (int i = 0; i < characterArray.length; i++) {
            userWordUpdated[i] = '_';
        }
        System.out.println("");

        return userWordUpdated;
    }




    public void startGame() {
        wordList.getRandomWord();
        displayWelcome();
        System.out.println("\n\n");



    }

    public void showCurrentWordProgress(){
        System.out.println("Here is the current word:");
        displayWordInBlanks(wordList.wordToCharArray(wordList.word));
        wordList.wordToCharArray(wordList.word);
        System.out.println("Please enter a letter...");
        checkAnswer(getUserInput(), wordList.wordToCharArray(wordList.word));
        System.out.println(wordList.wordToCharArray(wordList.word));

        //prints updated words with dashes
        System.out.println(userWordUpdated);
    }

    public char getUserInput(){
        Scanner sc = new Scanner(System.in);
        String wordEntered = sc.next();
        char letterEntered = wordEntered.charAt(0);
        wrongAnswers[turnNumber] = letterEntered;
        return letterEntered;
    }

    public void checkAnswer(char charEntered, char[] wordInCharArray){
        for(int i = 0; i<wordInCharArray.length; i++){
            if(charEntered == wordInCharArray[i]){
                userWordUpdated[i] = charEntered;
            }


        }
        turnNumber++;
    }

    public void gameResponse(){

    }

}
