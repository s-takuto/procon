package task0006;

import java.util.Scanner;

public class Main {

	public void run() {
		Scanner sc = new Scanner(System.in);

		char[] c = sc.next().toCharArray();

		for (int i = c.length - 1; i >= 0; i--) {
			System.out.print(c[i]);
		}
		System.out.println();

		sc.close();
	}

	public static void main(String[] args) {
		new Main().run();
	}

}
