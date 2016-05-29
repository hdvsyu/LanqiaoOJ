package basic18;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Square s1 = new Square(in.nextDouble(), in.nextDouble(), in.nextDouble(), in.nextDouble());
		Square s2 = new Square(in.nextDouble(), in.nextDouble(), in.nextDouble(), in.nextDouble());
		in.close();
		double a = isRecept(s1.x1, s1.x2, s2.x1, s2.x2);
		double b = isRecept(s1.y1, s1.y2, s2.y1, s2.y2);
		System.out.printf("%.2f", a * b);
	}

	private static double isRecept(double a, double b, double c, double d) {
		if (a <= c && b > c && b <= d) {
			return b - c;
		} else if (a >= c && a < d && b >= d) {
			return d - a;
		} else if (a <= c && b >= d) {
			return d - c;
		} else if (a >= c && b <= d) {
			return b - a;
		}
		return 0;
	}

}

class Square {

	double x1, y1, x2, y2;

	public Square(double x1, double y1, double x2, double y2) {
		this.x1 = Double.min(x1, x2);
		this.x2 = Double.max(x1, x2);
		this.y1 = Double.min(y1, y2);
		this.y2 = Double.max(y1, y2);
	}

}
