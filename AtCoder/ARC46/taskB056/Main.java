package taskB056;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	int n;
	int m;
	int s;

	boolean[][] neighbor;

	boolean[] visited;

	int id;

	boolean search(int i) {
		if (visited[i]) {
			return false;
		}
		if (id == i) {
			visited[i] = true;
			return true;
		}

		for (int j = 0; j < n; j++) {
			if (neighbor[i][j]) {
				if (search(j)) {
					return true;
				}
			}
		}

		return false;
	}

	void run() {
		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();
		m = sc.nextInt();
		s = sc.nextInt() - 1;

		neighbor = new boolean[n][n];
		visited = new boolean[n];
		Arrays.fill(visited, false);
		for (int i = 0; i < m; i++) {
			int v = sc.nextInt() - 1;
			int w = sc.nextInt() - 1;
			neighbor[v][w] = true;
			neighbor[w][v] = true;
		}
		for (int i = 0; i < n; i++) {
			id = i;
			if (search(s)) {
				System.out.println(i + 1);
			}
		}

	}

	public static void main(String[] args) {
		new Main().run();
	}

}
