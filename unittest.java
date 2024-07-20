/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.oxgame_week2;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author PanisaraS
 */
public class OxGame_Week2Test {

    public OxGame_Week2Test() {
    }

    @BeforeAll
    public static void setUpClass() {
    }

    @AfterAll
    public static void tearDownClass() {
    }

    @BeforeEach
    public void setUp() {
    }

    @AfterEach
    public void tearDown() {
    }

    @Test
    public void switchTurn_X_O() {
        char turn = 'X';
        char result = OxGame_Week2.switchTurn(turn);
        assertEquals('O', result);
    }

    @Test
    public void switchTurn_O_X() {
        char turn = 'O';
        char result = OxGame_Week2.switchTurn(turn);
        assertEquals('X', result);
    }

    @Test
    public void checkRow_Row0_True_byX() {
        char[][] table = {{'X', 'X', 'X'}, {'-', '-', '-'}, {'-', '-', '-'}};
        char turn = 'X';
        int row = 0;
        boolean result = OxGame_Week2.checkRow(table, turn, row);
        assertTrue(result);
    }

    @Test
    public void checkRow_Row1_False_byX() {
        char[][] table = {{'X', 'X', 'X'}, {'-', '-', '-'}, {'-', '-', '-'}};
        char turn = 'X';
        int row = 1;
        boolean result = OxGame_Week2.checkRow(table, turn, row);
        assertFalse(result);
    }

    @Test
    public void checkRow_Row2_False_byO() {
        char[][] table = {{'-', '-', '-'}, {'-', '-', '-'}, {'O', 'O', '-'}};
        char turn = 'O';
        int row = 2;
        boolean result = OxGame_Week2.checkRow(table, turn, row);
        assertFalse(result);
    }

    @Test
    public void checkCol_Col0_True_byX() {
        char[][] table = {{'X', '-', '-'}, {'X', '-', '-'}, {'X', '-', '-'}};
        char turn = 'X';
        int col = 0;
        boolean result = OxGame_Week2.checkCol(table, turn, col);
        assertTrue(result);
    }

    @Test
    public void checkCol_Col1_False_byX() {
        char[][] table = {{'X', '-', '-'}, {'X', '-', '-'}, {'X', '-', '-'}};
        char turn = 'X';
        int col = 1;
        boolean result = OxGame_Week2.checkCol(table, turn, col);
        assertFalse(result);
    }

    @Test
    public void checkCol_Col2_False_byO() {
        char[][] table = {{'O', '-', 'O'}, {'O', '-', '-'}, {'-', 'O', '-'}};
        char turn = 'O';
        int col = 2;
        boolean result = OxGame_Week2.checkCol(table, turn, col);
        assertFalse(result);
    }

    @Test
    public void checkX_LefttoRight_True_byX() {
        char[][] table = {{'X', '-', '-'}, {'-', 'X', '-'}, {'-', '-', 'X'}};
        char turn = 'X';
        boolean result = OxGame_Week2.checkX(table, turn);
        assertTrue(result);
    }

    @Test
    public void checkX_RighttoLeft_True_ByO() {
        char[][] table = {{'-', '-', 'O'}, {'-', 'O', '-'}, {'O', '-', '-'}};
        char turn = 'O';
        boolean result = OxGame_Week2.checkX(table, turn);
        assertTrue(result);
    }

    @Test
    public void checkX_LefttoRight_False_ByX() {
        char[][] table = {{'X', '-', '-'}, {'-', '-', '-'}, {'-', '-', '-'}};
        char turn = 'X';
        boolean result = OxGame_Week2.checkX(table, turn);
        assertFalse(result);
    }

    @Test
    public void checkX_RighttoLeft_False_ByO() {
        char[][] table = {{'-', '-', 'O'}, {'-', '-', '-'}, {'O', '-', '-'}};
        char turn = 'O';
        boolean result = OxGame_Week2.checkX(table, turn);
        assertFalse(result);
    }

    @Test
    public void checkWin_Row_True_ByX() {
        char[][] table = {{'X', 'X', 'X'}, {'-', '-', '-'}, {'-', '-', '-'}};
        char turn = 'X';
        boolean result = OxGame_Week2.checkWin(table, turn);
        assertTrue(result);
    }

    @Test
    public void checkWin_Col_True_ByX() {
        char[][] table = {{'X', '-', '-'}, {'X', '-', '-'}, {'X', '-', '-'}};
        char turn = 'X';
        boolean result = OxGame_Week2.checkWin(table, turn);
        assertTrue(result);
    }

    @Test
    public void checkWin_X_True_ByX() {
        char[][] table = {{'X', '-', '-'}, {'-', 'X', '-'}, {'-', '-', 'X'}};
        char turn = 'X';
        boolean result = OxGame_Week2.checkWin(table, turn);
        assertTrue(result);
    }

    @Test
    public void checkWin_Row_False_ByX() {
        char[][] table = {{'X', 'X', '-'}, {'-', '-', '-'}, {'-', '-', '-'}};
        char turn = 'X';
        boolean result = OxGame_Week2.checkWin(table, turn);
        assertFalse(result);
    }

    @Test
    public void checkWin_Col_False_ByX() {
        char[][] table = {{'X', 'X', '-'}, {'-', '-', '-'}, {'X', '-', '-'}};
        char turn = 'X';
        boolean result = OxGame_Week2.checkWin(table, turn);
        assertFalse(result);
    }

    @Test
    public void checkWin_X_false_ByX() {
        char[][] table = {{'X', '-', '-'}, {'-', 'X', '-'}, {'-', '-', '-'}};
        char turn = 'X';
        boolean result = OxGame_Week2.checkWin(table, turn);
        assertFalse(result);
    }

    @Test
    public void checkDraw_FullTable_True() {
        int count = 9;
        boolean result = OxGame_Week2.checkDraw(count);
        assertTrue(result);
    }

    @Test
    public void checkDraw_TableNotFull_False() {
        int count = 8;
        boolean result = OxGame_Week2.checkDraw(count);
        assertFalse(result);
    }

    @Test
    public void isFinish_Win_True() {
        char[][] table = {{'X', 'X', 'X'}, {'-', '-', '-'}, {'-', '-', '-'}};
        char turn = 'X';
        int count = 5;
        boolean result = OxGame_Week2.isFinish(table,turn,count);
        assertTrue(result);
    }
    
    @Test
    public void isFinish_Draw_True() {
        char[][] table = {{'X', 'O', 'X'}, {'X', 'X', 'O'}, {'O', 'X', 'O'}};
        char turn = 'X';
        int count = 9;
        boolean result = OxGame_Week2.isFinish(table,turn,count);
        assertTrue(result);
    }
    
}

