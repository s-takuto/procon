package task0016;

import java.util.Scanner;

public class Main {

	void run() {
		Scanner sc = new Scanner(System.in);

		int ax = 0;
		int ay = 0;

		while (true) {
			double x = sc.nextInt();
			double a = sc.nextInt();

			if (x == 0 && a == 0) {
				break;
			}

			ax += (int) x;
			ay = (int) (x * Math.tan(a));

		}

		System.out.println(ax);
		System.out.println(ay);
		sc.close();
	}

	public static void main(String[] args) {
		new Main().run();
	}

}
