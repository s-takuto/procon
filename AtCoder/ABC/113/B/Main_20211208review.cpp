#include <bits/stdc++.h>

using namespace std;
using ll = long long;

int main() {
  cin.tie(0);
  ios::sync_with_stdio(false);

  // 入力
  int N;
  cin >> N;

  int T, A;
  cin >> T >> A;

  vector<int> heights(N);
  for (int i = 0; i < N; i++) {
    cin >> heights[i];
  }

  // 計算
  // 各地点の気温を計算する
  // 気温とAとの絶対値を計算し、絶対値が最も小さくなる時の地点を計算する
  int ans = -1;
  double minAbs = DBL_MAX;
  for (int i = 0; i < N; i++) {
    double t = (T - (double)(heights[i] * 0.006));
    double diff = abs(A - t);

    // debug
    // cout << "i : " << i << ", t : " << t << ", diff : " << diff << endl;

    if (diff < minAbs) {
      minAbs = diff;
      ans = i + 1;
    }
  }

  // 出力
  cout << ans << endl;

  return 0;
}
