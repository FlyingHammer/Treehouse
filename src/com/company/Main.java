package com.company;

public class Main {

    public static void main(String[] args) {
        Game game = new Game("treehouse");
        Prompter prompter = new Prompter(game);
        boolean isHits = prompter.PromptForGuess();
        if (isHits) {
            System.out.println("We got a hit!");
        } else {
            System.out.println("Sorry, that was a miss");
        }
    }
}
