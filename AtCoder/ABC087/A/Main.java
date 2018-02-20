package A;

import java.util.Scanner;

public class Main {
	public void run() {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();

		System.out.println((x - a) % b);
	}

	public static void main(String[] args) {
		new Main().run();
	}
}
