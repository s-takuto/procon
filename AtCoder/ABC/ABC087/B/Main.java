package B;

import java.util.Scanner;

public class Main {
	public void run() {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int x = sc.nextInt();

		int count = 0;
		for(int i = 0; i <= a; i++) {
			if(x < 500 * i) {
				continue;
			}
			for(int j = 0; j <= b; j++) {
				int remain = x - (500 * i + 100 * j);
				if(remain < 0) {
					continue;
				}
				if(remain / 50 <= c) {
					count++;
				}
			}
		}

		System.out.println(count);
	}

	public static void main(String[] args) {
		new Main().run();
	}
}
