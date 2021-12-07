#include <bits/stdc++.h>

using namespace std;
using ll = long long;

int main() {
  cin.tie(0);
  ios::sync_with_stdio(false);

  // 入力
  string s,t;
  cin >> s >> t;
  int n = s.size();
  int m = t.size();

  // 計算

  // 1. sは昇順
  sort(s.begin(), s.end());

  // 2. tは降順となるように並び替える
  sort(t.begin(), t.end());
  reverse(t.begin(), t.end());

  // bebug
  // cout << "s' : " << s << ", t' : " << t << endl;

  // 3. s < t となるか判定する
  // 3-1. aaa < aaab のような場合
  bool judge1 = true;
  if (n < m) {
    for (int i = 0; i < n; i++) {
      if (s[i] != t[i]) {
        judge1 =false;
        break;
      }
    }
  } else {
    judge1 = false;
  }
  // debug
  // cout << "judge1 : " << judge1 << endl;

  // 3-2. abc < abcd のような場合
  bool judge2 = false;
  for (int i = 0; i< min(n,m); i++) {
    if (s[i] == t[i]) {
      continue;
    } else if (s[i] < t[i]) {
      judge2 = true;
      break;
    } else if (s[i] > t[i]) {
      judge2 = false;
      break;
    }
  }
  // debug
  // cout << "judge2 : " << judge2 << endl;

  // 出力
  if (judge1 || judge2) {
    cout << "Yes" << endl;
  } else {
    cout << "No" << endl;
  }

  return 0;
}
