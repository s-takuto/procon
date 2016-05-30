package task0009;

import java.util.Arrays;
import java.util.Scanner;

//エラトステネス(範囲制限なし)+累積和
public class Main1 {

	boolean[] prime;
	int[] sum;

	void run() {
		Scanner sc = new Scanner(System.in);

		era(1000000);

		while (sc.hasNext()) {
			int n = sc.nextInt();
			System.out.println(sum[n]);
		}

		sc.close();
	}

	public void era(int n) {
		prime = new boolean[n + 1];
		sum = new int[n + 1];

		Arrays.fill(prime, true);
		prime[0] = prime[1] = false;

		int count = 0;

		for (int i = 2; i <= n; i++) {
			if (prime[i]) {
				count++;
				for (int j = i + i; j <= n; j += i) {
					prime[j] = false;
				}
			}
			sum[i] += count;
		}
	}

	public static void main(String[] args) {
		new Main1().run();
	}

}
