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

    public boolean applyGuess(char letter) {
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

