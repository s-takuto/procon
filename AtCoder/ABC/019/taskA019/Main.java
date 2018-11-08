package taskA019;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	void run() {
		Scanner sc = new Scanner(System.in);

		int[] ans = new int[3];

		for (int i = 0; i < 3; i++) {
			ans[i] = sc.nextInt();
		}

		Arrays.sort(ans);

		System.out.println(ans[1]);

		sc.close();

	}

	public static void main(String[] args) {
		new Main().run();
	}

}
