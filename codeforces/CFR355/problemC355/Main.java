package problemC355;

import java.util.Scanner;

public class Main {

	int[] letter;

	void run() {
		Scanner sc = new Scanner(System.in);

		char[] c = sc.next().toCharArray();

		letter = new int[128];

		int count = 0;
		for (int i = '0'; i <= '9'; i++) {
			letter[i] = count++;
		}

		for (int i = 'A'; i <= 'Z'; i++) {
			letter[i] = count++;
		}

		for (int i = 'a'; i <= 'z'; i++) {
			letter[i] = count++;
		}

		letter['-'] = 62;
		letter['_'] = 63;

		count = 0;
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < 7; j++) {
				if ((letter[c[i]] & 1 << j) != 0) {
					count++;
				}
			}
		}

		System.out.println(count);

	}

	public static void main(String[] args) {
		new Main().run();
	}

}
