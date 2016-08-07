package cfr364C;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

//尺取り法or二分探索
public class Main {

	void run() {
		Scanner sc = new Scanner(System.in);

		// 文字列の長さ
		int n = sc.nextInt();
		char[] c = sc.next().toCharArray();

		// 各アルファベットの登場回数
		Map<Character, Integer> map = new HashMap<>();

		// アルファベットが最大で何種類存在するか
		Set<Character> alphabet = new HashSet<>();
		for (int i = 0; i < n; i++) {
			alphabet.add(c[i]);
			map.put(c[i], 0);
		}
		int num = alphabet.size();

		int s = 0;
		int t = 0;
		// ある状態の文字の種類
		int count = 0;
		int min = Integer.MAX_VALUE;

		// 条件を満たさなければ右端を進めて区間を広げる。
		// 条件を満たしていれば左端を進めて区間を狭める。
		// 条件：全てのアルファベットが1回は登場したかどうか
		while (s <= t) {
			while (count < num && t < n) {
				int value = map.get(c[t]);
				if (value != 0) {
					int tmp = map.get(c[t]);
					map.put(c[t], tmp + 1);
				} else {
					map.put(c[t], 1);
					// 新しい種類が増えたから増やす
					count++;
				}
				t++;
			}
			if (count < num) {
				break;
			}
			min = Math.min(t - s, min);
			int tmp = map.get(c[s]);
			map.put(c[s], tmp - 1);
			if (tmp - 1 == 0) {
				count--;
			}
			s++;
		}

		System.out.println(min);
	}

	public static void main(String[] args) {
		new Main().run();
	}

}
