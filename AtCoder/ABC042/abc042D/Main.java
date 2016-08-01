package abc042D;

import java.util.Scanner;

//他人のコード、解説見て書いたコード
public class Main {

	private long MOD = 1_000_000_000 + 7;

	// 二分累乗法を用いた指数の計算
	long my_pow(long x, long n) {
		if (n == 0) {
			return 1;
		}
		if (n == 1) {
			return x;
		}

		long tmp = my_pow(x, n / 2) % MOD;
		if (n % 2 == 0) {
			return (tmp * tmp) % MOD;
		} else {
			return ((tmp * tmp) % MOD) * x % MOD;
		}
	}

	void run() {
		Scanner sc = new Scanner(System.in);

		int h = sc.nextInt();
		int w = sc.nextInt();

		int a = sc.nextInt();
		int b = sc.nextInt();

		// 階乗数
		long[] x = new long[h + w - 1];
		long[] y = new long[h + w - 1];
		x[0] = 1;
		y[0] = 1;
		for (int i = 1; i < h + w - 1; i++) {
			x[i] = (i * x[i - 1]) % MOD;
			y[i] = my_pow(x[i], MOD - 2) % MOD;
		}

		long ans = 0;

		for (int j = b; j < w; j++) {
			int h1 = h - a - 1;
			int w1 = j;
			long tmp = (((x[h1 + w1] * y[h1]) % MOD) * y[w1]) % MOD;

			int h2 = a - 1;
			int w2 = w - j - 1;
			long tmp1 = (((x[h2 + w2] * y[h2]) % MOD) * y[w2]) % MOD;

			ans += tmp * tmp1 % MOD;
			ans %= MOD;
		}

		System.out.println(ans);
	}

	public static void main(String[] args) {
		new Main().run();
	}

}
