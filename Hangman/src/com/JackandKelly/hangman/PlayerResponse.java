package com.JackandKelly.hangman;

public class PlayerResponse {


    public void checkResponse(){
        char playerSaysLetter = 'V';

        char wordInCharArray[] = new char[6];

        for(int i=0; i< wordInCharArray.length; i++){

            if (playerSaysLetter == wordInCharArray[i]) {
                System.out.println(playerSaysLetter + " was correct!");
            }
            else{
                System.out.println(playerSaysLetter + " was incorrect. You lose a life.");
            }

        }


    }





}
