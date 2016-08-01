package problemC360;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	int n;
	int m;
	boolean[] visited;
	Vertex[] vertices;

	class Vertex {
		int id;
		List<Integer> neighbors;

		public Vertex(int i) {
			this.id = i;
			neighbors = new ArrayList<Integer>();
		}
	}

	void dfs() {

	}

	void run() {
		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();
		m = sc.nextInt();
		vertices = new Vertex[n];

		for (int i = 0; i < n; i++) {
			vertices[i] = new Vertex(i);
		}

		for (int i = 0; i < m; i++) {
			int v = sc.nextInt() - 1;
			int w = sc.nextInt() - 1;

			vertices[v].neighbors.add(w);
			vertices[w].neighbors.add(v);
		}

		
		
		
	}

	public static void main(String[] args) {
		new Main().run();
	}

}
