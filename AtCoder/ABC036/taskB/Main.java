package taskB;

import java.util.Scanner;

public class Main {

	void run() {
		Scanner sc = new Scanner(System.in);

		// input
		int n = sc.nextInt();

		char[][] grid = new char[n][n];

		for (int i = 0; i < n; i++) {
			String str = sc.next();
			char[] c = str.toCharArray();
			for (int j = 0; j < n; j++) {
				grid[i][j] = c[j];
			}
		}

		for (int j = 0; j < n; j++) {
			for (int i = n - 1; i >= 0; i--) {
				System.out.print(grid[i][j]);
			}
			System.out.println();
		}

	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		new Main().run();
	}

}
