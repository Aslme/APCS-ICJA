package com.JackandKelly.hangman;


public class Main {

    public static void main(String[] args) {
	// write your code here


        WordList wordList = new WordList();
        InitGame initGame = new InitGame();



        initGame.startGame();
        initGame.showCurrentWordProgress();
        initGame.getUserInput();





    }


}

