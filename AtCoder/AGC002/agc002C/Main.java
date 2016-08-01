package agc002C;

import java.util.Scanner;

public class Main {

	void run() {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		long L = sc.nextInt();
		long[] a = new long[n];

		for (int i = 0; i < n; i++) {
			a[i] = Long.parseLong(sc.next());
		}

		int j = -1;
		for (int i = 0; i < n - 1; i++) {

			long sum = a[i] + a[i + 1];
			if (sum >= L) {
				j = i;
				break;
			}
		}

		if (j == -1) {
			System.out.println("Impossible");
		} else {
			System.out.println("Possible");
			for (int i = 0; i < j; i++) {
				System.out.println(i + 1);
			}
			for (int i = n - 1; i > j + 1; i--) {
				System.out.println(i);
			}
			System.out.println(j + 1);
		}

	}

	public static void main(String[] args) {
		new Main().run();
	}

}
