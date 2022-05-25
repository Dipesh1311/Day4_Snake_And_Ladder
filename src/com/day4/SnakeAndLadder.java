package com.day4;

import java.util.Random;

public class SnakeAndLadder {
    static int player1 = 0;
    static int Roll_Dice;
    static int check;
    final static int No_Play = 0;
    final static int Ladder = 1;
    final static int Snake = 2;
    static int position = 0;
    final static int WINPOINT = 100;
    public static int calculatedPosition = 0;

    public static int calculatePlayerLadderPosition(int position, int dicevalue) {
        position = position + dicevalue;
        if (position > WINPOINT) {
            position = position - dicevalue;
        } else if (position == 100) {
            return position;
        }
        return position;
    }

    public static int calculatePlayerSnakeBitePosition(int position, int dicevalue) {
        position = position - dicevalue;
        if (position < 0) {
            position = 0;
        }
        return position;
    }

    public static void main(String[] args) {
        System.out.println("Lets Play Snake and Ladder");
        Random a = new Random();

        do {
        Roll_Dice = a.nextInt(6) + 1;
        System.out.println("Number after dice roll : "+Roll_Dice);
        check = a.nextInt(3);
        System.out.println("Player option : "+check);

        switch (check) {
            case No_Play:
                System.out.println("NOPLAY");
                System.out.println("Position of player : " + position);
                System.out.println("----------------------");
                break;
            case Ladder:
                System.out.println("############## Climb up the ladder ############");
                position += Roll_Dice;
                System.out.println("Position of the  Player = " + position);
                System.out.println("----------------------");
                break;
            case Snake:
                System.out.println("~~~~~~~~~~~~~~~~ Swallowed by snake ~~~~~~~~~~~~");
                position -= Roll_Dice;
                System.out.println("Position of the  Player = " + position);
                System.out.println("----------------------");
                break;

            default:
                break;
            }
        } while (calculatedPosition != WINPOINT);
    }

}
