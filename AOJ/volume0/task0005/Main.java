package task0005;

import java.util.Scanner;

public class Main {

	// 入力が20億まで⇒int型でも大丈夫
	// しかし、計算すると20億超える⇒long型
	public void run() {
		Scanner sc = new Scanner(System.in);

		while (sc.hasNext()) {
			long a = sc.nextInt();
			long b = sc.nextInt();

			long c = gcd(a, b);

			// 最小公倍数
			long d = a * b / c;

			System.out.println(c + " " + d);
		}
		sc.close();
	}

	// 最大公約数
	// ユークリッドの互除法
	public long gcd(long a, long b) {
		if (b == 0) {
			return a;
		}
		else {
			return gcd(b, a % b);
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}

}
