package taskB019;

import java.util.Scanner;

public class Main {

	void run() {
		Scanner sc = new Scanner(System.in);

		char[] s = sc.next().toCharArray();

		int count = 1;
		for (int i = 0; i < s.length;) {
			char a = s[i];

			int j = i + 1;
			while (j < s.length && s[j] == a) {
				count++;
				j++;
			}
			System.out.print(Character.toString(a) + count);
			count = 1;
			i = j;
		}
		System.out.println();

		sc.close();

	}

	public static void main(String[] args) {
		new Main().run();
	}

}
