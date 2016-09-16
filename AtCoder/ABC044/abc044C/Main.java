package abc044C;

import java.util.Arrays;
import java.util.Scanner;

import javax.security.auth.kerberos.KerberosKey;

//満点解法
//ナップサック問題として考える
public class Main {

	void run() {
		Scanner sc = new Scanner(System.in);

		// input
		int n = sc.nextInt();
		int a = sc.nextInt();

		int[] x = new int[n + 1];
		x[0] = -1;
		for (int i = 1; i <= n; i++) {
			x[i] = sc.nextInt();
		}

		int max = a;
		for (int i = 0; i < n; i++) {
			max = Math.max(max, x[i]);
		}
		int X = max * n;

		// dp[j][k][s]:x[1]~x[j]までk枚選んだ時の和がsになるような選び方の総数
		// 0<=j<=n, 0<=k<=n, 0<=s<=X
		long[][][] dp = new long[n + 1][n + 1][X + 1];

		// 基底
		dp[0][0][0] = 1;

		for (int j = 1; j <= n; j++) {
			for (int k = 0; k <= n; k++) {
				for (int s = 0; s <= X; s++) {
					if (j == 0 && k == 0 && s == 0) {
						continue;
					}
					long count = 0;
					if (s >= x[j] && k >= 1) {
						// x[j]を選ばない
						count += dp[j - 1][k][s];
						// x[j]を選ぶ
						count += dp[j - 1][k - 1][s - x[j]];
					} else if (s < x[j]) {
						// x[j]を選べない
						count += dp[j - 1][k][s];
					}
					dp[j][k][s] = count;
				}
			}
		}

		// debug
		// for (int j = 0; j <= n; j++) {
		// for (int k = 0; k <= n; k++) {
		// System.out.println("j:" + j + " k:" + k);
		// System.out.println(Arrays.toString(dp[j][k]));
		// }
		// }

		// 和k*aとなる、1~n枚選んだ時の選び方の和を求める
		long sum = 0;
		for (int k = 1; k <= n; k++) {
			sum += dp[n][k][k * a];
		}

		System.out.println(sum);
	}

	public static void main(String[] args) {
		new Main().run();
	}

}
