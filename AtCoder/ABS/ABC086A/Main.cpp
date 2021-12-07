#include <bits/stdc++.h>

using namespace std;
using ll = long long;

int main() {
  cin.tie(0);
  ios::sync_with_stdio(false);

  // 入力
  int a, b;
  cin >> a >> b;

  // 計算
  bool even = true;
  if ((a % 2 != 0) && (b % 2 != 0)) {
    even = false;
  }

  // 出力
  if (even) {
    cout << "Even" << endl;
  } else {
    cout << "Odd" << endl;
  }

  return 0;
}
