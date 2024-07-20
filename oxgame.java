/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.oxgame_week2;

import java.util.Scanner;

/**
 *
 * @author PanisaraS
 */
public class OxGame_Week2 {

    public static char[][] table = {{'-', '-', '-'}, {'-', '-', '-'}, {'-', '-', '-'}};
    public static char turn = 'X';
    public static int count = 0;
    public static int row;
    public static int col;
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        showWelcome();
        while (true){
            showTable(table);
            showTurn(turn);
            inputRowCol(sc,table);
            if(isFinish(table, turn, count)){
                showTable(table);
                showResult(table, turn);
                break;
            }
            turn = switchTurn(turn);
        } 
    }

    public static void showWelcome() {
        System.out.println("Welcome to OX Game");
    }

    public static void showTable(char[][] table) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(table[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void showTurn(char turn) {
        System.out.println("Turn " + turn);
    }

    public static void inputRowCol(Scanner sc, char[][] table) {
        boolean correctinput = false;
        while (!correctinput) {
            System.out.print("Please input row,col: ");
            row = sc.nextInt() - 1;
            col = sc.nextInt() - 1;
            if (row >= 0 && row < 3 && col >= 0 && col < 3) {
                if (table[row][col] == '-') {
                    table[row][col] = turn;
                    count++;
                    correctinput = true;
                } else {
                    System.out.println("Please choose another cell.");
                }
            } else {
                System.out.println("Please try again.");
            }
        }
    }

    public static char switchTurn(char turn) {
        if (turn == 'X') {
            return  'O';
        } else {
            return  'X';
        }
    }

    public static boolean isFinish(char[][] table, char turn, int count) {
        if(checkWin(table, turn)){
            return true;
        }
        if(checkDraw(count)){
            return true;
        }
        return false;
    }

    public static boolean checkWin(char[][] table, char turn) {
        if(checkRow(table, turn, row)){
            return true;
        }
        if(checkCol(table, turn, col)){
            return true;
        }
        if(checkX(table, turn)){
            return true;
        }
        return false;
    }

    public static boolean checkDraw(int count) {
        if(count==9){
            return true;
        }
        return false;
    }

    public static boolean checkRow(char[][] table, char turn, int row) {
        for (int i = 0; i < 3; i++){
            if(table[row][0] == turn && table[row][1] == turn && table[row][2] == turn){
            return true;
            }
        }
        return false;
    }

    public static boolean checkCol(char[][] table, char turn, int col) {
        for (int i = 0; i < 3; i++){
        if(table[0][col] == turn && table[1][col] == turn && table[2][col] == turn){
            return true;
            }
        }
        return false;
    }

    public static boolean checkX(char[][] table, char turn) {
        if (table[0][0] == turn && table[1][1] == turn && table[2][2] == turn) {
        return true;
        }
        if (table[0][2] == turn && table[1][1] == turn && table[2][0] == turn) {
        return true; 
        }
        return false;
    }

    public static void showResult(char[][] table1, char turn1) {
        if(checkWin(table, turn)){
            System.out.println(turn +" WIN!!!!!");
        }
        else if(checkDraw(count)){
            System.out.println("Draw!");
        }
    }

}
