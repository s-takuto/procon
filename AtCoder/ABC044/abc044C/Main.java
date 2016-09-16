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
		for (int i = 1; i < n; i++) {
			x[i] = sc.nextInt();
		}

		int max = a;
		for (int i = 0; i < n; i++) {
			max = Math.max(max, x[i]);
		}
		int s = max * n;

		// dp[i][j][k]:x0~xiまでj枚選んだ時の和がkになるような選び方の総数
		double[][][] dp = new double[n + 1][n + 1][s + 1];

		dp[0][0][0] = 1;

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				for (int k = 0; k <= s; k++) {
					int count = 0;
					if (k - x[i] >= 0) {
						// x[i]を選ばない
						count += dp[i - 1][j][k];
						// x[i]を選ぶ
						count += dp[i - 1][j - 1][k - x[i]];
					} else if (k - x[i] < 0) {
						// x[i]を選べない
						count += dp[i - 1][j][k];
					}
					dp[i][j][k] = count;
				}
			}
		}

		// debug
		for (int i = 0; i <= n; i++) {
			for (int j = 0; j <= n; j++) {
				System.out.println("i:" + i + " j:" + j);
				System.out.println(Arrays.toString(dp[i][j]));
			}
		}

		int sum = 0;
		for (int j = 1; j <= n; j++) {
			sum += dp[n - 1][j][j * a];
		}

		System.out.println(sum);
	}

	public static void main(String[] args) {
		new Main().run();
	}

}
