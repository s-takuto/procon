package agc003A;

import java.util.Scanner;

public class Main {

	void run() {
		Scanner sc = new Scanner(System.in);

		char[] c = sc.next().toCharArray();
		int n = c.length;

		boolean N = false;
		boolean W = false;
		boolean E = false;
		boolean S = false;

		for (int i = 0; i < n; i++) {
			if (c[i] == 'N') {
				N = true;
			} else if (c[i] == 'W') {
				W = true;
			} else if (c[i] == 'E') {
				E = true;
			} else {
				S = true;
			}
		}

		if (N && S) {
			if (W && E) {
				System.out.println("Yes");
			} else if (!W && !E) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		} else if (!N && !S) {
			if (W && E) {
				System.out.println("Yes");
			} else if (!W && !E) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		} else {
			System.out.println("No");
		}

	}

	public static void main(String[] args) {
		new Main().run();
	}

}
