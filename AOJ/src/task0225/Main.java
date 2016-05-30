package task0225;

import java.util.Arrays;
import java.util.Scanner;

//ポイント
//しりとり⇒有効グラフとみなせる
//一周する⇒各アルファベットの入次数と出次数が等しくなる
//          使用したアルファベットを全て探索できる

public class Main {

	// アルファベットの個数
	int MAX = 'Z' - 'A' + 1;

	// 入力
	char[][] s;

	// 隣接行列 アルファベットの数
	int[][] nei;

	// 入次数、出次数
	int[] indeg, outdeg;

	// あるアルファベットを訪れたかどうか
	// 訪れたら１、使用していない０、訪れていない-1
	int[] visit;

	boolean check() {
		// 入力されたアルファベットを全て通ったかどうか
		for (int i = 0; i < MAX; i++) {
			if (visit[i] == -1) {
				return false;
			}
		}

		// 入次数 == 出次数 : 返って来れる
		// 入次数 != 出次数 : ダメ
		for (int i = 0; i < MAX; i++) {
			if (indeg[i] != outdeg[i]) {
				return false;
			}
		}

		return true;
	}

	// 深さ優先探索
	void dfs(int k) {
		if (visit[k] == 1)
			return;

		visit[k] = 1;

		for (int i = 0; i < MAX; i++) {
			if (nei[k][i] == 1) {
				dfs(i);
			}
		}
	}

	void run() {
		Scanner sc = new Scanner(System.in);

		while (true) {
			int n = sc.nextInt();

			if (n == 0) {
				break;
			}

			int a = 0;
			s = new char[n][MAX];
			nei = new int[MAX][MAX];
			indeg = new int[MAX];
			outdeg = new int[MAX];
			visit = new int[MAX];

			Arrays.fill(visit, 0);

			// nextメソッドは空白まで
			for (int i = 0; i < n; i++) {
				s[i] = sc.next().toCharArray();

				// 入力された文字の最初と最後
				int u = s[i][0] - 'a';
				int v = s[i][s[i].length - 1] - 'a';

				// 入次数と出次数を計算
				indeg[v]++;
				outdeg[u]++;

				// アルファベット間に有効辺を引く
				nei[u][v] = 1;

				// 使用するアルファベット
				visit[u] = visit[v] = -1;

				a = u;
			}

			// しりとりをする
			dfs(a);

			if (check()) {
				System.out.println("OK");
			} else {
				System.out.println("NG");
			}
		}

		sc.close();

	}

	public static void main(String[] args) {
		new Main().run();
	}

}
