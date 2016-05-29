package basic28;

import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();

		PriorityQueue<Integer> queue = new PriorityQueue<>(n);

		for (int i = 0; i < n; i++) {
			queue.add(in.nextInt());
		}
		in.close();

		int sum = 0;

		while (queue.size() != 1) {
			int temp = queue.poll() + queue.poll();
			sum += temp;
			queue.add(temp);
		}

		System.out.println(sum);
	}

}
