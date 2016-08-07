package ecfr15A;

import java.util.Scanner;

public class Main {

	void run() {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}

		int count = 1;
		int max = 0;
		for (int i = 0; i < n - 1; i++) {
			if (a[i] < a[i + 1]) {
				count++;
			} else {
				max = Math.max(count, max);
				count = 1;
			}
		}

		System.out.println(Math.max(count, max));

	}

	public static void main(String[] args) {
		new Main().run();
	}

}
