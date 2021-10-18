package com.company;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class Main {

    static String[][] board = new String[10][8];

    public static void board() {
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 8; j++) {
                board[i][j] = "[]";
                System.out.print(board[i][j]);
            }
            System.out.println("");
        }
        board[random.nextInt(7)][random.nextInt(9)] = "[X]";
    }

    public static void main(String[] args) {
        Random random = new Random();
        Scanner input = new Scanner(System.in);
        int userCoinTotal = 0;
        int coinPrize = random.nextInt();
        board();

        //check board
        System.out.println("");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(board[i][j]);
            }
            System.out.println("");
        }
        System.out.println("What are your x and y coordinates:");
        int userX = input.nextInt();
        int userY = input.nextInt();
        



    }
}





