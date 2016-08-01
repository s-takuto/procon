package taskC041;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Main {

	void run() {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] a = new int[n];

		Set<Integer> s = new TreeSet<>();

		Map<Integer, Integer> map = new TreeMap<>();

		for (int i = 0; i < n; i++) {
			int tmp = sc.nextInt();
			s.add(tmp);
			map.put(tmp, i + 1);
		}

		Iterator it = s.iterator();

		int i = 0;
		while (it.hasNext()) {
			a[i++] = (int) it.next();
		}

		for (int j = n - 1; j >= 0; j--) {
			System.out.println(map.get(a[j]));
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}

}
