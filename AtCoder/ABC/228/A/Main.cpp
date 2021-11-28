#include <bits/stdc++.h>

using namespace std;
using ll = long long;

int main() {
  cin.tie(0);
  ios::sync_with_stdio(false);

  // 入力
  int S, T, X;
  cin >> S >> T >> X;

  // 計算
  bool ans = false;
  if (S < T) {
    if (S <= X && X < T) {
      ans = true;
    }
  } else {
    T += 24;
    if (S > X) {
      X += 24;
    }
    if (S <= X && X < T) {
      ans = true;
    }
  }

  // 出力
  if (ans) {
    cout << "Yes" << endl;
  } else {
    cout << "No" << endl;
  }
}
