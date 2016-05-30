package task0011;

import java.util.Scanner;


//あみだくじ⇒配列のスワップ
public class Main {

	int[] a;
	int[] x;
	int[] y;

	public void run() {
		Scanner sc = new Scanner(System.in);

		int w = sc.nextInt();
		int n = sc.nextInt();

		a = new int[w + 1];
		for (int i = 1; i <= w; i++) {
			a[i] = i;
		}

		x = new int[n];
		y = new int[n];

		String[] str = new String[2];

		for (int i = 0; i < n; i++) {
			str = sc.next().split(",");
			x[i] = Integer.parseInt(str[0]);
			y[i] = Integer.parseInt(str[1]);
		}

		for (int i = 0; i < n; i++) {
			int tmp = a[x[i]];
			a[x[i]] = a[y[i]];
			a[y[i]] = tmp;
		}

		for (int i = 1; i <= w; i++) {
			System.out.println(a[i]);
		}

		sc.close();
	}

	public static void main(String[] args) {
		new Main().run();
	}

}
