package task0003;

import java.util.Scanner;

public class Main {

	void run() {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		int a, b, c;

		for (int i = 0; i < N; i++) {
			a = sc.nextInt();
			b = sc.nextInt();
			c = sc.nextInt();

			a = a * a;
			b = b * b;
			c = c * c;

			if (a + b == c) {
				System.out.println("YES");
			} else if (b + c == a) {
				System.out.println("YES");
			} else if (a + c == b) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}

	}

	public static void main(String[] args) {
		new Main().run();
	}
}
