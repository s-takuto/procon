package problemA362;

import java.util.Scanner;

public class Main {

	void run() {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int s = sc.nextInt();
		int x = sc.nextInt();

		int sum = t;
		boolean f = false;
		while (sum <= x) {
			if (sum == x) {
				f = true;
				break;
			}
			sum += s;
			if (sum == x) {
				f = true;
				break;
			} else if (sum + 1 == x) {
				f = true;
				break;
			}
		}

		if (f) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}

}
