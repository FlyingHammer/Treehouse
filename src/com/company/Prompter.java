package com.company;

import com.company.Game;

import java.io.Console;

/**
 * Created by gmckay on 2/15/2016.
 */
public class Prompter {

    private Game mGame;

    public Prompter(Game game) {
        this.mGame = game;
    }

    public boolean PromptForGuess() {
        Console console = System.console();
        String guessAsString = console.readLine("Enter a Letter: ");
        char guess = guessAsString.charAt(0);
        return mGame.applyGuess(guess);
    }

}