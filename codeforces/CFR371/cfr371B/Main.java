package cfr371B;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	void run() {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] a = new int[n];
		int min = Integer.MAX_VALUE;
		int max = 0;
		Set<Integer> set = new HashSet<>();

		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
			max = Math.max(max, a[i]);
			min = Math.min(min, a[i]);
			set.add(a[i]);
		}

		n = set.size();
		a = new int[n];
		int k = 0;
		for (Integer e : set) {
			a[k++] = e;
		}
		int med = (max + min) / 2;

		if (n == 2) {
			System.out.println("YES");
			return;
		}

		int tar = 0;
		for (int i = 0; i < n; i++) {
			a[i] = Math.abs(med - a[i]);
			if (a[i] != 0) {
				tar = a[i];
			}
		}

		for (int i = 0; i < n; i++) {
			if (a[i] == 0) {
				continue;
			}
			if (tar != a[i]) {
				System.out.println("NO");
				return;
			}
		}

		System.out.println("YES");
	}

	public static void main(String[] args) {
		new Main().run();
	}

}
