package cfr364A;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	void run() {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] a = new int[n];

		int sum = 0;
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
			sum += a[i];
		}

		int player = n / 2;
		sum /= player;

		boolean[] used = new boolean[n];
		Arrays.fill(used, false);

		for (int i = 0; i < n; i++) {
			if (used[i]) {
				continue;
			}
			used[i] = true;
			for (int j = i + 1; j < n; j++) {
				if (!used[j] && a[i] + a[j] == sum) {
					System.out.println((i + 1) + " " + (j + 1));
					used[j] = true;
					break;
				}
			}
		}

	}

	public static void main(String[] args) {
		new Main().run();
	}

}
