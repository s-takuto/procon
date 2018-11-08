package taskD;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class NewMain {

	// 各頂点の隣接リスト
	List<Integer> list[];
	// 頂点数
	int n;
	// 各頂点の親の番号が入っている配列
	int[] parent;

	long[] a, b;

	long MOD = 1_000_000_000 + 7;

	// 頂点iが親であることを子に教えるメソッド
	void makeParent(int i) {
		for (Integer next : list[i]) {
			if (parent[next] != -1) {
				continue;
			}
			parent[next] = i;
			makeParent(next);
		}
	}

	long a(int k) {
		if (a[k] != 0) {
			return a[k];
		}

		a[k] = 1;
		for (Integer child : list[k]) {
			if (child == parent[k]) {
				continue;
			}
			a[k] *= b(child);
			a[k] %= MOD;
		}
		return a[k];
	}

	long b(int k) {
		if (b[k] != 0) {
			return b[k];
		}

		b[k] = 1;
		for (Integer child : list[k]) {
			if (child == parent[k]) {
				continue;
			}
			long tmp = a(child) + b(child);
			tmp %= MOD;
			b[k] *= tmp;
			b[k] %= MOD;
		}
		return b[k];
	}

	void run() {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		list = new LinkedList[n];

		// listの初期化
		for (int i = 0; i < n; i++) {
			list[i] = new LinkedList<Integer>();
		}

		// 隣接リストのinput
		for (int i = 0; i < n - 1; i++) {
			int a = sc.nextInt() - 1;
			int b = sc.nextInt() - 1;
			list[a].add(b);
			list[b].add(a);
		}

		// 各頂点の親のinput
		parent = new int[n];
		// parentの初期化
		Arrays.fill(parent, -1);
		parent[0] = 0;
		makeParent(0);

		a = new long[n];
		b = new long[n];

		System.out.println((a(0) + b(0)) % MOD);
	}

	public static void main(String[] args) {
		new NewMain().run();
	}
}
