package taskA040;

import java.util.Scanner;

public class Main {

	void run() {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int x = sc.nextInt();

		System.out.println(Math.min(n - x, x - 1));
	}

	public static void main(String[] args) {
		new Main().run();
	}

}
