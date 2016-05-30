package task1165$;

import java.util.Scanner;

// 座標で表す
//x[i]、y[i]：i番目の正方形のx座標とy座標

public class Main {

	int[] x;
	int[] y;

	int[] dx = { -1, 0, 1, 0 };
	int[] dy = { 0, -1, 0, 1 };

	void run() {
		Scanner sc = new Scanner(System.in);

		while (true) {
			int N = sc.nextInt();

			if (N == 0) {
				break;
			}

			int max_x = 0, min_x = 0;
			int max_y = 0, min_y = 0;

			x = new int[N];
			y = new int[N];

			x[0] = y[0] = 0;
			for (int i = 1; i < N; i++) {
				int n = sc.nextInt();
				int d = sc.nextInt();

				x[i] = x[n] + dx[d];
				y[i] = y[n] + dy[d];

				if (max_x < x[i]) {
					max_x = x[i];
				}
				if (min_x > x[i]) {
					min_x = x[i];
				}
				if (max_y < y[i]) {
					max_y = y[i];
				}
				if (min_y > y[i]) {
					min_y = y[i];
				}
			}

			int w = max_x - min_x + 1;
			int h = max_y - min_y + 1;

			System.out.println(w + " " + h);

		}
	}

	public static void main(String[] args) {
		new Main().run();
	}

}
