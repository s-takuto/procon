package abc042C;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	void run() {
		Scanner sc = new Scanner(System.in);

		int price = sc.nextInt();
		int k = sc.nextInt();

		boolean[] use = new boolean[11];
		Arrays.fill(use, true);

		for (int i = 0; i < k; i++) {
			use[sc.nextInt()] = false;
		}

		for (int i = price; i <= price * 10; i++) {
			boolean f = true;
			int p = i;
			while (p > 0) {
				if (!use[p % 10]) {
					f = false;
					break;
				}
				p /= 10;
			}
			if (f) {
				System.out.println(i);
				return;
			}
		}

	}

	public static void main(String[] args) {
		new Main().run();
	}

}
