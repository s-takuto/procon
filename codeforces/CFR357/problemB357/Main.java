package problemB357;

import java.util.Scanner;

public class Main {

	private int house = 1_234_567;
	private int cars = 123_456;
	private int computers = 1_234;

	int n;

	void run() {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();

		int amax = n / house;
		int bmax = n / cars;
		int cmax = n / computers;
		boolean f = false;

		for (int i = amax; i >= 0; i--) {
			int tmp = n - (house * i);
			for (int j = tmp / cars; j >= 0; j--) {
				int tmp2 = n - (house * i) - (cars * j);
				int k = tmp2 / computers;
				int sum = ((house * i) + (cars * j)) + (computers * k);
				if (sum == n) {
					f = true;
					break;
				}
			}
			if (f) {
				break;
			}
		}

		if (f) {
			System.out.println("YES");
		} else
			System.out.println("NO");

	}

	public static void main(String[] args) {
		new Main().run();
	}

}
