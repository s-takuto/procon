package taskD040;

import java.util.Scanner;

public class Main {

	int n;
	int m;

	class Vertex {
		int id;
		int[] neighbor;
		boolean visited;

		Vertex(int id) {
			this.id = id;
			neighbor = new int[n - 1];
			visited = false;
		}
	}

	class Edge {
		int i, j;
		int w;

		Edge(int i, int j, int w) {
			this.i = i;
			this.j = j;
			this.w = w;
		}
	}

	void run() {
		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();
		m = sc.nextInt();
		Vertex[] v = new Vertex[n];
		Edge[] e = new Edge[m];

		for (int i = 0; i < n; i++) {
			v[i] = new Vertex(0);
		}

		for (int i = 0; i < m; i++) {
			int j = sc.nextInt();
			int k = sc.nextInt();
			int w = sc.nextInt();

		}

	}

	public static void main(String[] args) {
		new Main().run();
	}

}
