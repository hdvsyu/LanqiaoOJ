package algo30;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		int m = in.nextInt();
		int[] dp = new int[t+1];
		for (int i = 0; i < m; i++) {
			int time = in.nextInt();
			int value = in.nextInt();
			for (int j = 1; j <= t; j++) {
				if (j >= time) {
					dp[j] = Integer.max(dp[j], dp[j - time] + value);
				}
			}
		}
		in.close();
		System.out.println(dp[t]);
	}

}
