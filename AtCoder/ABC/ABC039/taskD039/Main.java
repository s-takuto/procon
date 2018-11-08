package taskD039;

import java.util.Scanner;

public class Main {

	int[] dx = { 0, 1, 1, 1, 0, -1, -1, -1, 0 };
	int[] dy = { -1, -1, 0, 1, 1, 1, 0, -1, 0 };

	void run() {
		Scanner sc = new Scanner(System.in);

		int h = sc.nextInt();
		int w = sc.nextInt();
		char[][] image = new char[h][w];
		for (int i = 0; i < h; i++) {
			image[i] = sc.next().toCharArray();
		}

		char[][] ans = new char[h][w];
		boolean f = true;
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				for (int k = 0; k < 9; k++) {
					if ((i + dy[k] >= 0) && (i + dy[k] < h) && (j + dx[k] >= 0) && (j + dx[k] < w)) {
						if (image[i + dy[k]][j + dx[k]] != '#') {
							f = false;
							break;
						}
					}
				}
				if (f) {
					ans[i][j] = '#';
				}
				else {
					ans[i][j] = '.';
					f = true;
				}
			}
		}

		// 復元
		char[][] ans_contraction = new char[h][w];
		f = false;
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				for (int k = 0; k < 9; k++) {
					if ((i + dy[k] >= 0) && (i + dy[k] < h) && (j + dx[k] >= 0) && (j + dx[k] < w)) {
						if (ans[i + dy[k]][j + dx[k]] == '#') {
							f = true;
							break;
						}
					}
				}
				if (f) {
					ans_contraction[i][j] = '#';
					f = false;
				}
				else {
					ans_contraction[i][j] = '.';
				}
			}
		}

		// debug
		// for (int i = 0; i < h; i++) {
		// for (int j = 0; j < w; j++) {
		// System.out.print(ans[i][j]);
		// }
		// System.out.println();
		// }
		//
		// for (int i = 0; i < h; i++) {
		// for (int j = 0; j < w; j++) {
		// System.out.print(ans_contraction[i][j]);
		// }
		// System.out.println();
		// }

		boolean decode = true;
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				if (image[i][j] != ans_contraction[i][j]) {
					decode = false;
					break;
				}
			}
		}

		if (decode) {
			System.out.println("possible");
			for (int i = 0; i < h; i++) {
				for (int j = 0; j < w; j++) {
					System.out.print(ans[i][j]);
				}
				System.out.println();
			}
		}
		else {
			System.out.println("impossible");
		}

	}

	public static void main(String[] args) {
		new Main().run();
	}

}
