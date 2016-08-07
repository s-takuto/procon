package abc036A;

import java.util.Scanner;

public class Main {

	void run() {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();

		if (b % a == 0) {
			System.out.println(b / a);
		}
		else {
			System.out.println(b / a + 1);
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		new Main().run();
	}

}
