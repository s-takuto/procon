#include <bits/stdc++.h>

using namespace std;
using ll = long long;

int main() {
  cin.tie(0);
  ios::sync_with_stdio(false);

  // 入力
  int N,A;
  cin >> N >> A;

  // 計算
  bool ok = true;

  // 500円玉で払った後のお釣りを計算する
  // お釣りがAより大きい場合はNG
  int r = N % 500;
  if (r > A) {
    ok = false;
  }

  // 出力
  if (ok) {
    cout << "Yes" << endl;
  } else {
    cout << "No" << endl;
  }

  return 0;
}
