package com.snakeandladder;

/*This is a Snake and Ladder game simulation program where a single player is playing, starting from zero,
and he is rolling the die to get a number.*/

import java.util.Random;

public class playersdiegetanumber1to6 {

         playersdiegetanumber1to6() {System.out.println("Welcome to Snake and Ladder Simulation \n");}

        public static void main(String[] args) {
            playersdiegetanumber1to6 a = new  playersdiegetanumber1to6();
            Random random = new Random();
            int startingPosition = 0;
            System.out.println("Starting Position of the Single Player is : "+startingPosition+"\n");

            //Rolling the die.
            int dieRolls = (random.nextInt(6)+1);
            System.out.println("The Player rolls the die and gets a number : "+dieRolls);
        }

    }

