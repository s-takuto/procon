package task0017;

import java.util.Scanner;

//三角関数の問題
//sin,cosの角度の範囲はいくつでも平気っぽい。
//ただ、0<=θ<360と考えておいた方が安全ではある。
public class Main {

	// 座標
	public class P {
		public double x;
		public double y;

		public P(double x, double y) {
			this.x = x;
			this.y = y;

		}
	}

	void run() {
		Scanner sc = new Scanner(System.in);

		int r, a;
		int angle = 0;

		P p = new P(0, 0);

		while (true) {
			String[] str = sc.next().split(",");
			r = Integer.parseInt(str[0]);
			a = Integer.parseInt(str[1]);

			if (r == 0 && a == 0) {
				break;
			}

			p.x = p.x + r * Math.sin(angle * Math.PI / 180);
			p.y = p.y + r * Math.cos(angle * Math.PI / 180);
			angle += a;
		}

		System.out.println((int) p.x);
		System.out.println((int) p.y);

		sc.close();
	}

	public static void main(String[] args) {
		new Main().run();
	}

}
