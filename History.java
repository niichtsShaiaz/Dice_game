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
public class History {
     ArrayList al = new ArrayList();
     
     
     
     public void addHistory(Dice dice, Player player, Bet bet, int n){
         al.add("\nRound "+n+": "+dice.getValue1()+ " " + dice.getValue2() + " - " + player.getGuess1() + " " + player.getGuess2() + "  --  " + bet.getBetAmount());
         
//         al.add("\nRound "+n+",,");
//         al.add(dice.getValue1());
//         al.add(dice.getValue2());
 
     }
     public String print(){
         String res = "\tDice   Player   Bet";
         for(int i = 0; i < al.size(); i++)
         {
             res += al.get(i).toString();             
         }
         return res;
     }
     
     
     
     
     
}
