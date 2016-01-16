package algo2;

//Get sixty percent.
//And still have some errors.
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		double n = in.nextDouble();
		in.close();

		if (n <= 2) {
			System.out.printf("%.0f", n);
		} else if (0 == n % 2) {
			// Even.
			if (0 != n % 3) {
				System.out.printf("%.0f", (n * (n - 1) * (n - 3)));
			} else {
				System.out.printf("%.0f", ((n - 3) * (n - 2) * (n - 1)));
			}
		} else {
			// Odd.
			System.out.printf("%.0f", (n * (n - 1) * (n - 2)));
		}
	}
}