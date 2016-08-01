package problemA355;

import java.util.Scanner;

public class Main {

	void run() {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int h = sc.nextInt();

		int[] p = new int[n];

		for (int i = 0; i < n; i++) {
			p[i] = sc.nextInt();
		}

		int sum = 0;
		for (int i = 0; i < n; i++) {
			if (p[i] > h) {
				sum += 2;
			} else {
				sum += 1;
			}
		}

		System.out.println(sum);

	}

	public static void main(String[] args) {
		new Main().run();
	}

}
