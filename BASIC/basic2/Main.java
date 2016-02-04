package basic2;

public class Main {

	public static void main(String[] args) {

		int[] a = {0, 1};
		
		for (int i : a) {
			for (int j : a) {
				for (int k : a) {
					for (int l : a) {
						for (int m : a) {
							System.out.printf("%d%d%d%d%d\n", i, j, k, l, m);
						}
					}
				}
			}
		}
	}

}
