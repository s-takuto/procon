package pku1230;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;

public class Main {

	void run() {
		Scanner sc = new Scanner(System.in);

		// test case
		int t = sc.nextInt();

		for (int l = 0; l < t; l++) {
			// 壁の個数
			int n = sc.nextInt();

			// energy
			int k = sc.nextInt();

			// 現在、列と交わる壁のリストlist
			ArrayList<Wall> list = new ArrayList<Wall>();
			// 壁のリストwalllist
			ArrayList<Wall> walllist = new ArrayList<Wall>();

			// input
			for (int i = 0; i < n; i++) {
				Wall wall = new Wall();

				// 欲しいのは列の情報だけ.だからb,dは捨てる.
				int a = sc.nextInt();
				int b = sc.nextInt();
				int c = sc.nextInt();
				int d = sc.nextInt();

				// 必ずしも列の情報が小さい順で与えられている訳ではない.
				if (a > c) {
					wall.start = c;
					wall.end = a;
				} else {
					wall.start = a;
					wall.end = c;
				}
				walllist.add(wall);
			}

			// startで降順
			Collections.sort(walllist, new WallComparatorDS());

			// endで比較
			Wall tmp = Collections.max(walllist, new WallComparatorDE());
			// 列の最後　=　すべての壁のendの最大値
			int rowlength = tmp.end;

			// 処理
			int count = 0;
			for (int i = 0; i < rowlength; i++) {

				if (!list.isEmpty()) {
					// list内からi-1番目で終わる壁の消去
					Iterator<Wall> itr = list.iterator();
					while (itr.hasNext()) {
						Wall w = itr.next();
						if (w.end == i - 1) {
							itr.remove();
						}
					}
				}

				// 列iで始まる壁をlistに追加
				Iterator<Wall> itr1 = walllist.iterator();
				while (itr1.hasNext()) {
					Wall w = itr1.next();
					if (w.start == i) {
						list.add(w);
					}
				}

				// listの長さがkを超えるとき、listの長さ - kの個数の壁を、終わりの列の番号が大きい順にlistから削除する。
				// ここで、除いた壁の個数はカウントに加える。
				if (list.size() > k) {
					// listを終わりの列が大きい順にソート
					Collections.sort(list, new WallComparatorAE());

					int s = list.size() - k;
					Iterator<Wall> itr = list.iterator();

					while (s != 0) {
						Wall w = itr.next();
						itr.remove();
						walllist.remove(w);
						s--;
						count++;
					}
				}
			}

			System.out.println(count);
		}
	}

	// 壁のx座標の値のクラス
	class Wall {
		int start;
		int end;
	}

	// Wallクラスのstartの値で降順に並び替えるためのクラス
	class WallComparatorDS implements Comparator<Wall> {

		public int compare(Wall w1, Wall w2) {
			return w1.start - w2.start;
		}
	}

	// Wallクラスのendの値で降順に並び替えるためのクラス
	class WallComparatorDE implements Comparator<Wall> {

		public int compare(Wall w1, Wall w2) {
			return w1.end - w2.end;
		}
	}

	// Wallクラスのendの値で降順に並び替えるためのクラス
	class WallComparatorAE implements Comparator<Wall> {

		public int compare(Wall w1, Wall w2) {
			return -(w1.end - w2.end);
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}

}
