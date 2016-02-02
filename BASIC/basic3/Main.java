package basic3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int m = in.nextInt();
		int n = in.nextInt();
		in.close();
		
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print((char)('A' + Math.abs(i - j)));
			}
			
			System.out.println();
		}
	}

}
