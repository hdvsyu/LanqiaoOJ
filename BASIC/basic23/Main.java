package basic23;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[][] grid = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				grid[i][j] = in.nextInt();
			}
		}
		in.close();
		
		for (int i = 0; i < n; i++) {
			int cnt = 0;
			for (int j = 0; j < n; j++) {
				if (i != j) {
					cnt += grid[j][i];
				}
			}
			if (cnt >= n / 2) {
				System.out.print((i + 1) + " ");
			}
		}
	}

}
