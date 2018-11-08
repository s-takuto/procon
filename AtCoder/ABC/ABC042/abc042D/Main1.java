package abc042D;

import java.util.Arrays;
import java.util.Scanner;

//MLE解法
public class Main1 {

	private long INF = 1_000_000_000 + 7;

	void run() {
		Scanner sc = new Scanner(System.in);

		int h = sc.nextInt();
		int w = sc.nextInt();

		long[][] grid = new long[h][w];
		boolean[][] pass = new boolean[h][w];
		for (int i = 0; i < h; i++) {
			Arrays.fill(pass[i], true);
		}

		int a = sc.nextInt();
		int b = sc.nextInt();

		for (int i = h - a; i < h; i++) {
			for (int j = 0; j < b; j++) {
				pass[i][j] = false;
			}
		}

		for (int i = 0; i < h; i++) {
			if (pass[i][0]) {
				grid[i][0] = 1;
			} else {
				grid[i][0] = 0;
			}
		}
		for (int j = 0; j < w; j++) {
			if (pass[0][j]) {
				grid[0][j] = 1;
			} else {
				grid[0][j] = 0;
			}
		}

		for (int i = 1; i < h; i++) {
			for (int j = 1; j < w; j++) {
				if (pass[i][j]) {
					grid[i][j] = (grid[i - 1][j] % INF + grid[i][j - 1] % INF) % INF;
				} else {
					grid[i][j] = 0;
				}
			}
		}

		System.out.println(grid[h - 1][w - 1] % INF);
	}

	public static void main(String[] args) {
		new Main1().run();
	}

}
