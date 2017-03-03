/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dice_game;

import java.util.ArrayList;

/**
 *
 * @author Shxnna
 */
public class Statistics {
    
    //ArrayList avgSum = new ArrayList();
    private double avgBet;
    private double avgBetWin;
    private double avgSum;
    private int gamesLost;
    private int gamesWon;
    
    private int value1;
    private int value2;
    private int value3;
    private int value4;
    private int value5;
    private int value6;

    public Statistics(double avgBet, double avgBetWin, double avgSum, int gamesLost, int gamesWon, int value1, int value2, int value3, int value4, int value5, int value6) {
        this.avgBet = avgBet;
        this.avgBetWin = avgBetWin;
        this.avgSum = avgSum;
        this.gamesLost = gamesLost;
        this.gamesWon = gamesWon;
        this.value1 = value1;
        this.value2 = value2;
        this.value3 = value3;
        this.value4 = value4;
        this.value5 = value5;
        this.value6 = value6;
    }
    
    
    public void addSum(Dice dice)
    {
        avgSum += dice.getSum();

    }
    
    public double avgSum(int n)
    {
        
        return avgSum / n / 2;
    }
    
    public void addBet(Bet bet)
    {
        avgBet +=bet.getBetAmount();
    }
    
    public double avgBet(int n)
    {
        return avgBet / n;
    }
    
    public void addValue(Dice dice)
    {
        switch(dice.getValue1()){
            case 1:
                this.value1++;
                break;
                
            case 2:
                this.value2++;
                break;
                
            case 3:
                this.value3++;
                break;
                
            case 4:
                this.value4++;
                break;
            
            case 5:
                this.value5++;
                break;
                
            case 6:
                this.value6++;
                break;
            default:
                break;
                
        }
                switch(dice.getValue2()){
            case 1:
                this.value1++;
                break;
                
            case 2:
                this.value2++;
                break;
                
            case 3:
                this.value3++;
                break;
                
            case 4:
                this.value4++;
                break;
            
            case 5:
                this.value5++;
                break;
                
            case 6:
                this.value6++;
                break;
            default:
                break;
                
        }
        
    }

    public double getAvgBet() {
        return avgBet;
    }

    public double getAvgBetWin() {
        return avgBetWin;
    }

    public double getAvgSum() {
        return avgSum;
    }

    public int getGamesLost() {
        return gamesLost;
    }

    public int getGamesWon() {
        return gamesWon;
    }

    public int getValue1() {
        return value1;
    }

    public int getValue2() {
        return value2;
    }

    public int getValue3() {
        return value3;
    }

    public int getValue4() {
        return value4;
    }

    public int getValue5() {
        return value5;
    }

    public int getValue6() {
        return value6;
    }
}
