package 素数判定;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	long start, finish;

	void run() {
		Scanner sc = new Scanner(System.in);

		while(sc.hasNext()) {
			int n = sc.nextInt();

			start = System.currentTimeMillis();
			boolean ans = isPrime(n);
			finish = System.currentTimeMillis();
			System.out.println(finish - start);

			start = System.currentTimeMillis();
			ans = isPrime2(n);
			finish = System.currentTimeMillis();
			System.out.println(finish - start);

			start = System.currentTimeMillis();
			ans = isPrime2a(n);
			finish = System.currentTimeMillis();
			System.out.println(finish - start);

			start = System.currentTimeMillis();
			eratosthenes(n);
			finish = System.currentTimeMillis();
			System.out.println(finish - start);
		}


	}

	// O(n)の素数判定
	public boolean isPrime(int n) {

		if (n <= 1)
			return false;

		for (int d = 2; d < n; d++) {
			if (n % d == 0) {
				return false;
			}
		}
		return true;
	}

	// O(root(n))
	public boolean isPrime2(int n) {
		if (n <= 1)
			return false;

		for (int d = 2; d * d <= n; d++) {
			if (n % d == 0) {
				return false;
			}
		}
		return true;
	}

	// O(root(n)) さらに早い
	public boolean isPrime2a(int n) {
		if (n <= 1)
			return false;

		if (n % 2 == 0)
			return false;

		for (int d = 3; d * d <= n; d = d + 2) {
			if (n % d == 0) {
				return false;
			}
		}
		return true;
	}

	// エラトステネス
	public void eratosthenes(int n) {
		boolean[] prime = new boolean[n + 1];

		Arrays.fill(prime, true);

		prime[0] = prime[1] = false;

		for (int i = 2; i * i <= n; i++) {
			if (prime[i]) {
				for (int j = i + i; j <= n; j += i) {
					prime[j] = false;
				}
			}
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}

}
