package com.JackandKelly.hangman;


public class Main {

    public static void main(String[] args) {
	// write your code here


        InitGame initGame = new InitGame();
        WordList wordList = new WordList();


        initGame.startGame();
        initGame.showCurrentWordProgress();
        initGame.getUserInput();





    }


}

