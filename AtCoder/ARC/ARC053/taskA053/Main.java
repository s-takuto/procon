package taskA053;

import java.util.HashSet;
import java.util.Scanner;

public class Main {

	int[][] map;

	class Edge {
		int x, y;

		public Edge(int x, int y) {
			if (x > y) {
				this.x = x;
				this.y = y;
			}
			else {
				this.x = y;
				this.y = x;
			}
		}
	}

	void run() {
		Scanner sc = new Scanner(System.in);

		int h = sc.nextInt();
		int w = sc.nextInt();

		map = new int[h][w];

		HashSet<Edge> edges = new HashSet<>();

		int a = 0;
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				map[i][j] = a++;
			}
		}

		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				if (j != w - 1) {
					Edge e = new Edge(map[i][j], map[i][j + 1]);
					edges.add(e);
				}
				if (i != h - 1) {
					Edge e = new Edge(map[i][j], map[i + 1][j]);
					edges.add(e);
				}
			}
		}

		System.out.println(edges.size());

	}

	public static void main(String[] args) {
		new Main().run();
	}

}
