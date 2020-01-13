package com.JackandKelly.hangman;

import java.util.concurrent.SynchronousQueue;

public class Main {

    public static void main(String[] args) {
	// write your code here

        InitGame initGame = new InitGame();
        WordList wordList = new WordList();

        initGame.startGame();
        System.out.println(wordList.wordToCharArraySetup(wordList.getRandomWord()));



    }
}

