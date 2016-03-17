package prev9;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		List<Node>[] list = new List[n + 1];
		for (int i = 1; i < n; i++) {
			int p = in.nextInt();
			int q = in.nextInt();
			int d = in.nextInt();

			if (list[p] == null) {
				list[p] = new ArrayList<>();
			}

			list[p].add(new Node(q, d));
			if (list[q] == null) {
				list[q] = new ArrayList<>();
			}
			list[q].add(new Node(p, d));
		}
		in.close();
		int maxLen = 0;
		for (int i = 1; i < n; i++) {
			int[] path = new int[n + 1];
			Queue<Integer> queue = new LinkedList<>();
			queue.add(i);
			boolean[] isVisited = new boolean[n + 1];
			isVisited[i] = true;
			bfs(list, isVisited, path, queue);
			
			for (int j = 1; j <= n; j++) {
				if (path[j] > maxLen) {
					maxLen = path[j];
				}
			}
		}
		
		print(maxLen);
	}
	
	public static void print(int x) {
		System.out.printf("%.0f", x * 10 + x * 1.0 / 2 * x + x * 1.0 / 2);
	}

	public static void bfs(List<Node>[] list, boolean[] isVisited, int[] path, Queue<Integer> q) {
		if (q.isEmpty()) {
			return ;
		}
		
		Queue<Integer> queue = new LinkedList<>();
		while (!q.isEmpty()) {
			int cur = q.poll();
			isVisited[cur] = true;
			for (int i = 0; i < list[cur].size(); i++) {
				Node temp = list[cur].get(i);

				if (!isVisited[temp.index]) {
					path[temp.index] = path[temp.index] > path[cur] + temp.len ? path[temp.index]
							: path[cur] + temp.len;
					queue.add(temp.index);
				}
			}
		}

		bfs(list, isVisited, path, queue);
	}
}

class Node {
	int index;
	int len;

	public Node(int index, int len) {
		this.index = index;
		this.len = len;
	}
}