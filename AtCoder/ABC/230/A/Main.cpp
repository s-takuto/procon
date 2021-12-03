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
  if (N >= 42) {
    N++;
  }

  // 出力
  cout << "AGC" << setfill('0') << right << setw(3) << N << endl;
}
