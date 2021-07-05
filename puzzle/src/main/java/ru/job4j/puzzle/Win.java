package ru.job4j.puzzle;

public class Win {
    public static boolean check(int[][] board) {
        for (int i = 0; i < board.length; i++) {
            if (board[i][i] == 1) {
                if (monoHorizontal(board, i) || monoVertical(board, i)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean monoHorizontal(int[][] board, int row) {
        boolean result = true;
        for (int column = 0; column < board[row].length; column++) {
            if (board[row][column] != 1) {
                result = false;
                break;
            }
        }
        return result;
    }

    public static boolean monoVertical(int[][] board, int column) {
        boolean result = true;
        for (int[] ints : board) {
            if (ints[column] != 1) {
                result = false;
                break;
            }
        }
        return result;
    }
}
