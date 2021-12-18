#include <bits/stdc++.h>

using namespace std;
using ll = long long;

int main() {
  cin.tie(0);
  ios::sync_with_stdio(false);

  // 入力
  string s;
  cin >> s;
  int n = s.size();

  // 計算
  string ans;
  for (int i = 0; i < n; i++) {
    if ((i+1) % 2 != 0) {
      ans += s[i];
    }
  }

  // 出力
  cout << ans << endl;
}
