package prev3;

import java.util.Scanner;

public class Main {
	
	public static int cnt = 0;
	public static boolean isVisit[] = new boolean[10];
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		in.close();
		
		
	}
	
	public static void s(int num) {
		boolean haveZero = false;
		for (int i = 1; i < 1000000; i++) {
			int temp = i;
			while (temp != 0) {
				int c = temp % 10;
				if (c == 0) {
					haveZero = true;
					break;
				}
				
				isVisit[c] = true;
			}
			
			if (!haveZero) {
				dfs(num - i);
			}
			
		}
	}
	
	public static void dfs(int num) {
	}
}
