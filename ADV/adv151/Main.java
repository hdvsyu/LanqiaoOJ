package adv151;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int[][] like = new int[13][13];
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				like[i][j] = in.nextInt();
			}
		}
		in.close();

		int[][] dp = new int[n][2 ^ n - 1];
		for (int i = 0; i < n; i++) {
		}
	}

}