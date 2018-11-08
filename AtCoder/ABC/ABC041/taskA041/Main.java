package taskA041;

import java.util.Scanner;

public class Main {

	void run() {
		Scanner sc = new Scanner(System.in);

		char[] c = sc.next().toCharArray();
		int i = sc.nextInt();

		System.out.println(c[i - 1]);

	}

	public static void main(String[] args) {
		new Main().run();
	}

}
