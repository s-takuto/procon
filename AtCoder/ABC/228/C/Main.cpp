#include <bits/stdc++.h>

using namespace std;
using ll = long long;

int main() {
  cin.tie(0);
  ios::sync_with_stdio(false);

  // 入力
  // N := N人生徒
  // K := 上位K位(1 <= K <= N <= 10^5)
  // P[i][j] :=生徒iのj日目の点数(0 <= P[i][j] <= 300, 1 <= i <= N, 1 <= j <= 3)
  int N, K;
  cin >> N >> K;
  vector<vector<int>> P(N, vector<int>(3));
  for (int i = 0; i < N; i++) {
    for (int j = 0; j < 3; j++) {
      cin >> P[i][j];
    }
  }

  // 計算
  // (1) 各生徒iの合計点を算出する
  // sum[i] := 生徒iの3日までの合計点数
  vector<int> sum(N);
  for (int i = 0; i < N; i++) {
    int s = 0;
    for (int j = 0; j < 3; j++) {
      s += P[i][j];
    }
    sum[i] = s;
  }
  /* debug
  cout << "sum : (";
  for (int i = 0; i < N; i++) {
    cout << sum[i] << ", ";
    if (i == N-1) {
      cout << sum[i];
    }
  }
  cout << ")" << endl;
  */

  // (2) 順位用のリストを用意し、順位ごとになるようにソートする
  // rank[i] := 上位i+1位の合計点数
  vector<int> rank(N);
  for (int i = 0; i < N; i++) {
    rank[i] = sum[i];
  }
  sort(rank.begin(), rank.end());
  reverse(rank.begin(), rank.end());
  /* debug
  cout << "rank : (";
  for (int i = 0; i < N; i++) {
    cout << rank[i] << ", ";
    if (i == N-1) {
      cout << rank[i];
    }
  }
  cout << ")" << endl;
  */

  // (3) 生徒iが上位K位以内に入るか判定する
  // judge[i] := 生徒iが上位K位内に入るのであれば"Yes", そうでなければ"NG"
  vector<string> judge(N);
  for (int i = 0; i < N; i++) {
    // K位の生徒の合計点数を取得する
    int sumK = rank[K - 1];

    // 生徒iの4日目で取る最大点数を算出する
    int sumI = sum[i] + 300;

    if (sumK <= sumI) {
      judge[i] = "Yes";
    } else {
      judge[i] = "No";
    }
  }

  // 出力
  for (int i = 0; i < N; i++) {
    cout << judge[i] << endl;
  }
}
