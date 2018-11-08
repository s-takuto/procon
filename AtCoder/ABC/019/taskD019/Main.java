package taskD019;

import java.util.Scanner;

public class Main {

	Scanner sc = new Scanner(System.in);

	void run() {
		int n = sc.nextInt();

		// solve20(n);
		solve100(n);

		sc.close();
	}

	// ある頂点a,bの距離をすべての頂点に対して入力して、その最大値が木の直径。
	// ⇒最大質問回数N*(N-1)/2 = (50*49)/2 = 1225 <= 1300
	void solve20(int n) {
		int max = 0;

		for (int i = 1; i <= n; i++) {
			for (int j = i + 1; j <= n; j++) {
				System.out.printf("? %d %d\n", i, j);
				int x = sc.nextInt();
				max = Math.max(max, x);
			}
		}

		System.out.printf("! %d\n", max);

	}

	// 木の直径はある頂点aから一番遠い頂点bを選び、
	// さらに頂点bから一番遠い頂点cを選んだときの長さになる。
	void solve100(int n) {
		int best = 0;
		int bestdist = 0;

		// 頂点aから一番遠い頂点bを選択（N-1回）
		for (int i = 2; i <= n; i++) {
			int dist = in(1, i);
			if (bestdist < dist) {
				bestdist = dist;
				best = i;
			}
		}

		// 頂点bから一番遠い頂点cを選択（N-1回）
		int ret = 0;
		for (int i = 1; i <= n; i++) {
			if (best == i)
				continue;
			ret = Math.max(ret, in(best, i));
		}
		System.out.printf("! %d\n", ret);
	}

	int in(int a, int b) {
		System.out.printf("? %d %d\n", a, b);
		return sc.nextInt();
	}

	public static void main(String[] args) {
		new Main().run();
	}

}
