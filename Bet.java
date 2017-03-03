/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dice_game;

import java.util.Scanner;

/**
 *
 * @author Shxnna 2,3,11,12 = 1.5 4,5,9,10 = 2 6,7,8 = 3
 */
public class Bet {
    Scanner scanner = new Scanner(System.in);

    private double bank = 100;
    private double bank2 = 100;
    private double betAmount;
    private double betAmount2;

    public double getBank() {
        return bank;
    }
    public double getBank2() {
        return bank2;
    }

    public double getBetAmount() {
        return betAmount;
    }
    
   
    
    public void askBet(){
        System.out.println("\nPlayer 1's Current Bank: "+bank+"\nHow much would you like to bet ?");
        betAmount = scanner.nextDouble();
        if(bank < betAmount)
        {
            System.out.println("Bet invalid.");
            askBet();
            
        }
        bank -= betAmount;
    }
    public void askBet2(){
        System.out.println("\nPlayer 2's Current Bank: "+bank2+"\nHow much would you like to bet ?");
        betAmount2 = scanner.nextDouble();
        if(bank2 < betAmount2)
        {
            System.out.println("Bet invalid.");
            askBet2();
            
        }
        bank2 -= betAmount2;
    }
    public void duel(Dice dice, Player player1, Player player2)
    {
        System.out.println("\nFace values were: " + dice.getValue1() + " " + dice.getValue2());
        
        
        if(player1.checkDice2(dice) && !player2.checkDice2(dice)){
            bank += betAmount2 + betAmount;
            System.out.println("Player 1 wins! You won " + betAmount2);
        }
        
        if(!player1.checkDice2(dice) && player2.checkDice2(dice)){
            bank2 += betAmount + betAmount2;
            System.out.println("Player 2 wins! You won " + betAmount);
        }
        if(player1.checkDice2(dice) && player2.checkDice2(dice)){
            bank += betAmount;
            bank2 += betAmount2;
            
            
            
        }
    }
    public void print ()
    {
        System.out.println("\nPlayer 1 bank: " + bank + " - " + "Player 2 bank: " + bank2);
        
    }
    
    public void reward(Dice dice){
        int r = dice.getSum();
        switch(r){
            case 2: case 3: case 11: case 12:
                betAmount = betAmount * 1.5;
                bank += betAmount;
                break;
                
            case 4: case 5: case 9: case 10:
                betAmount = betAmount * 2;
                bank += betAmount;
                break;
                
            case 6: case 7: case 8:
                betAmount = betAmount * 3;
                bank += betAmount;
                break;
            default:
                bank += betAmount;
                break;
        }
        
    }
}
