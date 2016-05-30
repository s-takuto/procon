package task1160;

import java.util.Arrays;
import java.util.Scanner;

public class Task1160 {

	int[][] map;

	int w, h;

	// 遷移ベクトル
	int[] ax = { -1, 0, 1, 1, 1, 0, -1, -1 };
	int[] ay = { -1, -1, -1, 0, 1, 1, 1, 0 };

	void run() {
		Scanner sc = new Scanner(System.in);

		// char c[] = sc.toString().toCharArray();

		while (true) {
			w = sc.nextInt();
			h = sc.nextInt();

			// w=0かつh=0だと必ず0になる(bit演算の論理和)
			if ((w | h) == 0) {
				break;
			}

			map = new int[h][w];

			for (int j = 0; j < h; j++) {
				for (int i = 0; i < w; i++) {
					map[j][i] = sc.nextInt();
				}
			}

			int cnt = 0;

			for (int j = 0; j < h; j++) {
				for (int i = 0; i < w; i++) {
					if (map[j][i] == 1) {
						search(i, j);
						// System.out.println("i = " + i + ", j = " + j);
						// debug();
						cnt++;
					}
				}
			}

			System.out.println(cnt);

		}

	}

	public static void main(String[] args) {

		new Task1160().run();

	}

	public void search(int x, int y) {

		if (x < 0 || y < 0 || x >= w || y >= h || map[y][x] == 0) {
			return;
		}

		map[y][x] = 0;

		for (int i = 0; i < 8; i++) {
			int nx = x + ax[i];
			int ny = y + ay[i];
			search(nx, ny);
		}
	}

	public void debug() {
		// test
		System.out.println("---------------");
		for (int j = 0; j < h; j++) {
			for (int i = 0; i < w; i++) {
				System.out.print(map[j][i] + " ");
			}
			System.out.println();
		}
		System.out.println("---------------");
	}
}
