package abc035C;

import java.util.BitSet;
import java.util.Scanner;

//一部TLE
public class Main1 {

	void run() {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int q = sc.nextInt();

		BitSet bit = new BitSet(n);

		for (int i = 0; i < q; i++) {
			int l = sc.nextInt() - 1;
			int r = sc.nextInt();
			bit.flip(l, r);
		}

		String s = new String();
		for (int i = 0; i < n; i++) {
			if (bit.get(i)) {
				s += 1;
			} else {
				s += 0;
			}
		}
		System.out.println(s);

	}

	public static void main(String[] args) {
		new Main1().run();
	}

}
