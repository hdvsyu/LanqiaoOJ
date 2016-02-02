package basic4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt();

		int min = 10001, max = -10001, sum = 0;
		for (int i = 0; i < n; i++) {
			int temp  = in.nextInt();
			if (min > temp) {
				min = temp;
			}
			
			if (temp > max) {
				max = temp;
			}
			
			sum += temp;
		}
		in.close();
		
		System.out.println(max);
		System.out.println(min);
		System.out.println(sum);
	}

}
