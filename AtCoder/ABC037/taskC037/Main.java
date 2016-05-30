package taskC037;

import java.util.Scanner;

public class Main {

	void run() {
		Scanner sc = new Scanner(System.in);

		// input
		int n = sc.nextInt();
		int K = sc.nextInt();

		long seq[] = new long[n];

		for (int i = 0; i < n; i++) {
			seq[i] = sc.nextLong();
		}

		long sum = 0;

		int t = n - K + 1;
		if (t > K) {
			t = K;
		}

		int count = 1;
		int i = 0;
		int j = n - 1;
		while (i < j) {
			long tmp = seq[i] * count;
			tmp += seq[j] * count;
			sum += tmp;
			if (count < t) {
				count++;
			}
			i++;
			j--;
		}

		if (i == j) {
			long tmp = seq[i] * count;
			sum += tmp;
		}

		// for (int i = 0; i < n; i++) {
		// if (i + K > n) {
		// break;
		// }
		// for (int j = i; j < i + K; j++) {
		// sum += seq[j];
		// }
		// }

		System.out.println(sum);

	}

	public static void main(String[] args) {
		new Main().run();
	}

}
