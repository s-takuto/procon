package problemC;

import java.util.Scanner;

//しゃく取り法
//求めたいものは幅の最大値を求めたいので、本来の尺取りとは少し意味は違う。
public class Main {

	void run() {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int k = sc.nextInt();

		char[] c = sc.next().toCharArray();

		int s = 0;
		int t = 0;
		int alen = 0;
		int blen = 0;

		char a = "a".charAt(0);
		char b = "b".charAt(0);

		int count = 0;

		// aの処理
		while (s <= t) {
			if (t == n) {
				break;
			}
			if (c[t] == b && count < k) {
				count++;
			} else if (c[t] == b && count == k) {
				count++;
				int tmp = t - s;
				alen = Math.max(alen, tmp);
				while (count > k) {
					if (c[s] == b) {
						count--;
					}
					s++;
				}
			}
			int tmp = t - s + 1;
			alen = Math.max(alen, tmp);
			// System.out.println("s:" + s + " t:" + t + " tmp:" + tmp +
			// " alen: "
			// + alen);
			t++;
		}

		// bの処理
		s = 0;
		t = 0;
		count = 0;
		while (s <= t) {
			if (t == n) {
				break;
			}
			if (c[t] == a && count < k) {
				count++;
			} else if (c[t] == a && count == k) {
				count++;
				int tmp = t - s;
				blen = Math.max(blen, tmp);
				while (count > k) {
					if (c[s] == a) {
						count--;
					}
					s++;
				}
			}
			int tmp = t - s + 1;
			blen = Math.max(blen, tmp);
			// System.out.println("s:" + s + " t:" + t + " tmp:" + tmp +
			// " alen: "
			// + alen);
			t++;
		}

		System.out.println(Math.max(alen, blen));
	}

	public static void main(String[] args) {
		new Main().run();
	}
}
