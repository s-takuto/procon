package cfr376b;

import java.util.Scanner;

public class Main {

	void run() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}

		boolean f = true;
		for (int i = 0; i < n; i++) {
			if (i != n - 1) {
				if (a[i] < 0) {
					f = false;
					break;
				}
				if (a[i] == 0) {
					continue;
				}
			}

			if (i == n - 1) {
				if (a[i] == 0) {
					break;
				} else if (a[i] < 0) {
					f = false;
					break;
				} else if (a[i] % 2 == 0) {
					break;
				} else {
					f = false;
					break;
				}
			}

			if (a[i] % 2 != 0) {
				a[i] = 0;
				a[i + 1] -= 1;
			} else {
				a[i] = 0;
			}
		}

		if (f) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}

	}

	public static void main(String[] args) {
		new Main().run();
	}

}
