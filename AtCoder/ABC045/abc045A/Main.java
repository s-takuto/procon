package abc045A;

import java.util.Scanner;

import javax.naming.InitialContext;

public class Main {

	void run() {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int h = sc.nextInt();

		System.out.println((a + b) * h / 2);

	}

	public static void main(String[] args) {
		new Main().run();
	}

}
