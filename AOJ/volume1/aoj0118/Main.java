package aoj0118;

import java.util.Scanner;

public class Main {

	public static int[] dx = { 0, 1, 0, -1 };
	public static int[] dy = { -1, 0, 1, 0 };

	public static int h, w;
	public static char[][] map;

	public static void dfs(int x, int y, char c) {
		if (map[y][x] != c) {
			return;
		}

		map[y][x] = '0';
		for (int i = 0; i < 4; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];

			if (nx < 0 || w <= nx || ny < 0 || h <= ny) {
				continue;
			}

			dfs(nx, ny, c);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			h = sc.nextInt();
			w = sc.nextInt();
			if (h == 0 && w == 0) {
				break;
			}
			map = new char[h][];
			for (int i = 0; i < h; i++) {
				map[i] = sc.next().toCharArray();
			}

			int count = 0;
			for (int i = 0; i < h; i++) {
				for (int j = 0; j < w; j++) {
					char cur = map[i][j];
					if (cur != '0') {
						dfs(j, i, cur);
						count++;
					}
				}
			}

			System.out.println(count);
		}

	}

}
