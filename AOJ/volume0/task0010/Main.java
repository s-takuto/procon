package task0010;

import java.util.Scanner;

public class Main {

	// 解くだけゲー
	// printfの%.3fは小数第4位を四捨五入してくれる！
	void run() {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			double x1 = sc.nextDouble();
			double y1 = sc.nextDouble();
			double x2 = sc.nextDouble();
			double y2 = sc.nextDouble();
			double x3 = sc.nextDouble();
			double y3 = sc.nextDouble();

			//連立3元１次方程式
			double a = (x1 * x1) - (x2 * x2);
			double b = 2 * (x2 - x1);
			double c = (y1 * y1) - (y2 * y2);
			double d = 2 * (y2 - y1);

			double e = (x1 * x1) - (x3 * x3);
			double f = 2 * (x3 - x1);
			double g = (y1 * y1) - (y3 * y3);
			double h = 2 * (y3 - y1);

			// 円の中心座標cx,cy
			double cx = (d * (g + e) - h * (a + c)) / (b * h - (d * f));
			double cy = (b * (g + e) - f * (a + c)) / (d * f - (b * h));

			// 円の半径r
			double r = Math.sqrt(((x1 - cx) * (x1 - cx)) + ((y1 - cy) * (y1 - cy)));

			// cx = roundOff(cx);
			// cy = roundOff(cy);
			// r = roundOff(r);

			System.out.printf("%.3f %.3f %.3f\n", cx, cy, r);

		}

		sc.close();

	}

	// double roundOff(double a) {
	//
	// double b = a * 10000;
	//
	// double c = b % 10;
	//
	// if (c == 0) {
	// return a;
	// }
	//
	// // 四捨五入
	// if (c >= 5) {
	// b += 10 - c;
	// } else {
	// b -= c;
	// }
	//
	// return (double) b / 10000;
	// }

	public static void main(String[] args) {
		new Main().run();
	}

}
