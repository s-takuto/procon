package pku1316;

import java.util.Arrays;

public class Main {

	public final int n = 10000;

	void run() {
		boolean[] num = new boolean[n];
		Arrays.fill(num, true);

		for (int i = 1; i < n; i++) {
			if (num[i]) {
				System.out.println(i);
			}
			int tmp = i;
			int sum = i;
			// 各桁数を求める
			while (tmp > 0) {
				sum += tmp % 10;
				tmp /= 10;
			}
			if (sum < n) {
				num[sum] = false;
			}
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}

}
