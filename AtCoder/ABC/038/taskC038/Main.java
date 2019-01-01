package taskC038;

import java.util.Scanner;

public class Main {

	void run() {
		Scanner sc = new Scanner(System.in);

		// input
		int n = sc.nextInt();
		int[] seq = new int[n + 1];
		for (int i = 0; i < n; i++) {
			seq[i] = sc.nextInt();
		}
		// 番兵
		seq[n] = -1;

		int l = 0;
		int r = 1;
		int sum = 0;

		while (l <= n) {
			if (seq[r] < 0) {
				break;
			}
			while (seq[r - 1] < seq[r]) {
				r++;
			}
			sum += (r - l + 1);
			l++;
		}

		System.out.println(sum);

	}

	public static void main(String[] args) {
		new Main().run();
	}

}
