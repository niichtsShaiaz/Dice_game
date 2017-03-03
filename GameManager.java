/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dice_game;

/**
 *
 * @author Shxnna
 */
public class GameManager {

    public void start() {
        Dice dice = new Dice(1, 1);
        Player player = new Player(1, 1, true);
        Player player2 = new Player(1, 1, true);
        History history = new History();
        Bet bet = new Bet();
        Statistics stats = new Statistics(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
        
        int gameRounds = 0;

        while (player.isIsGame() && bet.getBank() > 0 && bet.getBank2() > 0) {
            gameRounds++;
            System.out.println("\nResult of die face values: " + dice.result());
            bet.askBet();
            bet.askBet2();
            
            System.out.println("Player 1:");
            player.options1();
            player.setGuess1();
            player.options2();
            player.setGuess2();
            System.out.println("Player 2:");
            player2.options1();
            player2.setGuess1();
            player2.options2();
            player2.setGuess2();
            
            bet.duel(dice,player,player2);   
            bet.print();
            
            if(bet.getBank() > 0 && bet.getBank2() > 0)
            {
                player.keepGoing();
            }
            
            history.addHistory(dice, player, bet, gameRounds);
            stats.addSum(dice);
            stats.addValue(dice);
            stats.addBet(bet);
            System.out.println("\n\n\n\n\n\n\n\n\n\n");

        }
        //System.out.println(history.al);
        System.out.println(history.print());
        System.out.println(player.endGame(gameRounds));
        System.out.println("\nRounds lost: " + player.getRoundsLost() + " - " + "Rounds Won: " + player.getRoundsWon());
        System.out.println("Final Bank: "+bet.getBank());
        
        System.out.println("\nExtended statistics:");
        System.out.println("Average face value of die: " +stats.avgSum(gameRounds));
        System.out.println("Face value 1 rolled: " + stats.getValue1() + " times.");
        System.out.println("Face value 2 rolled: " + stats.getValue2() + " times.");
        System.out.println("Face value 3 rolled: " + stats.getValue3() + " times.");
        System.out.println("Face value 4 rolled: " + stats.getValue4() + " times.");
        System.out.println("Face value 5 rolled: " + stats.getValue5() + " times.");
        System.out.println("Face value 6 rolled: " + stats.getValue6() + " times.");
        System.out.println("Average bet value: " +stats.avgBet(gameRounds));
    }
}
