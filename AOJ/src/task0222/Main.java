package task0222;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	final int MAX = 10000000;

	boolean[] prime = new boolean[MAX + 10];

	void run() {
		Scanner sc = new Scanner(System.in);

		Arrays.fill(prime, true);

		//エラトステネスの篩
		prime[0] = prime[1] = false;
		for (int i = 2; i * i < MAX + 10; i++) {
			if (prime[i]) {
				for (int j = i + i; j < MAX + 10; j += i) {
					prime[j] = false;
				}
			}
		}

		while (true) {
			int n = sc.nextInt();
			int max = 0;

			if (n == 0) {
				break;
			}

			//最大値から探す
			for (int i = n; i >= 8; i--) {
				if (prime[i] && prime[i - 2] && prime[i - 6] && prime[i - 8]) {
					max = i;
					break;
				}
			}
			System.out.println(max);

		}

	}

	public static void main(String[] args) {
		new Main().run();
	}

}
