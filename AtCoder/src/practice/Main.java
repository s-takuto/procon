package practice;

import java.util.Scanner;

public class Main {

	void run() {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		String s = sc.next();

		System.out.print(a + b + c);
		System.out.print(" ");
		System.out.println(s);

		sc.close();
	}

	public static void main(String[] args) {
		new Main().run();
	}

}
