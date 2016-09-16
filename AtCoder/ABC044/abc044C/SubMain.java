package abc044C;

import java.util.Arrays;
import java.util.Scanner;

//部分点解法
//バックトラックを使用して、すべての組み合わせを調べて平均値を求めて、aと等しくなるか判定しただけ
public class SubMain {

	int n;
	int a;

	int[] x;

	int count;

	boolean[] used;

	void run() {
		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();
		a = sc.nextInt();

		x = new int[n];
		for (int i = 0; i < n; i++) {
			x[i] = sc.nextInt();
		}

		count = 0;

		for (int i = 1; i <= n; i++) {
			used = new boolean[n];
			solve(0, 0, i);
			// System.out.println();
		}

		System.out.println(count);

	}

	// backtrack
	void solve(int i, int num, int k) {
		if (num == k) {
			// System.out.println("used:" + Arrays.toString(used));
			double sum = 0;
			for (int j = 0; j < n; j++) {
				if (used[j]) {
					sum += x[j];
				}
			}
			sum /= num;
			if (sum == a) {
				// System.out.println("used:" + Arrays.toString(used));
				count++;
			}
			return;
		}
		if (i == n) {
			return;
		}

		used[i] = true;
		solve(i + 1, num + 1, k);
		used[i] = false;
		solve(i + 1, num, k);
	}

	public static void main(String[] args) {
		new SubMain().run();
	}

}
