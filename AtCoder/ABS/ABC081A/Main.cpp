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
  int count = 0;
  for (int i = 0; i < n; i++) {
    if (s[i] == '1') {
      count++;
    }
  }

  // 出力
  cout << count << endl;

  return 0;
}
