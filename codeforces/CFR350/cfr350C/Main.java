package cfr350C;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

	void run() {
		Scanner sc = new Scanner(System.in);

		// input
		int n = sc.nextInt();
		int[] scientist = new int[n];
		for (int i = 0; i < n; i++) {
			scientist[i] = sc.nextInt();
		}
		int m = sc.nextInt();
		int[] amovie = new int[m];
		int[] lmovie = new int[m];
		for (int i = 0; i < m; i++) {
			amovie[i] = sc.nextInt();
		}
		for (int i = 0; i < m; i++) {
			lmovie[i] = sc.nextInt();
		}

		Map<Integer, Long> smap = new TreeMap<Integer, Long>();

		for (int i = 0; i < n; i++) {
			int key = scientist[i];
			if (smap.size() == 0) {
				smap.put(key, (long) 1);
			} else {
				if (smap.containsKey(key)) {
					long v = smap.get(key);
					smap.put(key, v + 1);
				} else {
					smap.put(key, (long) 1);
				}
			}
		}

		// debug
		// for (Integer key : smap.keySet()) {
		// System.out.println(key + " " + smap.get(key));
		// }

		long amax = -1;
		long lmax = -1;
		int index = 0;
		for (int i = 0; i < m; i++) {
			int akey = amovie[i];
			int lkey = lmovie[i];

			if (!smap.containsKey(akey)) {
				if (!smap.containsKey(lkey) || amax != -1) {
					continue;
				}
				long w = smap.get(lkey);
				if (lmax < w) {
					lmax = w;
					index = i;
				}
				continue;
			}

			long v = smap.get(akey);
			if (amax < v) {
				amax = v;
				if (smap.containsKey(lkey)) {
					long w = smap.get(lkey);
					lmax = w;
				}
				index = i;
			} else if (v == amax) {
				if (smap.containsKey(lkey)) {
					long w = smap.get(lkey);
					if (lmax < w) {
						lmax = w;
						index = i;
					}
				}
			}
		}

		System.out.println(index + 1);

	}

	public static void main(String[] args) {
		new Main().run();
	}

}
