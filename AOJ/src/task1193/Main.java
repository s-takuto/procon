package task1193;

import java.util.Arrays;
import java.util.Scanner;

// 途中
public class Main {

	// パズル
	int[][] p;

	boolean[][] flag;

	// パズルの高さ
	int h;

	int[] vx = { 1, -1 };

	int cnt;

	int sum;

	void run() {

		Scanner sc = new Scanner(System.in);

		while (true) {
			h = sc.nextInt();

			if (h == 0) {
				break;
			}

			p = new int[h][5];
			flag = new boolean[h][5];

			// Arrays.fill(flag, false);

			// 初期入力
			for (int i = 0; i < h; i++) {
				for (int j = 0; j < 5; j++) {
					p[i][j] = sc.nextInt();
				}
			}
			sum = 0;

			for (int i = 0; i < h; i++) {
				for (int j = 0; j < 5; j++) {
					if (!flag[j][i]) {
						int n = search(j, i);
						if (n >= 3) {
							sum += p[j][i] * n;
						}
					}
				}
			}

			// 訪れた頂点はflagで管理
			// 連結数が分かれば、その後消すのは簡単p[h][i+cnt]でいける
		}

	}

	public static void main(String[] args) {
		new Main().run();
	}

	// 連結数を数える
	public int search(int x, int y) {
		if (x < 0 || y < 0 || x >= h || y >= 5 || p[y][x] == 0) {
			return 0;
		}

		flag[y][x] = true;

		cnt = 1;

		for (int i = 0; i < vx.length; i++) {
			cnt += search(x + vx[i], y);
		}

		return cnt;
	}
}
