package pku1239;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	// 文字列str1とstr2を数値で比較するためのメソッド
	int strCompare(String str1, String str2) {
		int j = str1.length();
		for (int i = 0; i < str1.length(); i++) {
			if (str1.substring(i, i + 1).compareTo("0") != 0) {
				j = i;
				break;
			}
		}

		int k = str2.length();
		for (int i = 0; i < str2.length(); i++) {
			if (str2.substring(i, i + 1).compareTo("0") != 0) {
				k = i;
				break;
			}
		}

		int s1 = str1.substring(j).length();
		int s2 = str2.substring(k).length();

		// debug
		// System.out.println("str1:" + str1);
		// System.out.println("str2:" + str2);
		// System.out.println("s1:" + str1.substring(j));
		// System.out.println("s2:" + str2.substring(k));
		// System.out.println();

		if (s1 > s2) {
			return 1;
		} else if (s1 < s2) {
			return -1;
		} else {
			return str1.compareTo(str2);
		}
	}

	void run() {
		Scanner sc = new Scanner(System.in);

		while (!sc.hasNext("0")) {
			// input
			String s = sc.next();

			int n = s.length();
			String[] f = new String[n + 1];
			f[0] = "0";
			for (int i = 1; i <= n; i++) {
				for (int j = i - 1; j >= 0; j--) {
					String k = s.substring(j, i);
					if (strCompare(k, f[j]) > 0 || strCompare(f[j], "0") == 0) {
						f[i] = k;
						break;
					}
				}
			}

			String[] g = new String[n];
			int limit = n - f[n].length();
			g[limit] = f[n];
			for (int i = limit - 1; i >= 0; i--) {
				for (int j = limit; j > i; j--) {
					String k = s.substring(i, j);
					if (strCompare(k, g[j]) < 0
							|| (strCompare(g[j], "0") == 0 && strCompare(k,
									g[limit]) < 0)) {
						g[i] = k;
						break;
					}
				}
			}

			System.out.println(Arrays.toString(f));
			System.out.println(Arrays.toString(g));

			// カンマの位置決め
			int[] comma = new int[n];
			int k = 0;
			int i = n;
			// while (i > 0) {
			// int j = i - 1;
			// while (j >= 0) {
			// String str = s.substring(j, i);
			// if (strCompare(f[i], str) == 0) {
			// comma[k++] = j;
			// i = j;
			// break;
			// }
			// j--;
			// }
			// }

			i = 0;
			comma[0] = 0;
			k = 1;
			while (i < limit) {
				int j = i + 1;
				while (j < n) {
					String str1 = s.substring(i, j);
					if (strCompare(g[i], str1) == 0) {
						comma[k++] = j;
						i = j;
					}
					j++;
				}
			}

			// output
			// k -= 2;
			// while (k >= 0) {
			// System.out.print(f[comma[k--]] + ",");
			// }
			// System.out.println(f[n]);

			i = 0;
			while (i < k-1) {
				System.out.print(g[comma[i++]] + ",");
			}
			System.out.println(g[limit]);

		}
	}

	public static void main(String[] args) {
		new Main().run();

	}

}
