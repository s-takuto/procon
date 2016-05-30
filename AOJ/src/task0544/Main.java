package task0544;

import java.util.Scanner;

public class Main {

	void run() {
		Scanner sc = new Scanner(System.in);

		while (true) {
			//すごろくのマス目
			int n = sc.nextInt();
			//サイコロを振った回数
			int m = sc.nextInt();

			if ((n | m) == 0) {
				break;
			}

			//初期入力
			int[] map = new int[n];
			for (int i = 0; i < n; i++) {
				map[i] = sc.nextInt();
			}
			int[] dice = new int[m];
			for (int i = 0; i < m; i++) {
				dice[i] = sc.nextInt();
			}

			int x = 0;
			int cnt = 1;

			for (int i = 0; i < m; i++) {
				x += dice[i];
				if (x >= n - 1) {
					break;
				}

				x += map[x];
				if (x >= n - 1) {
					break;
				}
				cnt++;
			}

			System.out.println(cnt);
		}

	}

	public static void main(String[] args) {
		new Main().run();
	}

}
