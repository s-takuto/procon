#include <bits/stdc++.h>

using namespace std;
using ll = long long;

int main() {
  cin.tie(0);
  ios::sync_with_stdio(false);

  // 入力
  int N;
  cin >> N;
  vector<ll> a(N);
  for (int i = 0; i < N; i++) {
    cin >> a[i];
  }

  // 計算
  // 各aiが2で割りきれる最小の回数を求める
  int ans = INT_MAX;
  for (int i = 0; i < N; i++) {
    // debug
    // cout << "a[" << i << "] = " << a[i] << ", ans = " << ans << endl;

    int count = 0;
    while(a[i] % 2 == 0) {
      count++;
      a[i] /= 2;
    }

    // debug
    // cout << "a[" << i << "] = " << a[i] << ", ans = " << ans << ", count = " << count << endl;

    ans = min(ans, count);
  }

  // 出力
  cout << ans << endl;

  return 0;
}
