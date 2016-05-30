package task0015;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	int SIZE = 80;
	int[] ans;

	void run() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for (int l = 0; l < n; l++) {
			// 80ケタの数字は扱えないので文字列に
			char[] a = sc.next().toCharArray();
			char[] b = sc.next().toCharArray();

			// 入力が80ケタを超える
			if (a.length > SIZE || b.length > SIZE) {
				System.out.println("overflow");
				continue;
			}

			// 文字列⇒配列に
			int[] x = new int[a.length];
			int[] y = new int[b.length];
			for (int i = 0; i < a.length; i++) {
				x[i] = a[i] - '0';
			}
			for (int i = 0; i < b.length; i++) {
				y[i] = b[i] - '0';
			}

			// 大きい桁数+1だけ答えの配列をとる
			if (x.length >= y.length) {
				ans = new int[x.length + 1];
			} else {
				ans = new int[y.length + 1];
			}

			int i = x.length - 1;
			int j = y.length - 1;
			int k = ans.length - 1;
			int count = 0;
			boolean flag = false;

			// 同じ桁数の計算
			while (i >= 0 && j >= 0) {
				count++;
				ans[k] += (x[i] + y[j]);
				// 繰り上がり処理
				if (ans[k] >= 10) {
					if (count < SIZE) {
						ans[k - 1] = 1;
						ans[k] -= 10;
					} else {
						flag = true;
					}
				}
				i--;
				j--;
				k--;
			}

			// x>y（桁数）
			if (i > j) {
				while (i >= 0) {
					count++;
					ans[k] += x[i];
					// 繰り上がり処理
					if (ans[k] >= 10) {
						if (count < SIZE) {
							ans[k - 1] = 1;
							ans[k] -= 10;
						} else {
							flag = true;
						}
					}
					k--;
					i--;
				}
			} else {
				while (j >= 0) {
					count++;
					ans[k] += y[j];
					// 繰り上がり処理
					if (ans[k] >= 10) {
						if (count < SIZE) {
							ans[k - 1] = 1;
							ans[k] -= 10;
						} else {
							flag = true;
						}
					}
					k--;
					j--;
				}
			}

			if (flag) {
				System.out.println("overflow");
				continue;
			}

			for (int m = 0; m < ans.length; m++) {
				if (m == 0 && ans[m] == 0) {
					continue;
				}
				System.out.print(ans[m]);
			}
			System.out.println();
		}

		sc.close();
	}

	// long以上の整数⇒BigInteger
	// 正確な小数の計算⇒BigDecimal
	void run1() {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		while (t != 0) {
			BigInteger bi = sc.nextBigInteger().add(sc.nextBigInteger());
			if (bi.toString().length() > 80) {
				System.out.println("overflow");
			} else {
				System.out.println(bi);
			}
			t--;
		}
		sc.close();
	}

	public static void main(String[] args) {
		new Main().run();
	}

}
