package cfr350A;

import java.util.Scanner;

public class Main {

	void run() {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int week = n / 7;
		if (n % 7 == 0) {
			System.out.print(2 * week + " ");
			System.out.println(2 * week);
		} else if (n % 7 == 1) {
			System.out.print(2 * week + " ");
			System.out.println(2 * week + 1);
		} else if (n % 7 == 6) {
			System.out.print(2 * week + 1 + " ");
			System.out.println(2 * week + 2);
		} else {
			System.out.print(2 * week + " ");
			System.out.println(2 * week + 2);
		}

	}

	public static void main(String[] args) {
		new Main().run();
	}

}
