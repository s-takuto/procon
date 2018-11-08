package taskB019;

import java.util.Scanner;

public class Main_1 {

	void run() {
		Scanner sc = new Scanner(System.in);
		char[] s = sc.next().toCharArray();

		int count = 0;
		char pre = ' ';
		String ans = "";

		for (char c : s) {
			// 文字数のカウント
			if (c == pre) {
				count++;
			}
			else {
				// 別の文字が来たら答えの文字列に追加
				if (count != 0) {
					ans += pre;
					ans += count;
				}
				pre = c;
				count = 1;
			}
		}

		// 最後の文字列は表示されずにループが終わるので
		if (count != 0) {
			ans += pre;
			ans += count;
		}

		System.out.println(ans);

		sc.close();

	}

	public static void main(String[] args) {
		new Main().run();
	}

}
