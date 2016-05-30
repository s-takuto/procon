package task0008;

import java.util.Scanner;

public class Main {

	void run() {
		Scanner sc = new Scanner(System.in);

		while (sc.hasNext()) {
			int n = sc.nextInt();

			int count = 0;

			for (int i = 0; i < 10; i++) {
				for (int j = 0; j < 10; j++) {
					for (int k = 0; k < 10; k++) {
						for (int l = 0; l < 10; l++) {
							if (n == i + j + k + l) {
								count++;
							}
						}
					}
				}
			}

			System.out.println(count);
		}
		sc.close();
	}

	public static void main(String[] args) {
		new Main().run();
	}

}
