package abc035B;

import java.util.Scanner;

public class Main {

	char[] c;

	void run() {
		Scanner sc = new Scanner(System.in);

		c = sc.next().toCharArray();
		int t = sc.nextInt();

		int d = 0;
		int x = 0;
		int y = 0;
		int n = 0;

		for (int i = 0; i < c.length; i++) {
			if (c[i] == 'L') {
				x -= 1;
				d = Math.abs(x) + Math.abs(y);
			} else if (c[i] == 'U') {
				y += 1;
				d = Math.abs(x) + Math.abs(y);
			} else if (c[i] == 'R') {
				x += 1;
				d = Math.abs(x) + Math.abs(y);
			} else if (c[i] == 'D') {
				y -= 1;
				d = Math.abs(x) + Math.abs(y);
			} else {
				n++;
			}
		}

		if (t == 1) {
			System.out.println(d + n);
		} else {
			int dif = d - n;
			if (dif < 0) {
				if (Math.abs(dif) % 2 == 0) {
					System.out.println(0);
				}
				else {
					System.out.println(1);
				}
			} else {
				System.out.println(dif);
			}
		}

	}

	public static void main(String[] args) {
		new Main().run();
	}

}
