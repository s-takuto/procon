package cfr350B;

import java.util.Scanner;

public class Main {

	void run() {
		Scanner sc = new Scanner(System.in);

		// input
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] d = new int[n];
		int[] gfirst = new int[n];
		for (int i = 0; i < n; i++) {
			d[i] = sc.nextInt();
		}

		gfirst[0] = 1;
		for (int i = 1; i < n; i++) {
			gfirst[i] = gfirst[i - 1] + i;
		}

		// for (int i = 0; i < n; i++) {
		// System.out.println(gfirst[i]);
		// }

		int first = gfirst[n - 1];
		for (int i = 0; i < n - 1; i++) {
			if (gfirst[i] <= k && k < gfirst[i + 1]) {
				first = gfirst[i];
				break;
			}
		}
		int number = k - first;
		System.out.println(d[number]);

	}

	public static void main(String[] args) {
		new Main().run();
	}

}
