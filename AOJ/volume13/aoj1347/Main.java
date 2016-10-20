package aoj1347;

import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

import static java.lang.Math.*;

public class Main {

	class Pair implements Comparable<Pair> {
		int a;
		int b;

		public Pair(int a, int b) {
			this.a = a;
			this.b = b;
		}

		public int compareTo(Pair p) {
			return this.b - p.b;
		}
	}

	void run() {
		// input
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		if (m == 0) {
			System.out.println(n + 1);
			return;
		}
		Pair[] pair = new Pair[m];
		for (int i = 0; i < m; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			pair[i] = new Pair(a, b);
		}
		Arrays.sort(pair);

		// debug
		// for (int i = 0; i < m; i++) {
		// System.out.println(pair[i].a + " " + pair[i].b);
		// }
		// System.out.println();

		Map<Integer, Integer> res = new TreeMap<Integer, Integer>();
		int key = pair[m - 1].b;
		int val = pair[m - 1].a;
		for (int i = m - 2; i >= 0; i--) {
			if (val <= pair[i].b) {
				val = min(val, pair[i].a);
				key = max(key, pair[i].b);
			} else {
				// 残すべき区間
				if (res.containsKey(key)) {
					val = min(val, res.get(key));
				}
				res.put(key, val);
				key = pair[i].b;
				val = pair[i].a;
			}
		}
		res.put(key, val);

		// debug
		// for (Integer k : res.keySet()) {
		// System.out.println(k + " " + res.get(k));
		// }

		int count = 0;
		int pos = 0;
		for (Integer k : res.keySet()) {
			int back = res.get(k);
			count += ((k - pos) + (k - back) * 2);
			pos = k;
		}
		count += (n - pos + 1);
		System.out.println(count);
	}

	public static void main(String[] args) {
		new Main().run();
	}

}
