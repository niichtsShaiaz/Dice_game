/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dice_game;

import java.util.Random;

/**
 *
 * @author Shxnna
 */
public class Dice {
    private int value1;
    private int value2;
    private int result;
    Random random = new Random();

    public Dice(int value1, int value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public int getValue1() {
        return value1;
    }

    public void setValue1(int value1) {
        this.value1 = value1;
    }

    public int getValue2() {
        return value2;
    }

    public void setValue2(int value2) {
        this.value2 = value2;
    }
    
    public void Roll()
    {
        value1 = random.nextInt(6)+1;
        value2 = random.nextInt(6)+1;
        
    }
    public int result()
    {
        Roll();
        return (value1+value2);
    }
    public int getSum()
    {
        return value1+value2;
        
    }
    
    @Override
    public String toString(){
        return value1 + " " + value2;
    }
    
    
}
