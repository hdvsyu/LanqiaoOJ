package basic24;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int v1 = in.nextInt();
		int v2 = in.nextInt();
		int t = in.nextInt();
		int s = in.nextInt();
		int l = in.nextInt();
		int wl = 0;
		int tl = 0;
		for (int i = 1; i <= l / v2; i++) {
			wl += v2;
			tl += v1;

			if (tl >= l && wl < l) {
				System.out.println("R");
				System.out.println(i);
				break;
			}
			
			if (tl - wl >= t) {
				wl += v2 * s;
				i += s;
			}
		}
		in.close();
		if (tl >= l && wl >= l) {
			System.out.println("D");
			System.out.println(l / v2);
		} else if (wl >= l && tl < l) {
			System.out.println("T");
			System.out.println(l / v2);
		}
	}

}
