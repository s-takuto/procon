package problemA357;

import java.util.Scanner;

public class Main {

	void run() {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] before = new int[n];
		int[] after = new int[n];
		String str = new String();
		for (int i = 0; i < n; i++) {
			str = sc.next();
			before[i] = sc.nextInt();
			after[i] = sc.nextInt();
		}

		boolean f = true;
		for (int i = 0; i < n; i++) {
			if (before[i] >= 2400) {
				if (after[i] > 2400 && (after[i] - before[i]) > 0) {
					System.out.println("YES");
					f = false;
					break;
				}
			}
		}

		if (f) {
			System.out.println("NO");
		}

	}

	public static void main(String[] args) {
		new Main().run();
	}

}
