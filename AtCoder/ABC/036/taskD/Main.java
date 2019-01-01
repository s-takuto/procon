package taskD;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	int l = 1000000007;
	int N;
	long dp[][];

	Vertex[] v;

	void run() {
		Scanner sc = new Scanner(System.in);

		N = sc.nextInt();

		v = new Vertex[N];
		for (int i = 0; i < N; i++) {
			v[i] = new Vertex();
		}

		for (int i = 0; i < N - 1; i++) {
			int a = sc.nextInt() - 1;
			int b = sc.nextInt() - 1;
			v[a].neighbor.add(b);
			v[b].neighbor.add(a);
		}

		dp = new long[N][2];
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < 2; j++) {
				dp[i][j] = -1;
			}
		}

		solve(0);

		System.out.println(dp[0][0] % l);

		sc.close();
	}

	void solve(int x) {
		if (v[x].visited)
			return;
		v[x].visited = true;
		for (int i = 0; i < v[x].neighbor.size(); i++) {
			int tmp = v[x].neighbor.get(i);
			if (!v[tmp].visited) {
				solve(tmp);
				v[tmp].visited = false;
			}
		}

		long tmp = 1;
		long tmp1 = 1;
		for (int i = 0; i < v[x].neighbor.size(); i++) {
			int j = v[x].neighbor.get(i);
			if (!v[j].visited) {
				tmp *= dp[j][0];
				tmp1 *= dp[j][1];
			}
		}

		dp[x][1] = tmp % l;
		dp[x][0] = (dp[x][1] + tmp1) % l;
	}

	class Vertex {
		ArrayList<Integer> neighbor = new ArrayList<>();
		boolean visited;
	}

	public static void main(String[] args) {
		new Main().run();
	}

}