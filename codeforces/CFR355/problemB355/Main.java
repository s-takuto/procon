package problemB355;

import java.util.Scanner;

public class Main {

	void run() {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int h = sc.nextInt();
		int k = sc.nextInt();

		int[] p = new int[n + 1];

		int time = 0;

		for (int i = 0; i < n; i++) {
			p[i] = sc.nextInt();
		}
		p[n] = 0;

		int i = 0;
		int hh = h;

		while (true) {
			if (i == n) {
				if (h == hh) {
					break;
				}
				if (h + k > hh) {
					h = hh;
					time += 1;
					break;
				} else {
					h += k;
				}
				time += 1;
				break;
			}

			while (h - p[i] >= 0 && p[i] != 0) {
				h = h - p[i];
				i++;
			}
			if (h < 0) {
				h += p[i];
				i--;
			}
			if (h + k > hh) {
				h = hh;
				time += 1;
				continue;
			} else {
				h += k;
			}
			time += 1;
		}

		System.out.println(time);

	}

	public static void main(String[] args) {
		new Main().run();

	}

}
