package cfr364B;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	void run() {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();

		// ルークが影響を及ぼしている列
		Set<Integer> rset = new HashSet<Integer>();
		// ルークが影響を及ぼしている行
		Set<Integer> cset = new HashSet<Integer>();

		for (int i = 0; i < m; i++) {
			int c = sc.nextInt();
			int r = sc.nextInt();

			rset.add(r);
			cset.add(c);

			long ans = (long) (n - rset.size()) * (n - cset.size());
			System.out.print(ans + " ");
		}
		System.out.println();

	}

	public static void main(String[] args) {
		new Main().run();
	}

}
