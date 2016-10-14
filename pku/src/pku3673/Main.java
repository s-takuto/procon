package pku3673;

import java.util.Scanner;

public class Main {

	void run() {
		try (Scanner sc = new Scanner(System.in)) {
			char[] a = sc.next().toCharArray();
			char[] b = sc.next().toCharArray();

			int sum = 0;
			for (int i = 0; i < a.length; i++) {
				for (int j = 0; j < b.length; j++) {
					sum += (a[i] - '0') * (b[j] - '0');
				}
			}

			System.out.println(sum);
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}

}
