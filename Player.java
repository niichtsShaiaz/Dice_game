/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dice_game;

import java.util.Scanner;

/**
 *
 * @author Shxnna
 */
public class Player {

    private int guess1;
    private int guess2;
    private boolean isGame;
    private int roundsWon;
    private int roundsLost;

    Scanner scanner = new Scanner(System.in);

    public Player(int guess1, int guess2, boolean isGame) {
        this.guess1 = guess1;
        this.guess2 = guess2;
        this.isGame = isGame;
    }

    public void setGuess1() {
        int input = scanner.nextInt();
        this.guess1 = input;

    }

    public void setGuess2() {
        int input = scanner.nextInt();
        this.guess2 = input;

    }

    public void options1() {
        System.out.println("Input guess 1 (1-6)");

    }

    public void options2() {
        System.out.println("\nInput guess 2 (1-6)");

    }

    public void keepGoing() {
        System.out.println("\n----------\nWould you like to continue? y/n");
        String input = scanner.next();

        switch (input) {
            case "Y":
            case "y":
                isGame = true;
                break;

            case "N":
            case "n":
                isGame = false;
                break;

            default:
                keepGoing();

        }
    }

    public boolean isIsGame() {
        return isGame;
    }

//    public boolean checkDice(Dice dice) {
//        if (((dice.getValue1() == this.guess1) || (dice.getValue2() == this.guess1)) && ((dice.getValue1() == this.guess2) || (dice.getValue2() == this.guess2))) {
//            System.out.println("You guessed correct!\nFace values were: "+dice.getValue1() + " " + dice.getValue2());
//            return true;
//        } else {
//            System.out.println("You guessed wrong ;-(\nFace values were: "+dice.getValue1() + " " + dice.getValue2());
//            return false;
//        }
//
//    }
    public boolean checkDice(Dice dice) {
        boolean b = false;
        if (((this.guess1 == dice.getValue1()))) {
            if (this.guess2 == dice.getValue2()) {

                System.out.println("You guessed correct!\nFace values were: " + dice.getValue1() + " " + dice.getValue2());
                b = true;
                roundsWon++;
            }
            if (this.guess2 != dice.getValue2()) {
                System.out.println("You almost had it!\nFace values were: " + dice.getValue1() + " " + dice.getValue2());
                b = false;
                roundsLost++;
            }
        } else if (this.guess1 == dice.getValue2()) {
            if (this.guess2 == dice.getValue1()) {

                System.out.println("You guessed correct!\nFace values were: " + dice.getValue1() + " " + dice.getValue2());
                b = true;
                roundsWon++;

            }
            if (this.guess2 != dice.getValue1()) {
                System.out.println("You almost had it!\nFace values were: " + dice.getValue1() + " " + dice.getValue2());
                b = false;
                roundsLost++;
            }
        } else {
            System.out.println("You guessed wrong.\nFace values were: " + dice.getValue1() + " " + dice.getValue2());
            b = false;
            roundsLost++;
        }
        return b;
    }

    public boolean checkDice2(Dice dice) {
        boolean b = false;
        if (((this.guess1 == dice.getValue1()))) {
            if (this.guess2 == dice.getValue2()) {

                b = true;

            }
            if (this.guess2 != dice.getValue2()) {

                b = false;

            }
        } else if (this.guess1 == dice.getValue2()) {
            if (this.guess2 == dice.getValue1()) {

                b = true;

            }
            if (this.guess2 != dice.getValue1()) {

                b = false;

            }
        } else {

            b = false;

        }
        return b;
    }

    public int getGuess1() {
        return guess1;
    }

    public int getGuess2() {
        return guess2;
    }

    public int getRoundsWon() {
        return roundsWon;
    }

    public int getRoundsLost() {
        return roundsLost;
    }

    public String endGame(int n) {

        return "Game rounds played: " + n;
    }

}
