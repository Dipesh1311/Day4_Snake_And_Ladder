package com.day4;

import java.util.Random;

public class SnakeAndLadder {
    static int player1 = 0;
    static int Roll_Die;

    public static void main(String[] args) {
        System.out.println("Player1 at " +player1+ " position");
        Random a = new Random();
        Roll_Die = a.nextInt(6)+1;
        System.out.println(Roll_Die);
    }
}
