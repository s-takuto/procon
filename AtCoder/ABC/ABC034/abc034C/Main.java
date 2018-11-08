package abc034C;

import java.util.Scanner;

public class Main {

	private int MOD = 1_000_000_000 + 7;

	long fact(long n) {
		long f = 1;
		for (int i = 1; i <= n; i++) {
			f *= i;
			f %= MOD;
		}
		return f;
	}

	long mypower(long a, int n) {
		if (n == 0) {
			return 1;
		}
		if (n == 1) {
			return a;
		}

		long tmp = mypower(a, n / 2);
		tmp %= MOD;
		if (n % 2 == 0) {
			return (tmp * tmp) % MOD;
		} else {
			return tmp * tmp % MOD * a % MOD;
		}
	}

	void run() {
		Scanner sc = new Scanner(System.in);

		long w = sc.nextLong();
		long h = sc.nextLong();

		long width = w - 1;
		long height = h - 1;

		long a = fact(width) % MOD;
		long b = fact(height) % MOD;
		long c = fact(width + height) % MOD;

		a = mypower(a, MOD - 2) % MOD;
		b = mypower(b, MOD - 2) % MOD;

		System.out.println(a * b % MOD * c % MOD);

	}

	public static void main(String[] args) {
		new Main().run();
	}

}
