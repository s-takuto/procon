package C;

import java.util.Scanner;
import java.lang.Math;

public class Main {
	public void run() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] grid = new int[2][n];
		for(int i = 0; i < 2; i++) {
			for(int j = 0; j < n; j++) {
				grid[i][j] = sc.nextInt();
			}
		}

		int[][] ans = new int[2][n];
		ans[0][0] = grid[0][0];
		ans[1][0] = grid[1][0] + ans[0][0];

		for(int j = 1; j < n; j++) {
			ans[0][j] = grid[0][j] + ans[0][j - 1];
		}
		for(int j = 1; j < n; j++) {
			ans[1][j] = grid[1][j] + Math.max(ans[1][j - 1], ans[0][j]);
		}

		System.out.println(ans[1][n-1]);
	}

	public static void main(String[] args) {
		new Main().run();
	}
}
