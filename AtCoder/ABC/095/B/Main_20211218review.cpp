#include <bits/stdc++.h>

using namespace std;
using ll = long long;

int main() {
  cin.tie(0);
  ios::sync_with_stdio(false);

  // 入力
  int N, X;
  cin >> N >> X;
  vector<int> m(N);
  for (int i = 0; i < N; i++) {
    cin >> m[i];
  }

  // 計算
  // N種類のドーナツの素のsum、消費が最小なお菓子の素を算出する
  int ans = N;
  int sum = 0;
  int minM = INT_MAX;
  for (int i = 0; i < N; i++) {
    sum += m[i];

    if (m[i] < minM) {
      minM = m[i];
    }
  }

  // お菓子な素の残りと、消費が最小なお菓子の素を使って最大何個作れるか算出する
  int remainX = X - sum;
  ans += (remainX / minM);

  // debug
  // cout << "remainX : " << remainX << ", minM : " << minM << endl;

  // 出力
  cout << ans << endl;
  return 0;
}
