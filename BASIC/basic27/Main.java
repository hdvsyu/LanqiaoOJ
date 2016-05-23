package basic27;

import java.util.Scanner;

public class Main {

	private static int cnt = 0;

	private static int[] posWhite;
	private static int[] posBlack;

	private static int[][] grid;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		grid = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				grid[i][j] = in.nextInt();
			}
		}
		in.close();

		posBlack = new int[n];
		posWhite = new int[n];
		dfsWhite(0, n);
		System.out.println(cnt);
	}

	private static boolean isNoAdjcent(int row, int[] pos) {
		for (int i = 0; i < row; i++) {
			if (pos[i] == pos[row] || row - i == Math.abs(pos[row] - pos[i])) {
				return false;
			}
		}
		return true;
	}
	
	private static boolean isNotEqual(int row) {
		if (posWhite[row] == posBlack[row]) {
			return false;
		}
		return true;
	}

	private static void dfsBlack(int row, int n) {
		if (row >= n) {
			cnt++;
			return;
		}

		for (posBlack[row] = 0; posBlack[row] < n; posBlack[row]++) {
			if (grid[row][posBlack[row]] == 1 && isNoAdjcent(row, posBlack) && isNotEqual(row)) {
				dfsBlack(row + 1, n);
			}
		}
	}

	private static void dfsWhite(int row, int n) {
		if (row >= n) {
			dfsBlack(0, n);
			return;
		}

		for (posWhite[row] = 0; posWhite[row] < n; posWhite[row]++) {
			if (grid[row][posWhite[row]] == 1 && isNoAdjcent(row, posWhite)) {
				dfsWhite(row + 1, n);
			}
		}
	}

}
