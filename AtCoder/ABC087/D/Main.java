package D;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
	int n, m;

	Edge[] edges;
	boolean[] visited;
	List<Integer> vertices;
	List<List<Integer>> neighbors;

	// トポロジカルソート
	public void tsort() {
		for(int v = 1; v <= n; v++) {
			dfs(v);
		}
		Collections.reverse(vertices);
		System.out.println(vertices);
	}

	// トポロジカルソートは，dfsの帰りがけの順番
	private void dfs(int v) {
		if(visited[v]) {
			return;
		}

		visited[v] = true;

		// vの隣接頂点に対して
		for(Integer w: neighbors.get(v)) {
			dfs(w);
		}
		vertices.add(v);
	}

	public boolean judge() {
		return true;
	}

	public void run() {
		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();
		m = sc.nextInt();

		edges = new Edge[m * 2];
		visited = new boolean[n + 1];
		vertices = new ArrayList<>();
		neighbors = new ArrayList<>();
		for(int i = 0; i <= n; i++) {
			neighbors.add(new ArrayList<>());
		}

		for(int i = 0; i < m; i++) {
			int l = sc.nextInt();
			int r = sc.nextInt();
			int d = sc.nextInt();

			neighbors.get(r).add(l);

			edges[i] = new Edge(r, l, d);
		}

		System.out.println(neighbors);

		tsort();

		if(judge()) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
	}

	public class Edge {
		int u, v;
		int weight;

		public Edge (int u, int v, int weight) {
			this.u = u;
			this.v = v;
			this.weight = weight;
		}

		@Override
			public String toString() {
				return "u : " + u + ", v : " + v + ", weight : " + weight;
			}
	}

	public static void main(String[] args) {
		new Main().run();
	}
}
