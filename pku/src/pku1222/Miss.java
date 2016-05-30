package pku1222;

import java.util.Iterator;
import java.util.Scanner;

public class Miss {

	int h = 5;
	int w = 6;

	int[][] pzl = new int[h][w];
	int[][] push = new int[h][w];

	boolean check(int[][] a) {
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				if (a[i][j] == 1) {
					return false;
				}
			}
		}
		return true;

	}

	void copy(int[][] a, int[][] b) {
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				a[i][j] = b[i][j];
			}
		}
	}

	int[][] push(int y, int x, int[][] a) {

		// 左端じゃない
		if (x != 0) {
			a[y][x - 1] ^= 1;
		}
		// 右端じゃない
		if (x != w - 1) {
			a[y][x + 1] ^= 1;
		}
		// 上端じゃない
		if (y != 0) {
			a[y - 1][x] ^= 1;
		}
		// 下端じゃない
		if (y != h - 1) {
			a[y + 1][x] ^= 1;
		}
		a[y][x] ^= 1;

		return a;
	}

	void run() {
		Scanner sc = new Scanner(System.in);

		// int n = sc.nextInt();

		// while(true) {
		//
		// }

		// 入力
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 6; j++) {
				pzl[i][j] = sc.nextInt();
			}
		}

		// 処理部分
		for (int i = 0; i < (1 << 6); i++) {

			int[][] tmp = new int[h][w];
			copy(tmp, pzl);

			for (int k = 0; k < w; k++) {
				push[0][k] = (i >> k) & 1;
				tmp[0][k] ^= push[0][k];
			}
			for (int j = 1; j < h; j++) {
				for (int k = 0; k < w; k++) {
					tmp = push(j, k, tmp);
				}
			}
			if (check(tmp) == true) {
				break;
			} else {
				for (int j = 0; j < h; j++) {
					for (int k = 0; k < w; k++) {
						push[j][k] = 0;
					}
				}
			}

		}

		// 出力
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 6; j++) {
				System.out.print(push[i][j] + " ");
			}
			System.out.println();
		}

	}

	public static void main(String[] args) {
		new Miss().run();
	}

}
