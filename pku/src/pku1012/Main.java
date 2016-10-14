package pku1012;

import java.util.Scanner;

public class Main {

	int[] ans;

	void run() {
		Scanner sc = new Scanner(System.in);

		ans = new int[14];
		solve();

		while (sc.hasNext()) {
			// input
			int k = sc.nextInt();
			if (k == 0) {
				break;
			}

			System.out.println(ans[k]);
		}
	}

	void solve() {
		for (int k = 1; k < 14; k++) {
			for (int m = 1;; m++) {
				int n = k * 2;
				// 処刑する人
				int cur = 0;
				// 悪人を処刑した人数
				int count = 0;
				// 善人を処刑した場合true
				boolean flag = false;

				// System.out.println("m:" + m);
				while (count < k) {
					// 処刑する人
					cur = (cur + m - 1) % n;
					// System.out.println("cur:" + cur);

					if (cur < k) {
						flag = true;
						break;
					} else {
						count++;
					}
					// 処刑された人の隣の人に番号を移す
					if (n - 1 == cur) {
						cur = 0;
					}
					n--;
				}

				// 悪人をk人処刑できた場合
				if (count == k && !flag) {
					ans[k] = m;
					break;
				}
			}
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}
}
