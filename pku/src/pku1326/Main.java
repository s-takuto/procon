package pku1326;

import java.util.Scanner;

public class Main {

	void run() {
		Scanner sc = new Scanner(System.in);

		while (!sc.hasNext("#")) {
			int sum = 0;
			while (true) {
				String gab = sc.next();
				if (gab.equals("0")) {
					break;
				}
				gab = sc.next();
				int mile = sc.nextInt();
				String c = sc.next();

				if (c.equals("F")) {
					sum += (mile + mile);
				} else if (c.equals("B")) {
					sum += mile;
					if (mile % 2 == 1) {
						sum += (mile / 2 + 1);
					} else {
						sum += (mile / 2);
					}
				} else {
					if (mile <= 500) {
						sum += 500;
					} else {
						sum += mile;
					}
				}
			}
			System.out.println(sum);
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}

}
