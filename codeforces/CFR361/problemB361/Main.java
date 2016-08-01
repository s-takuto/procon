package problemB361;

import java.util.Scanner;

//ダイクストラで解こう！
public class Main {

	int[][] cost;

	int[] dp;

	void run() {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		cost = new int[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				cost[i][j] = j - i;
			}
		}
		for (int i = 0; i < n; i++) {
			int v = sc.nextInt() - 1;
			if (i == v) {
				cost[i][v] = 0;
			} else {
				cost[i][v] = 1;
			}
		}

		dp = new int[n];
		dp[0] = 0;
		dp[1] = 1;

		for (int i = 2; i < n; i++) {
			int min = cost[0][i];
			for (int j = 0; j < i; j++) {
				min = Math.min(min, dp[j] + cost[j][i]);
			}
			dp[i] = min;
		}

		for (int i = 0; i < n; i++) {
			System.out.print(dp[i] + " ");
		}
		System.out.println();

	}

	public static void main(String[] args) {
		new Main().run();
	}

}
