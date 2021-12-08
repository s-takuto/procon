#include <bits/stdc++.h>

using namespace std;
using ll = long long;

int main() {
  cin.tie(0);
  ios::sync_with_stdio(false);

  // 入力
  string S;
  cin >> S;
  int n = S.size();

  // 計算
  int count = 0;
  for (int i = 0; i < n; i++) {
    if (S[i] == 'o') {
      count++;
    }
  }
  int ans = 700 + 100 * count;

  // 出力
  cout << ans << endl;

  return 0;
}
