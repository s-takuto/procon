#include <bits/stdc++.h>

using namespace std;
using ll = long long;

int main() {
  cin.tie(0);
  ios::sync_with_stdio(false);

  // 入力
  int N;
  cin >> N;
  vector<ll> a(N);
  for (int i = 0; i < N; i++) {
    cin >> a[i];
  }

  // 計算
  ll count = 0;
  while(true) {
    // debug
    // cout << "a : (";
    // for (int i = 0; i < N; i++) {
    //   cout << a[i] << ", ";
    // }
    // cout << "), count = " << count << endl;

    // 偶数チェック
    bool even = true;
    for (int i = 0; i < N; i++) {
      if (a[i] % 2 != 0) {
        even = false;
        break;
      }
    }

    if (even) {
      // 全て偶数ならば2で割り、操作をカウントする
      for (int i = 0; i < N; i++) {
        a[i] /= 2;
      }
      count++;
    } else {
      break;
    }
  }

  // 出力
  cout << count << endl;
  return 0;
}
