package abc034B;

import java.util.Scanner;

public class Main {

	void run() {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		if (n % 2 == 0) {
			System.out.println(n - 1);
		} else {
			System.out.println(n + 1);
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}

}
