package taskC019;

import java.util.HashSet;
import java.util.Scanner;

//
public class Main_1 {

	void run() {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] a = new int[n];

		HashSet<Integer> hs = new HashSet<Integer>();

		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
			// 奇数になるまで割り続ける
			while (a[i] % 2 == 0) {
				a[i] /= 2;
			}
			// 値の重複を許さないデータ構造に入れて管理する
			hs.add(a[i]);
		}

		System.out.println(hs.size());

		sc.close();
	}

	public static void main(String[] args) {
		new Main_1().run();
	}

}
