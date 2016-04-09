package com.company;

/**
 * Created by gmckay on 2/15/2016.
 */
public class Game {
    public static final int MAX_MISSES = 7;
    private String mAnswer;
    private String mHits;
    private String mMisses;

    //constructor

    public Game(String answer) {
        this.mAnswer = answer;
        mHits = "";
        mMisses = "";
    }

    private char validateGuess(char letter) {
        if (!Character.isLetter(letter)) {
            throw new IllegalArgumentException("A letter is required");
        }
        letter = Character.toLowerCase(letter);
        if (mMisses.indexOf(letter) >= 0 || mMisses.indexOf(letter) >= 0) {

            throw new IllegalArgumentException(letter + " has already been guessed!");
        }

        return letter;
    }


    public boolean applyGuess(String letters) {
        if (letters.length() == 0) {
            throw new IllegalArgumentException("No Letters Found");
        }

        return applyGuess(letters.charAt(0));
    }

    public boolean applyGuess(char letter) {
        letter = validateGuess(letter);
        boolean isHits = mAnswer.indexOf(letter) >= 0;
        if (isHits) {
            mHits = mHits + letter; // could also use mHits += Letter, but I think this is more readable.
        } else {
            mMisses += letter;
        }
        return isHits;
    }

    public String getCurrentProgress() {

        String progress = "";
         for (char letter : mAnswer.toCharArray()) {
            char display = '-';
            if (mHits.indexOf(letter) >= 0) {
                display = letter;
            }
            progress += display;
        }
        return progress;
    }

    public int getRemainingTries() {
        return MAX_MISSES - mMisses.length();
    }
 }

