package cfr350C;

import java.util.Comparator;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

	void run() {
		Scanner sc = new Scanner(System.in);

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

		Map<Integer, Integer> smap = new TreeMap<Integer, Integer>();
		Map<Integer, Integer> amap = new TreeMap<Integer, Integer>();
		Map<Integer, Integer> lmap = new TreeMap<Integer, Integer>();

		for (int i = 0; i < n; i++) {
			int key = scientist[i];
			if (smap.size() == 0) {
				smap.put(key, 1);
			} else {
				if (smap.containsKey(key)) {
					int v = smap.get(key);
					smap.put(key, v + 1);
				} else {
					smap.put(key, 1);
				}
			}
		}

		for (int i = 0; i < m; i++) {

		}

	}

	public static void main(String[] args) {
		new Main().run();
	}

}
