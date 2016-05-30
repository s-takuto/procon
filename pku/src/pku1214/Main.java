package pku1214;

import java.util.Scanner;

public class Main {

	void run() {
		Scanner sc = new Scanner(System.in);

		while (true) {
			// pile[i][j]:i番目のpileの一番上のj+1番目のカード
			String pile[][] = new String[55][55];

			// pile[i]:各pileのi番目の枚数
			int height[] = new int[55];

			// カードの枚数
			int n = 52;

			// 入力に"#"が入力されたら終了
			if (sc.hasNext("#")) {
				break;
			}

			// 入力
			for (int i = 0; i < 52; i++) {
				pile[i][0] = sc.next();
				height[i] = 1;
			}

			// 処理部分
			for (int i = 1; height[i] != 0; i++) {

				// matchしたときの優先順位は、3つとなりに移す時の方が上

				if (i - 3 >= 0) {
					// 左3つ隣
					// 数字
					if (pile[i][height[i] - 1].substring(0, 1).contains(
							pile[i - 3][height[i - 3] - 1].substring(0, 1))) {
						pile[i - 3][height[i - 3]] = pile[i][height[i] - 1];
						pile[i][height[i] - 1] = null;
						height[i - 3]++;
						height[i]--;

						// gapを詰める
						if (height[i] == 0) {
							for (int j = i; j < n - 1; j++) {
								pile[j] = pile[j + 1];
								height[j] = height[j + 1];
							}
							pile[n - 1] = null;
							height[n - 1] = 0;
						}
						i = 0; // 最初から見直す
						continue;
					}
					// 左3つ隣
					// 文字
					else if (pile[i][height[i] - 1].substring(1, 2).contains(
							pile[i - 3][height[i - 3] - 1].substring(1, 2))) {
						pile[i - 3][height[i - 3]] = pile[i][height[i] - 1];
						pile[i][height[i] - 1] = null;
						height[i - 3]++;
						height[i]--;

						// gapを詰める
						if (height[i] == 0) {
							for (int j = i; j < n - 1; j++) {
								pile[j] = pile[j + 1];
								height[j] = height[j + 1];
							}
							pile[n - 1] = null;
							height[n - 1] = 0;
						}
						i = 0; // 最初から見直す
						continue;
					}
				}

				// 左隣の場合
				// 数字
				if (pile[i][height[i] - 1].substring(0, 1).contains(
						pile[i - 1][height[i - 1] - 1].substring(0, 1))) {

					pile[i - 1][height[i - 1]] = pile[i][height[i] - 1];
					pile[i][height[i] - 1] = null;
					height[i - 1]++;
					height[i]--;

					// gapを詰める
					if (height[i] == 0) {
						for (int j = i; j < n - 1; j++) {
							pile[j] = pile[j + 1];
							height[j] = height[j + 1];
						}
						pile[n - 1] = null;
						height[n - 1] = 0;
					}
					i = 0; // 最初から見直す
					continue;
				}
				// 左隣の場合
				// 絵柄
				else if (pile[i][height[i] - 1].substring(1, 2).contains(
						pile[i - 1][height[i - 1] - 1].substring(1, 2))) {
					pile[i - 1][height[i - 1]] = pile[i][height[i] - 1];
					pile[i][height[i] - 1] = null;
					height[i - 1]++;
					height[i]--;

					// gapを詰める
					if (height[i] == 0) {
						for (int j = i; j < n - 1; j++) {
							pile[j] = pile[j + 1];
							height[j] = height[j + 1];
						}
						pile[n - 1] = null;
						height[n - 1] = 0;
					}
					i = 0; // 最初から見直す
					continue;
				}

			}

			// 出力
			String str = new String();
			int count = 0;
			for (int i = 0; i < 52; i++) {
				if (height[i] != 0) {
					count++;
				}
			}
			str += count;
			str += " piles remaining:";
			for (int i = 0; i < 52; i++) {
				if (height[i] != 0) {
					str += " ";
					str += height[i];
				}
			}

			System.out.println(str);

		}
		sc.close();

	}

	public static void main(String[] args) {
		new Main().run();
	}

}
