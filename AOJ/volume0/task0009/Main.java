package task0009;

import java.util.Arrays;
import java.util.Scanner;

//エラトステネスのみ
public class Main {

	boolean[] prime;

	void run() {
		Scanner sc = new Scanner(System.in);

		era(1000000);

		while (sc.hasNext()) {
			int n = sc.nextInt();
			int count = 0;
			for (int i = 2; i <= n; i++) {
				if (prime[i]) {
					count++;
				}
			}
			System.out.println(count);
		}

		sc.close();
	}

	public void era(int n) {
		prime = new boolean[n + 1];
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
