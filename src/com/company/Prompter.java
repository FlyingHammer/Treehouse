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

    public boolean PromptForGuess() {
        Scanner console = new Scanner(System.in);
        //String guessAsString = console.readLine("Enter a Letter: ");
        System.out.printf("Enter a Letter ");
        String guessAsString = console.nextLine();
        char guess = guessAsString.charAt(0);
        return mGame.applyGuess(guess);
    }

}