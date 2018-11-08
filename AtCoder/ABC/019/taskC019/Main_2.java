package taskC019;

import java.util.Arrays;
import java.util.Scanner;

//
public class Main_2 {

	void run() {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] a = new int[n];

		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
			// 奇数になるまで割り続ける
			while (a[i] % 2 == 0) {
				a[i] /= 2;
			}
		}

		Arrays.sort(a);
		int ans = 0;
		int pre = -1;

		for (int item : a) {
			if(item == pre) {
				continue;
			}
			ans++;
			pre = item;
		}
		System.out.println(ans);

		sc.close();
	}

	public static void main(String[] args) {
		new Main_2().run();
	}

}
