package abc036c;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

//座標圧縮の問題
//大事なこと：座標を圧縮するための表の作成→HashMapなどで表現する
public class Main {

	void run() {
		Scanner sc = new Scanner(System.in);

		// input
		int n = sc.nextInt();

		int s[] = new int[n];
		int t[] = new int[n];

		for (int i = 0; i < n; i++) {
			int tmp = sc.nextInt();
			s[i] = tmp;
			t[i] = tmp;
		}

		Arrays.sort(t);

		// 座標圧縮するための表の作成
		HashMap<Integer, Integer> map = new HashMap<>();
		int count = 0;

		for (int i = 0; i < n; i++) {
			map.put(t[i], count);
			if (i < n - 1 && t[i] == t[i + 1]) {
				continue;
			}
			count++;
		}

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < n; i++) {
			sb.append(map.get(s[i]));
			sb.append("\n");
		}
		System.out.println(sb);
	}

	public static void main(String[] args) {
		new Main().run();

	}

}
