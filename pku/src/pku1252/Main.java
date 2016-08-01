package pku1252;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Scanner;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

public class Main {

	// coinの種類
	private int n = 6;

	void run() {
		Scanner sc = new Scanner(System.in);

		// testcase number
		int t = sc.nextInt();
		while (t-- > 0) {
			// input
			int[] coin = new int[n];
			for (int i = 0; i < n; i++) {
				coin[i] = sc.nextInt();
			}

			int[] f = new int[101];

			// おつり無しで支払いに必要なコインの枚数の最小値
			for (int i = 1; i <= 100; i++) {
				int min = 10000;
				for (int j = 0; j < n; j++) {
					if (i - coin[j] >= 0) {
						min = Math.min(min, f[i - coin[j]]);
					}
				}
				f[i] = min + 1;
			}

			// 1~100セントの支払うときの最大の枚数を調べる
			int max = f[0];
			for (int i = 1; i <= 100; i++) {
				max = Math.max(max, f[i]);
			}

			// おつり有りのときに必要な支払う金額の上限値を求める
			int size = max * coin[n - 1];
			f = new int[size + 1];

			// おつり無し
			for (int i = 1; i <= size; i++) {
				int min = 10000;
				for (int j = 0; j < n; j++) {
					if (i - coin[j] >= 0) {
						min = Math.min(min, f[i - coin[j]]);
					}
				}
				f[i] = min + 1;
			}

			// おつりあり
			for (int i = 1; i <= 100; i++) {
				int min = f[i];
				for (int j = i + 1; j <= size; j++) {
					min = Math.min(min, f[j] + f[j - i]);
				}
				f[i] = min;
			}

			// output
			double sum = 0;
			for (int i = 0; i <= 100; i++) {
				sum += f[i];
			}

			max = f[0];
			for (int i = 1; i <= 100; i++) {
				max = Math.max(max, f[i]);
			}

			System.out.printf("%.2f", sum / 100);
			System.out.println(" " + max);
		}

	}

	public static void main(String[] args) {
		new Main().run();
	}

}
