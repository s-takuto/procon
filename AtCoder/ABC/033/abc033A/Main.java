package abc033A;

import java.util.Scanner;

public class Main {

	void run() {
		Scanner sc = new Scanner(System.in);

		char[] c = sc.next().toCharArray();

		char letter = c[0];
		int count = 0;
		for (int i = 1; i < c.length; i++) {
			if (letter == c[i]) {
				count++;
			}
		}

		if (count == 3) {
			System.out.println("SAME");
		} else {
			System.out.println("DIFFERENT");
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}

}
