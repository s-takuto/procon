#include <bits/stdc++.h>

using namespace std;
using ll = long long;

int main() {
  cin.tie(0);
  ios::sync_with_stdio(false);

  // 入力
  int r,g,b;
  cin >> r >> g >> b;

  // 計算 + 出力
  int a = r*100 + g*10 + b;

  if (a % 4 == 0) {
    cout << "YES" << endl;
  } else {
    cout << "NO" << endl;
  }

  return 0;
}
