package problemA351;

import java.util.Scanner;

public class Main {

	private int game = 90;

	void run() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] t = new int[game + 1];

		for (int i = 0; i < n; i++) {
			int tmp = sc.nextInt();
			t[tmp] = 1;
		}

		int count = 15;

		for (int i = 1; i <= game; i++) {
			count--;
			if (count < 0) {
				System.out.println(i - 1);
				break;
			}
			if (t[i] == 1) {
				count = 15;
			}
			if (i == game) {
				System.out.println(90);
			}
		}

	}

	public static void main(String[] args) {
		new Main().run();
	}

}
