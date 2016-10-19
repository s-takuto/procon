package pku3009;

import java.util.Scanner;

public class Main {

	// 左、上、右、下
	int[] dx = { -1, 0, 1, 0 };
	int[] dy = { 0, -1, 0, 1 };

	int w, h;

	int[][] map;

	int t;

	// スタートとゴール地点の座標
	int sx, sy;
	int gx, gy;

	void dfs(int x, int y, int cnt) {
		if (cnt > 10) {
			return;
		}

		for (int i = 0; i < 4; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];

			// 現在地のすぐ隣が壁がある方向には投げることができない
			if (0 <= nx && nx < w && 0 <= ny && ny < h) {
				if (map[ny][nx] == 1) {
					continue;
				}
			}

			// 壁にぶつかるor画面外に行くorゴールにたどり着く
			while (0 <= nx && nx < w && 0 <= ny && ny < h) {
				// 壁にぶつかる
				if (map[ny][nx] == 1) {
					map[ny][nx] = 0;
					dfs(nx - dx[i], ny - dy[i], cnt + 1);
					map[ny][nx] = 1;
					break;
				} else if (map[ny][nx] == 3) {
					t = Math.min(t, cnt);
					return;
				}
				nx += dx[i];
				ny += dy[i];
			}
		}
	}

	void run() {
		Scanner sc = new Scanner(System.in);

		while (true) {
			// input
			w = sc.nextInt();
			h = sc.nextInt();
			if (w == 0 && h == 0) {
				return;
			}
			map = new int[h][w];
			for (int i = 0; i < h; i++) {
				for (int j = 0; j < w; j++) {
					map[i][j] = sc.nextInt();
					if (map[i][j] == 2) {
						sx = j;
						sy = i;
					} else if (map[i][j] == 3) {
						gx = j;
						gy = i;
					}
				}
			}
			t = Integer.MAX_VALUE / 2;
			dfs(sx, sy, 1);
			if (t != Integer.MAX_VALUE / 2) {
				System.out.println(t);
			} else {
				System.out.println(-1);
			}
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}

}
