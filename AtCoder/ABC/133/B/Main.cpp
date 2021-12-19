#include <bits/stdc++.h>

using namespace std;
using ll = long long;

const string yes = "Yes";
const string no = "No";

/**
 * @brief 座標xとyの距離を求め、その距離が整数かどうか判定する
 *
 * @param x 座標x
 * @param y 座標y
 * @return true 座標xと座標yの距離が整数である
 * @return false 座標xと座標yの距離が整数ではない
 */
bool distance(vector<int> x, vector<int> y) {
  int d = 0;
  for (int i = 0; i < x.size(); i++) {
    int di = abs(x[i] - y[i]);
    d += (di*di);
  }

  // debug
  // double z = sqrt(d);
  // cout << "d:" << d << ", z:" << z << ", zz:" << z*z << endl;

  // dが整数かどうか判定する
  for (int k = 1; k <= d; k++) {
    if (k*k == d) {
      return true;
    }
  }

  return false;
}

int main() {
  cin.tie(0);
  ios::sync_with_stdio(false);

  // 入力
  int N,D;
  cin >> N >> D;
  vector<vector<int>> p(N, vector<int>(D));
  for (int i = 0; i < N; i++) {
    for (int j = 0; j < D; j++) {
      cin >> p[i][j];
    }
  }

  // 計算
  int ans = 0;
  for (int i = 0; i < N; i++) {
    for (int j = i+1; j < N; j++) {
      if (distance(p[i], p[j])) {
        ans++;
      }
    }
  }

  // 出力
  cout << ans << endl;
  return 0;
}
