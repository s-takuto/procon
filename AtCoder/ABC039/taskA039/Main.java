package taskA039;

import java.util.Scanner;

public class Main {

	void run() {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		System.out.println((a * b * 2) + (a * c * 2) + (b * c * 2));

	}

	public static void main(String[] args) {
		new Main().run();
	}

}
