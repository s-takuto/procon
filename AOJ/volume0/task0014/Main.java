package task0014;

import java.util.Scanner;

public class Main {

	int SIZE = 600;

	void run() {
		Scanner sc = new Scanner(System.in);

		while (sc.hasNext()) {
			int d = sc.nextInt();

			int ans = 0;

			for (int i = d; i < SIZE; i += d) {
				ans += i * i * d;
			}

			System.out.println(ans);
		}
		sc.close();
	}

	public static void main(String[] args) {
		new Main().run();
	}

}
