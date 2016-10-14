package pku2386;

import java.util.Scanner;

public class Main {

	static int n, m;

	static char[][] map;

	static int[] dx = { -1, 0, 1 };
	static int[] dy = { -1, 0, 1 };

	// 深さ優先探索
	static void dfs(int x, int y) {
		map[x][y] = '.';
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				int nx = x + dx[i];
				int ny = y + dy[j];

				// 端の処理
				if (nx < 0 || n <= nx || ny < 0 || m <= ny) {
					continue;
				}

				if (map[nx][ny] == 'W') {
					dfs(nx, ny);
				}
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// input
		n = sc.nextInt();
		m = sc.nextInt();
		map = new char[n][];
		for (int i = 0; i < n; i++) {
			map[i] = sc.next().toCharArray();
		}

		int count = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (map[i][j] == 'W') {
					dfs(i, j);
					count++;
				}
			}
		}
		System.out.println(count);
	}

}
