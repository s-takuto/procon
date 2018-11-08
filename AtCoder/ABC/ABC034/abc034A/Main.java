package abc034A;

import java.util.Scanner;

public class Main {

	void run() {
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int y = sc.nextInt();

		if (x > y) {
			System.out.println("Worse");
		} else {
			System.out.println("Better");
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}

}
