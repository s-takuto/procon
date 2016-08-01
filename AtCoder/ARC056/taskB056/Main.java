package taskB056;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	int n;
	int m;
	int s;

	boolean[] visited;
	boolean[] visiting;

	int id;

	Vertex[] v;

	class Vertex {
		int id;
		ArrayList<Integer> neighbors;

		public Vertex(int i) {
			this.id = i;
			neighbors = new ArrayList<>();
		}
	}

	boolean search(int i) {
		if (visiting[i] == true || visited[i] == true) {
			return false;
		}
		visiting[i] = true;
		if (id == i) {
			visited[i] = true;
			return true;
		}

		for (Integer j : v[i].neighbors) {
			if (search(j)) {
				return true;
			}
		}
		return false;
	}

	void run() {
		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();
		m = sc.nextInt();
		s = sc.nextInt() - 1;

		v = new Vertex[n];
		for (int i = 0; i < n; i++) {
			v[i] = new Vertex(i);
		}

		visited = new boolean[n];
		visiting = new boolean[n];
		Arrays.fill(visited, false);
		for (int i = 0; i < m; i++) {
			int j = sc.nextInt() - 1;
			int k = sc.nextInt() - 1;
			v[j].neighbors.add(k);
			v[k].neighbors.add(j);
		}

		for (int i = 0; i <= s; i++) {
			id = i;
			Arrays.fill(visiting, false);
			if (search(s)) {
				// for (Integer j : v[i].neighbors) {
				// v[j].neighbors.remove(i);
				// }
				// v[i].neighbors.clear();
				System.out.println(i + 1);
			}
		}

	}

	public static void main(String[] args) {
		new Main().run();
	}

}
