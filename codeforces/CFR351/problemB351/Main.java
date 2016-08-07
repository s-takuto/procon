package problemB351;

import java.util.Scanner;

public class Main {

	void run() {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();

		boolean[][] similar = new boolean[n][n];

		int[] p = new int[n];

		for (int i = 0; i < m; i++) {
			int u = sc.nextInt() - 1;
			int v = sc.nextInt() - 1;

			similar[u][v] = true;
			similar[v][u] = true;

		}

	}

	public static void main(String[] args) {
		new Main().run();
	}

}
