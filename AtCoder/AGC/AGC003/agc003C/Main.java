package agc003C;

import java.util.Scanner;

public class Main {

	void run() {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}

		// 操作2
		for (int i = 0; i < n - 2; i++) {
			if (a[i] > a[i + 1] && a[i + 1] > a[i + 2]) {
				int tmp = a[i];
				a[i] = a[i + 2];
				a[i + 2] = tmp;
				i = -1;
				// System.out.println("条件１");
				// System.out.println(Arrays.toString(a));
			} else if (a[i] < a[i + 1] && a[i + 1] > a[i + 2] && a[i] > a[i + 2]) {
				int tmp = a[i];
				a[i] = a[i + 2];
				a[i + 2] = tmp;
				i = -1;
				// System.out.println("条件2");
				// System.out.println(Arrays.toString(a));
			}
		}

		// System.out.println(Arrays.toString(a));

		// 操作1
		int count = 0;
		for (int i = 0; i < n - 1; i++) {
			if (a[i] > a[i + 1]) {
				int tmp = a[i];
				a[i] = a[i + 1];
				a[i + 1] = tmp;
				i = -1;
				count++;
			}
		}

		System.out.println(count);

	}

	public static void main(String[] args) {
		new Main().run();
	}

}
