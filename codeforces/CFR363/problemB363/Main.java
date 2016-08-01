package problemB363;

import java.util.Scanner;

public class Main {

	int n;
	int m;

	char[][] map;

	void run() {
		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();
		m = sc.nextInt();

		map = new char[n][m];

		for (int i = 0; i < n; i++) {
			map[i] = sc.next().toCharArray();
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				char[][] tmp = new char[n][m];
				tmp = copy();
				if (search(i, j, tmp)) {
					System.out.println("YES");
					System.out.println((i + 1) + " " + (j + 1));
					return;
				}
			}
		}
		System.out.println("NO");
	}

	char[][] copy() {
		char[][] tmp = new char[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				tmp[i][j] = map[i][j];
			}
		}
		return tmp;
	}

	boolean search(int x, int y, char[][] p) {
		for (int i = 0; i < n; i++) {
			p[i][y] = '.';
		}

		for (int j = 0; j < m; j++) {
			p[x][j] = '.';
		}

		return check(p);
	}

	boolean check(char[][] p) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (p[i][j] == '*') {
					return false;
				}
			}
		}
		return true;
	}

	public static void main(String[] args) {
		new Main().run();
	}

}
