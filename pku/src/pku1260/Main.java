package pku1260;

import java.util.Scanner;

public class Main {

	void run() {
		Scanner sc = new Scanner(System.in);

		// テストケース数
		int t = sc.nextInt();

		while (t-- > 0) {
			// ランクの個数
			int c = sc.nextInt();

			// n[i]:ランクiの真珠を買う個数
			int[] n = new int[c + 1];

			// p[i]:ランクiの真珠の値段
			int[] p = new int[c + 1];

			// input
			for (int i = 1; i <= c; i++) {
				n[i] = sc.nextInt();
				p[i] = sc.nextInt();
			}

			// f[k]:最下位のランクからk個だけを考えたときの最適解(最小解)
			// f[0]は0
			int[] f = new int[c + 1];
			f[0] = 0;

			// 動的計画法
			// クラスiの真珠は必ず買う
			// クラスi-1を買うorクラスi-1はクラスiの真珠を買いクラスi-2を買う …
			// ⇒クラスi-1以下の時のパターンをすべて行い一番小さい値を選ぶ
			for (int i = 1; i <= c; i++) {
				// 余剰分
				int tmp = p[i] * 10;
				int min = 1000000000;
				for (int j = i - 1; j >= 0; j--) {
					// クラスiでクラスj+1の真珠を買う分を足す
					tmp += (n[j + 1] * p[i]);
					min = Math.min(min, f[j] + tmp);
				}
				f[i] = min;
			}

			// output
			System.out.println(f[c]);
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}

}
