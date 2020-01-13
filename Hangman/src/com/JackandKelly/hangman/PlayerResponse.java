/**
 * Player response gets responses from player
 * This class keeps input separate from the game logic (especially since AP does not test input)
 *
 * @author Dr. Kahan with assist from WJS
 * see https://stackoverflow.com/questions/58884220/trouble-finding-if-the-range-is-empty-to-allow-me-to-move-on-with-the-code-java/58884275#comment104057018_58884275
 * @version 1.0
 * adapted from same class in Nim project
 */

import java.util.Scanner;
import java.util.InputMismatchException;

public class PlayerResponse {
    // instance variable
    private Scanner sIn;// object to read from terminal window

    /**
     * Constructor for objects of class PlayerResponse
     */
    public PlayerResponse() {
// initialize instance variable
        sIn = new Scanner(System.in);
    }


    /**
     * get the answer to a yes or no question from the user
     *
     * with help from https://www.geeksforgeeks.org/gfact-51-java-scanner-nextchar/
     * @param prompt, general prompt that asks a question like Do you want to play again?
     * @return true for yes, false for no
     */
    boolean getYesNoFromUser(String prompt) {
        System.out.println(prompt);
        while (true) {//note not infinite loop because return exits the loop, could use do while, also
            System.out.println("Please enter y for yes or n for no");
            System.out.print("Enter: ");
            char v = this.sIn.next().charAt(0);
            if ("YyNn".indexOf(v) != -1) {//some kind of yes or no
                sIn.nextLine();//clear input buffer
                return ("Yy".indexOf(v) != -1);//some kind of yes
            }
            System.out.println("The character you entered is not a y or n.");
        }
    }

    /**
     * Method getLetterFromUser
     *
     * @param prompt game specific message to prompt for letter
     * @return a lower case letter entered by the user
     */
    char getLetterFromUser(String prompt) {
        System.out.println(prompt);
        while (true) {//note not infinite loop because return exits the loop, could use do while, also
            System.out.print("Enter a letter: ");
            char v = Character.toLowerCase(this.sIn.next().charAt(0));
            if (Character.isLetter(v)) {//some kind of letter
                sIn.nextLine();//clear input buffer
                return v;
            }
            System.out.println("The character you entered is not a letter.");
        }
    }
}


