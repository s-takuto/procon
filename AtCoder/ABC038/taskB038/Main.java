package taskB038;

import java.util.Scanner;

public class Main {

	void run() {
		Scanner sc = new Scanner(System.in);

		int[] display1 = new int[2];
		int[] display2 = new int[2];

		for (int i = 0; i < 2; i++) {
			display1[i] = sc.nextInt();
		}
		for (int i = 0; i < 2; i++) {
			display2[i] = sc.nextInt();
		}

		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				if (display1[i] == display2[j]) {
					System.out.println("YES");
					return;
				}
			}
		}

		System.out.println("NO");
	}

	public static void main(String[] args) {
		new Main().run();
	}

}
