package taskC019;

import java.util.Scanner;

//20点分のみクリア
//→実行時間O（n^2）だから
public class Main {

	void run() {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] a = new int[n];

		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
			while (a[i] % 2 == 0) {
				a[i] /= 2;
			}
		}

		for (int i = 0; i < a.length; i++) {
			int x = a[i];
			for (int j = i + 1; j < a.length; j++) {
				if (x == a[j]) {
					a[j] = 0;
				}
			}
		}

		int count = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] > 0) {
				count++;
			}
		}

		System.out.println(count);
		sc.close();
	}

	public static void main(String[] args) {
		new Main().run();
	}

}
