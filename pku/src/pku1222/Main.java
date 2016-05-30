package pku1222;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	// h:高さ、w:幅
	int w = 6;
	int h = 5;

	// push[i][j]がpushできるかは、push配列のi-2行j列目、i-1行j-1列目、i-1行j+1列、i-1行j列
	// pzl配列のi-1行j列目に依存する。
	// i:height j:width
	int pushcheck(int[][] push, int[][] pzl, int i, int j) {
		int tmp = 0;

		if (i != 1)
			tmp += push[i - 2][j];
		if (j != 0)
			tmp += push[i - 1][j - 1];
		if (j != w - 1)
			tmp += push[i - 1][j + 1];

		tmp += push[i - 1][j];
		tmp += pzl[i - 1][j];

		return tmp % 2;
	}

	// pzl配列が解けるかどうかを判定する関数pzl_solve
	boolean pzl_solve(int[][] push, int[][] pzl) {

		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				// 左
				if (j != 0)
					pzl[i][j - 1] ^= push[i][j];
				// 右
				if (j != w - 1)
					pzl[i][j + 1] ^= push[i][j];
				// 上
				if (i != 0)
					pzl[i - 1][j] ^= push[i][j];
				// 下
				if (i != h - 1)
					pzl[i + 1][j] ^= push[i][j];
				// 自分自身
				pzl[i][j] ^= push[i][j];
			}
		}

		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				if (pzl[i][j] != 0) {
					return false;
				}
			}
		}
		return true;
	}

	// n+1回目のテストケースの入力された配列aを出力する関数print
	void print(int[][] a, int n) {
		System.out.println("PUZZLE #" + (n + 1));

		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}

	// 配列aを配列bにコピーする関数copy
	void copy(int[][] a, int[][] b) {
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				b[i][j] = a[i][j];
			}
		}
	}

	void run() {
		Scanner sc = new Scanner(System.in);

		// 5*6のマス
		int[][] pzl = new int[h][w];

		// test caseの個数
		int n = sc.nextInt();

		for (int l = 0; l < n; l++) {
			// input
			for (int i = 0; i < h; i++) {
				for (int j = 0; j < w; j++) {
					pzl[i][j] = sc.nextInt();
				}
			}

			// 1行目をどう押すかは2^5通り。
			// 1行目が決まればそのあとは線形で決まる。
			for (int k = 0; k < (1 << 6); k++) {
				int[][] push = new int[h][w];

				// jビット目に1が立っているかどうかのcheck
				for (int j = 0; j < w; j++) {
					push[0][j] = (k >> j) & 1;
				}

				for (int i = 1; i < h; i++) {
					for (int j = 0; j < w; j++) {
						// push[i][j]が押せるかどうかをチェックして決める。
						push[i][j] = pushcheck(push, pzl, i, j);
					}
				}

				// 入力値であるpzl配列を変更しないように予備の配列の作成
				int[][] tmp = new int[h][w];
				copy(pzl, tmp);

				// pzl配列がpush配列に従って押したときに解くことが出来るかをチェック
				if (pzl_solve(push, tmp) == true) {
					print(push, l);
					break;
				}
			}
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}

}
