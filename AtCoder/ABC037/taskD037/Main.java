package taskD037;

import java.util.Scanner;

public class Main {
	// height, width
	int h, w;
	// 入力したグラフ
	int map[][];
	long MOD = 1_000_000_000 + 7;
	// i行j列に辿り着く経路数
	long dp[][];
	int dx[] = { 0, -1, 0, 1 };
	int dy[] = { -1, 0, 1, 0 };

	// i行j列に辿り着く経路数を求めるメソッド
	long opt(int i, int j) {
		if (dp[i][j] != 0) {
			return dp[i][j];
		}

		// 自分自身
		dp[i][j] = 1;
		for (int k = 0; k < 4; k++) {
			if (0 <= i + dy[k] && i + dy[k] < h && 0 <= j + dx[k]
					&& j + dx[k] < w) {
				if (map[i][j] > map[i + dy[k]][j + dx[k]]) {
					long tmp = opt(i + dy[k], j + dx[k]);
					tmp %= MOD;
					dp[i][j] += tmp;
				}
			}
		}
		return dp[i][j];
	}

	void run() {
		Scanner sc = new Scanner(System.in);

		// input
		h = sc.nextInt();
		w = sc.nextInt();
		map = new int[h][w];
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				map[i][j] = sc.nextInt();
			}
		}

		dp = new long[h][w];
		long sum = 0;
		// 各頂点に対してopt(i,j)を求めてその総和を計算する
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				long tmp = opt(i, j);
				tmp %= MOD;
				sum += tmp;
			}
		}

		System.out.println(sum % MOD);
	}

	public static void main(String[] args) {
		new Main().run();
	}

}
