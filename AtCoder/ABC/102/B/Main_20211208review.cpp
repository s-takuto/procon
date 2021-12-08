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
  sort(a.begin(), a.end());
  ll ans = abs(a[0] - a[N-1]);

  // 出力
  cout << ans << endl;

  return 0;
}
