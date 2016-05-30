package task0002;

import java.util.Scanner;

public class Task0002 {

	private static int N = 200;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int cnt = 0;

		while (sc.hasNextInt()) {
			cnt++;
			if (cnt > 200)
				break;

			int a = sc.nextInt();
			int b = sc.nextInt();

			int sum = a + b;
			int count = 1;

			while ((sum /= 10) != 0) {
				count++;
			}

			System.out.println(count);

		}
	}

}
