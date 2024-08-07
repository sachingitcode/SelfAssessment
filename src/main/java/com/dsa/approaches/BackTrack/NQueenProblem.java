package com.dsa.approaches.BackTrack;


// The N-Queens problem is about placing N queens on an N×N chessboard
// so that no two queens threaten each other.
// This means that no two queens can be in the same row, column, or diagonal.


//BackTracking
public class NQueenProblem {

    public static void main(String[] args) {
        int board[][] = new int[4][4];
        int rows = 0;
        boolean b = nQueen(board, rows);
        getDiagonals(board);
    }

    private static boolean nQueen(int[][] board, int row) {
        if (row == 4) return true;
        for (int col = 0; col < 4; col++) {
            if (isSafe(board, row, col)) {
                board[row][col] = 1;
                if (nQueen(board, row + 1)) return true;
                else board[row][col] = 0;
            }
        }
        return false;
    }

    private static boolean isSafe(int[][] board, int row, int col) {
        //    if not found in hor ,ver , dia -> return true else false ;
        for (int i = 0; i < 4; i++) {
            if (board[row][i] == 1) {
                return false;
            }
            if (board[i][col] == 1) {
                return false;
            }
        }
        return true;
    }

    private static void getDiagonals(int[][] board) {
        int r = 2;
        int c = 1;
        int t1 = c, t2 = c, p1 = c, p2 = c;

        for (int j = r-1; j >= 0; j--) {
            System.out.println("." + j + "" + ++p1);
            System.out.println("!" + j + "" + --p2);
        }

        for (int i = r+1; i <= 4; i++) {
            System.out.println("@" + i + "" + ++t1);
            System.out.println("#" + i + "" + --t2);
        }
    }

}
