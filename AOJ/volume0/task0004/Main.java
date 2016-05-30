package task0004;

import java.util.Scanner;

public class Main {

	void run() {
		Scanner sc = new Scanner(System.in);

		while (sc.hasNext()) {
			double a = sc.nextInt();
			double b = sc.nextInt();
			double c = sc.nextInt();
			double d = sc.nextInt();
			double e = sc.nextInt();
			double f = sc.nextInt();

			// 連立方程式の解
			double x = (b * f - c * e) / (b * d - a * e);
			double y = (c * d - a * f) / (b * d - a * e);

			if (x == 0)
				x = 0;
			if (y == 0)
				y = 0;
			
			System.out.printf("%.3f %.3f\n", x, y);

			// BigDecimal ax = new BigDecimal(x);
			// BigDecimal ay = new BigDecimal(y);
			//
			// // 小数第4位を四捨五入
			// ax = ax.setScale(3, BigDecimal.ROUND_HALF_UP);
			// ay = ay.setScale(3, BigDecimal.ROUND_HALF_UP);
			//
			// System.out.println(ax + " " + ay);
		}

		sc.close();
	}

	// 行列式を使った連立方程式
	void run1() {
		Scanner sc = new Scanner(System.in);

		double[] a = new double[6];

		while (sc.hasNext()) {
			for (int i = 0; i < 6; i++) {
				a[i] = sc.nextDouble();
			}

			double d = a[0] * a[4] - a[1] * a[3];
			double x = (a[4] * a[2] - a[1] * a[5]) / d;
			double y = (a[0] * a[5] - a[3] * a[2]) / d;

			if (x == 0)
				x = 0;
			if (y == 0)
				y = 0;

			System.out.printf("%.3f %.3f\n", x, y);
		}

		sc.close();
	}

	public static void main(String[] args) {
		new Main().run1();
	}

}
