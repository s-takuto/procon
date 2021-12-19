#include <bits/stdc++.h>

using namespace std;
using ll = long long;

int main() {
  cin.tie(0);
  ios::sync_with_stdio(false);

  // 入力
  int N;
  cin >> N;

  // 計算
  int na = N / 4;
  int nb = N / 7;
  bool ok = false;
  for (int i = 0; i <= na; i++) {
    for (int j = 0; j <= nb; j++) {
      int sum = 4*i + 7*j;
      if (sum == N) {
        // debug
        // cout << "i:" << i << ", j:" << j << endl;
        ok = true;
        break;
      }
    }

    if (ok) {
      break;
    }
  }

  // 出力
  if (ok) {
    cout << "Yes" << endl;
  } else {
    cout << "No" << endl;
  }

  return 0;
}
