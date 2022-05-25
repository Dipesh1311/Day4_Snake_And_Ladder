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
                if (position < 0) {
                position = 0;
                }
        } while (position != WINPOINT);
    }

}
