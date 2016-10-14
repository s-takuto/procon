package pku1012;

import java.util.Scanner;

public class Main1 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			int k = scan.nextInt();
			if (k == 0) {
				return;
			}

			for (int m = 1;; m++) {
				int s = 0;
				int count = 0;
				int n = k * 2;
				// System.out.println("m:" + m);
				for (int j = 1; count < k;) {

					// 次に処刑する人
					j = (j + m - 1);

					if (j > n) {
						// 何周したか
						int time = j / n;
						j = j - n * time;
						// 変更点！
						// 自分自身に戻ってくるときはその時の人の人数にする。
						if (j == 0) {
							j = n;
						}
					}
					// System.out.println("j:" + j);
					if (j <= k) {
						// 殺さない
						break;
					} else {
						// 殺す
						count = count + 1;
						// 処刑した人の隣の人に順番を移す
						if (j == n) {
							j = 1;
						}
						n--;
					}
				}
				if (count == k) {
					System.out.println(m);
					break;
				}
				count = 0;
			}

		}
	}

}