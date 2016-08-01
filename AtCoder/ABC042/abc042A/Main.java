package abc042A;

import java.util.Scanner;

public class Main {

	public int n = 3;

	void run() {
		Scanner sc = new Scanner(System.in);

		int[] in = new int[n];

		for (int i = 0; i < n; i++) {
			in[i] = sc.nextInt();
		}

		int cnt5 = 0;
		int cnt7 = 0;

		for (int i = 0; i < n; i++) {
			if (in[i] == 5) {
				cnt5++;
			} else if (in[i] == 7) {
				cnt7++;
			}
		}

		if (cnt5 == 2 && cnt7 == 1) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}

	}

	public static void main(String[] args) {
		new Main().run();
	}

}
