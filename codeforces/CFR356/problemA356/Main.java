package problemA356;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	int n = 5;

	void run() {
		Scanner sc = new Scanner(System.in);

		int[] a = new int[n];

		int sum = 0;
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
			sum += a[i];
		}

		Arrays.sort(a);

		int max = 0;
		for (int i = 0; i < n; i++) {
			int tmp = a[i];
			int count = 1;
			for (int j = i + 1; j < n; j++) {
				if (tmp == a[j]) {
					count++;
				}
			}
			if (count > 1 && count < 4) {
				max = Math.max(tmp * count, max);
			}
		}

		System.out.println(sum - max);

	}

	public static void main(String[] args) {
		new Main().run();
	}

}
