package task1172;

import java.util.Arrays;
import java.util.Scanner;

public class Task1172 {

	final static int MAX = 300000;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 目的の大きさよりも大きいものを作る
		boolean[] s = new boolean[MAX];
		Arrays.fill(s, true);

		s[0] = false;
		s[1] = false;

		//エラトステネスの篩
		for (int i = 2; i * i < MAX; i++) {
			if (s[i]) {
				for (int j = i + i; j < MAX; j += i) {
					if (j % i == 0) {
						s[j] = false;
					}
				}
			}
		}

		// System.out.println(s[17]);
		// System.out.println(s[19]);
		// System.out.println(s[23]);

		while (true) {
			int n = sc.nextInt();

			if (n == 0) {
				break;
			}

			int cnt = 0;

			for (int i = n + 1; i <= 2 * n; i++) {
				if (s[i]) {
					cnt++;
				}
			}

			System.out.println(cnt);

		}

	}
}
