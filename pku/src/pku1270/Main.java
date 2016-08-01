package pku1270;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

	// 文字のクラス
	// id:usedと対応するため
	// s:文字の種類
	// neighbors:sよりも前に存在しなければいけない文字
	public class Letter {
		int id;
		String s;
		List<String> neighbors;

		public Letter(String s, int id) {
			this.id = id;
			this.s = s;
			neighbors = new ArrayList<String>();
		}

	}

	// 文字の個数
	int n;
	// どの文字を使ったか(添え字に依存)
	boolean[] used;
	// 答え
	String[] ans;

	// 入力文字列
	// アルファベット順で使うことを想定
	Letter[] letter;

	// 条件付き順列生成のバックトラック
	void search(int k) {
		if (k == n) {
			for (int i = 0; i < n; i++) {
				System.out.print(ans[i]);
			}
			System.out.println();
			return;
		}

		for (int i = 0; i < n; i++) {
			// letter[i]が現在構築された列に現れない
			if (!used[i]) {
				// 制約条件の判定
				boolean f = true;
				used[i] = true;
				for (String str : letter[i].neighbors) {
					// ある文字が制約に関係する条件だけ摘出
					for (Letter let : letter) {
						if (let.s.equals(str)) {
							if (!used[let.id]) {
								f = false;
								break;
							}
						}
					}
					if (!f) {
						break;
					}
				}
				// 制約を満たすならば再帰
				if (f) {
					ans[k] = letter[i].s;
					search(k + 1);
				}
				used[i] = false;
			}
		}
	}

	void run() throws IOException {
		Scanner sc = new Scanner(System.in);

		while (true) {
			String str = sc.nextLine();
			// EOF検出
			if (str.equals("")) {
				break;
			}

			String[] s = str.split(" ");
			Arrays.sort(s);
			n = s.length;
			letter = new Letter[n];
			for (int i = 0; i < n; i++) {
				letter[i] = new Letter(s[i], i);
			}

			str = sc.nextLine();
			s = str.split(" ");
			for (int i = 0; i < s.length; i += 2) {
				int j = i + 1;
				for (Letter let : letter) {
					if (let.s.equals(s[j])) {
						let.neighbors.add(s[i]);
						break;
					}
				}
			}

			ans = new String[n];
			used = new boolean[n];
			Arrays.fill(used, false);
			search(0);
			System.out.println();
		}
	}

	public static void main(String[] args) throws IOException {
		new Main().run();
	}

}
