package com.company;

import com.company.Game;

import java.io.Console;
import java.util.Scanner;

/**
 * Created by gmckay on 2/15/2016.
 */
public class Prompter {

    private Game mGame;

    public Prompter(Game game) {
        this.mGame = game;
    }

    public void play() {
        while (mGame.getRemainingTries() > 0) {
            displayProgress();
            PromptForGuess();

        }
    }

    public boolean PromptForGuess() {
        Scanner console = new Scanner(System.in);
        //String guessAsString = console.readLine("Enter a Letter: ");
        boolean isHit = false;
        boolean isValidGuess = false;
        while (!isValidGuess){
            System.out.printf("Enter a Letter ");
            String guessAsString = console.nextLine();
            // char guess = guessAsString.charAt(0); -- Refactor to use new Method, See Below
            try {
                isHit = mGame.applyGuess(guessAsString);
                isValidGuess = true;
            } catch (IllegalArgumentException iae) {
                System.out.printf("%s. Please try again. \n", iae.getMessage());
            }
        }

        return isHit;


    }

    public void displayProgress() {
        System.out.printf("You have %d tries left to Solve: %s\n" ,
                            mGame.getRemainingTries(),
                            mGame.getCurrentProgress());
    }

}