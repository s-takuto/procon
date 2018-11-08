package abc036d;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

//須田さん作成
public class Main1 {
	int n;
	List<Integer>[] e;
	int[] parent;
	long[] a, b;
	long MOD = 1_000_000_000 + 7;

	void makeParent(int i) {
		for (Integer next : e[i]) {
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
		for (Integer child : e[k]) {
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
		for (Integer child : e[k]) {
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

		n = sc.nextInt();
		e = new LinkedList[n];
		for (int i = 0; i < n; i++) {
			e[i] = new LinkedList<Integer>();
		}
		for (int i = 0; i < n - 1; i++) {
			int a = sc.nextInt() - 1;
			int b = sc.nextInt() - 1;
			e[a].add(b);
			e[b].add(a);
		}

		parent = new int[n];
		Arrays.fill(parent, -1);
		parent[0] = 0;
		makeParent(0);
		a = new long[n];
		b = new long[n];
		System.out.println((a(0) + b(0)) % MOD);
	}

	public static void main(String[] args) {
		new Main1().run();
	}
}
