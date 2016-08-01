package pku1236;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	// 頂点数
	int n;

	// 頂点
	Vertex[] v;

	// reachable[u][v]:uからvへの有向パスがある
	boolean[][] reachable;

	// hasEdge[i][j]:強連結成分i番からj番に辺が存在している
	boolean[][] hasEdge;

	// Vertexクラス
	// id：頂点番号(0~n-1)、neighbor：隣接頂点、nsc:強連結成分の番号(1~)
	class Vertex {
		int id;
		ArrayList<Integer> neighbor;
		int nsc; // 初期値は0

		// コンストラクタ
		public Vertex(int i) {
			this.id = i;
			neighbor = new ArrayList<Integer>();
		}
	}

	// 深さ優先探索
	// 始点sから辿り着くことができる頂点を調べるメソッド
	void search(Vertex s, Vertex u) {
		// 訪れていたらreturn
		if (reachable[s.id][u.id]) {
			return;
		}
		reachable[s.id][u.id] = true;

		for (Integer i : u.neighbor) {
			search(s, v[i]);
		}
	}

	// 各強連結成分に番号を付ける&各強連結成分へのパスを調べる
	// 強連結成分の番号は1番から
	void StronglyConnectedComponentsDecomposition() {
		int count = 0;
		for (int i = 0; i < n; i++) {
			if (v[i].nsc == 0) {
				count++;
				v[i].nsc = count;
				for (int j = i + 1; j < n; j++) {
					if (reachable[i][j] && reachable[j][i]) {
						v[j].nsc = count;
					}
				}
			}
		}

		// 強連結成分の番号は1番からだから、配列の大きさは余分に1大きくとる
		hasEdge = new boolean[count + 1][count + 1];

		// 各強連結成分間に辺があるかどうかチェック
		for (int i = 0; i < n; i++) {
			for (Integer j : v[i].neighbor) {
				if (v[i].nsc != v[j].nsc) {
					hasEdge[v[i].nsc][v[j].nsc] = true;
				}
			}
		}
	}

	// 強連結成分i番が根であるかどうか判別するメソッド
	// 強連結成分i番の入次数が0
	boolean isroot(int i) {
		for (int j = 0; j < hasEdge[i].length; j++) {
			if (hasEdge[j][i]) {
				return false;
			}
		}
		return true;
	}

	// 強連結成分i番が葉であるかどうか判別するメソッド
	// 強連結成分i番の出次数が0
	boolean isleaf(int i) {
		for (int j = 0; j < hasEdge[i].length; j++) {
			if (hasEdge[i][j]) {
				return false;
			}
		}
		return true;
	}

	void run() {
		Scanner sc = new Scanner(System.in);

		// input
		n = sc.nextInt();
		v = new Vertex[n];
		for (int i = 0; i < n; i++) {
			v[i] = new Vertex(i);
			int u = sc.nextInt();
			// 入力に0が来るまで
			while (u != 0) {
				v[i].neighbor.add(u - 1);
				u = sc.nextInt();
			}
		}
		reachable = new boolean[n][n];

		// 各頂点毎に
		for (int i = 0; i < n; i++) {
			search(v[i], v[i]);
		}

		// 強連結成分分解を行う
		StronglyConnectedComponentsDecomposition();

		// taskA
		int rootnumber = 0;
		int leafnumber = 0;

		// 各強連結成分が根or葉であるかどうかを調べる
		for (int i = 1; i < hasEdge.length; i++) {
			if (isroot(i)) {
				rootnumber++;
			}
			if (isleaf(i)) {
				leafnumber++;
			}
		}
		System.out.println(rootnumber);
		// System.out.println(leafnumber);

		// コーナーケース:入力が一つの強連結成分の時
		boolean f = false;
		for (int i = 0; i < n; i++) {
			if (v[i].nsc != 1) {
				f = true;
			}
		}
		if (f) {
			System.out.println(Math.max(rootnumber, leafnumber));
		} else {
			System.out.println(0);
		}

		// debug
		// for (int i = 0; i < n; i++) {
		// System.out.print(v[i].id);
		// System.out.println(v[i].neighbor);
		// }
		// System.out.println("reachable:");
		// for (int i = 0; i < n; i++) {
		// for (int j = 0; j < n; j++) {
		// System.out.print(reachable[i][j] + " ");
		// }
		// System.out.println();
		// }
		// for (int i = 0; i < n; i++) {
		// System.out.println(v[i].id + " " + v[i].nsc);
		// }
		// System.out.println("hasEdge");
		// for (int i = 0; i < hasEdge.length; i++) {
		// for (int j = 0; j < hasEdge[i].length; j++) {
		// System.out.print(hasEdge[i][j] + " ");
		// }
		// System.out.println();
		// }

	}

	public static void main(String[] args) {
		new Main().run();
	}

}
