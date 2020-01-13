package com.JackandKelly.hangman;

public class WordToArray {




        public char[] wordToCharArray(){

                String[] mysteryWordsArray = {"Volvo", "BMW", "Ford", "Mazda"};

                String word = mysteryWordsArray[(int) (Math.random() * mysteryWordsArray.length)];

                char wordInCharArray[] = new char[word.length()];

                for(int i = 0; i<word.length(); i++) {
                        wordInCharArray[i] = word.charAt(i);
                }

                makeUnknownCharArray(wordInCharArray);
                System.out.println(" ");
                System.out.println(word);

                return wordInCharArray;

        }

        public char[] makeUnknownCharArray(char[] wordInCharArray){

                char[] unknownCharArray = new char[wordInCharArray.length];

                for(int i = 0; i<wordInCharArray.length; i++){
                        unknownCharArray[i] = '_';
                }

                for(int i = 0; i<unknownCharArray.length; i++) {
                        System.out.print(unknownCharArray[i]);
                        System.out.print(" ");
                }

                return unknownCharArray;

        }










}
