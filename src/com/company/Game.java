package com.company;

public class Game {
    private int score;
    private Frame currentFrame;
    private int remainingRollsOfBonus = 0;

    public Game() {
        currentFrame = new Frame();
    }


    public static void main(String[] args) {
        Game game = new Game();

        // FRAME 1: 10 + 4 +2 = 16
        game.roll(10);

        // FRAME 2: 6
        game.roll(4);
        game.roll(2);


        print(game.score());
    }

    private static void print(int score) {
        System.out.println(score);
    }

    void roll(int pins) {
        currentFrame.roll(pins);
        if (remainingRollsOfBonus > 0) {
            score = score + pins;
            remainingRollsOfBonus = remainingRollsOfBonus - 1;
        }

        if (currentFrame.isExhausted()) {
            score = score + currentFrame.score();
            if (currentFrame.isSpare()) {
                remainingRollsOfBonus = 1;
            }if (currentFrame.isStrike()) {
                remainingRollsOfBonus = 2;
            }
            currentFrame = new Frame();
        }
    }

    int score() {
        return score;
    }

    private class Frame {
        private int score;
        private int numberOfRolls = 0;

        public void roll(int pins) {
            this.score = score + pins;
            numberOfRolls = numberOfRolls + 1;
        }

        public boolean isExhausted() {
            boolean isStrike = numberOfRolls == 1 && score == 10;
            boolean isSpare = numberOfRolls == 2 && score == 10;
            boolean isNormal = numberOfRolls == 2;
            if (isStrike || isSpare || isNormal) {
                return true;
            } else {
                return false;
            }
        }

        public int score() {
            return score;
        }

        public boolean isSpare() {
            if (numberOfRolls == 2 && this.score == 10) {
                return true;
            } else {
                return false;
            }
        }

        public boolean isStrike() {
            return numberOfRolls == 1 && score == 10;
        }
    }
}

