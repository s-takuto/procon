package taskC038;

import java.util.Scanner;

public class Main1 {

	void run() {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] seq = new int[n];

		for (int i = 0; i < n; i++) {
			seq[i] = sc.nextInt();
		}

		int count = 0;
		for (int i = 0; i < n; i++) {
			for (int j = i; j < n; j++) {
				for (int k = i; k <= j; k++) {
					if (k == j) {
						count++;
						break;
					}
					if (seq[k] >= seq[k + 1]) {
						break;
					}
					else {
						continue;
					}
				}
			}
		}

		System.out.println(count);

	}

	public static void main(String[] args) {
		new Main1().run();
	}

}
