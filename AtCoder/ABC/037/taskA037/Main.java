package taskA037;

import java.util.Scanner;

public class Main {

	int white;
	int green;
	int money;
	int best;

	void run() {
		Scanner sc = new Scanner(System.in);

		white = sc.nextInt();
		green = sc.nextInt();
		money = sc.nextInt();

		best = 0;

		// search(0, 0);
		//
		// System.out.println(best);

		greedy();
	}

	void search(int i, int j) {
		System.out.println(i + " " + j);
		int sum = white * i + green * j;
		if (money < sum) {
			return;
		}

		search(i + 1, j);
		int tmp = i + j;
		if (best < tmp) {
			best = tmp;
		}

		search(i, j + 1);
		tmp = i + j;
		if (best < tmp) {
			best = tmp;
		}

	}

	void greedy() {

		if (white < green) {
			int wn = money / white;
			int tmp = money - white * wn;
			int gn = tmp / green;
			System.out.println(wn + gn);
		}
		else {
			int gn = money / green;
			int tmp = money - green * gn;
			int wn = tmp / white;
			System.out.println(wn + gn);
		}

	}

	public static void main(String[] args) {
		new Main().run();
	}

}
