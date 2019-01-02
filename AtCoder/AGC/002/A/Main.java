package agc002A;

import java.util.Scanner;

public class Main {

	void run() {
		Scanner sc = new Scanner(System.in);

		long a = sc.nextLong();
		long b = sc.nextLong();

		if (a > 0 && b > 0) {
			System.out.println("Positive");
		} else if (a <= 0 && b >= 0) {
			System.out.println("Zero");
		} else {
			long def = b - a + 1;
			if (def % 2 == 0) {
				System.out.println("Positive");
			} else {
				System.out.println("Negative");
			}
		}

	}

	public static void main(String[] args) {
		new Main().run();
	}

}
