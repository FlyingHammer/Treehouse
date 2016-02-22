package com.company;

public class Main {

    public static void main(String[] args) {
        Game game = new Game("treehouse");
        Prompter prompter = new Prompter(game);
        prompter.play();
    }
}
