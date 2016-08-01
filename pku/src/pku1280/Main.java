package pku1280;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public double Pa, Pb;
	public int K, L;

	void run() {
		Scanner sc = new Scanner(System.in);

		// テストケース数
		int t = sc.nextInt();

		while (t-- > 0) {
			// Aがサーブ権を持って勝つ確率
			Pa = sc.nextDouble() / 100;
			// Bがサーブ権を持って勝つ確率
			Pb = sc.nextDouble() / 100;
			// セット数
			K = sc.nextInt();
			// ポイント数
			L = sc.nextInt();

			// Q_A[a][b][s]:Aがa点、Bがb点、サーブがsの状態からAが勝つ確率
			// Q_B[a][b][s]:Aがa点、Bがb点、サーブがsの状態からBが勝つ確率
			// s=0:Aがサーブ、s=1:Bがサーブ
			double[][][] Q_A = new double[L + 1][L + 1][2];
			double[][][] Q_B = new double[L + 1][L + 1][2];

			// 基底
			for (int i = L - 1; i >= 0; i--) {
				Q_A[L][i][0] = 1;
				Q_A[L][i][1] = 1;
				Q_A[i][L][0] = 0;
				Q_A[i][L][1] = 0;
				Q_B[L][i][0] = 0;
				Q_B[L][i][1] = 0;
				Q_B[i][L][0] = 1;
				Q_B[i][L][1] = 1;
			}

			for (int a = L - 1; a >= 0; a--) {
				for (int b = L - 1; b >= 0; b--) {
					// Aがa点、Bがb点、サーブ権がAの時でAが勝った確率は、
					// Aが得点したorAが失点したかのどちらか
					Q_A[a][b][0] = (Pa * Q_A[a + 1][b][0]) + (1 - Pa)
							* Q_A[a][b + 1][1];
					// Aがa点、Bがb点、サーブ権がBの時でAが勝った確率は、
					// Bが失点したorBが得点したかのどちらか
					Q_A[a][b][1] = (1 - Pb) * Q_A[a + 1][b][0]
							+ (Pb * Q_A[a][b + 1][1]);

					// Aがa点、Bがb点、サーブ権がAの時でBが勝った確率は、
					// Aが失点したorAが得点したかのどちらか
					Q_B[a][b][0] = (1 - Pa) * Q_B[a][b + 1][1] + Pa
							* Q_B[a + 1][b][0];
					// Aがa点、Bがb点、サーブ権がBの時でBが勝った確率は、
					// Bが得点したorBが失点したかのどちらか
					Q_B[a][b][1] = (Pb * Q_B[a][b + 1][1]) + (1 - Pb)
							* Q_B[a + 1][b][0];
				}
			}

			// K_A[a][b][s]:Aがaセット、Bがbセット、サーブがsの状態からAが勝つ確率
			// K_B[a][b][s]:Aがaセット、Bがbセット、サーブがsの状態からBが勝つ確率
			// s=0:Aがサーブ、s=1:Bがサーブ
			double K_A[][][] = new double[K + 1][K + 1][2];
			double K_B[][][] = new double[K + 1][K + 1][2];

			// 基底
			for (int i = K - 1; i >= 0; i--) {
				K_A[K][i][0] = 1;
				K_A[K][i][1] = 1;
				K_A[i][K][0] = 0;
				K_A[i][K][1] = 0;
				K_B[K][i][0] = 0;
				K_B[K][i][1] = 0;
				K_B[i][K][0] = 1;
				K_B[i][K][1] = 1;
			}

			for (int a = K - 1; a >= 0; a--) {
				for (int b = K - 1; b >= 0; b--) {
					// Aがaセット、Bがbセットで、サーブ権はAの状態でAが勝つとき
					// サーブ権はBが持っていて、Aが1セット取ったorAが1セット取られた
					K_A[a][b][0] = Q_A[0][0][1] * K_A[a + 1][b][1]
							+ (1 - Q_A[0][0][1]) * K_A[a][b + 1][1];
					// Aがaセット、Bがbセットで、サーブ権はBの状態でAが勝つとき
					// サーブ権はAが持っていて、Aが1セット取ったorAが1セット取られた
					K_A[a][b][1] = Q_A[0][0][0] * K_A[a + 1][b][0]
							+ (1 - Q_A[0][0][0]) * K_A[a][b + 1][0];

					// 実はここはいらない
					// Bが勝つ確率だから
					K_B[a][b][0] = (1 - Q_B[0][0][1]) * K_B[a + 1][b][1]
							+ Q_B[0][0][1] * K_B[a][b + 1][1];
					K_B[a][b][1] = (1 - Q_B[0][0][0]) * K_B[a + 1][b][0]
							+ Q_B[0][0][0] * K_B[a][b + 1][0];
				}
			}

			// Aが勝つ確率
			double p = (K_A[0][0][0] + K_A[0][0][1]) / 2 * 100;

			// 四捨五入(小数第一位まで)
			BigDecimal x = new BigDecimal(p);
			x = x.setScale(1, BigDecimal.ROUND_HALF_UP);
			System.out.println(x);
		}

	}

	public static void main(String[] args) {
		new Main().run();
	}

}
