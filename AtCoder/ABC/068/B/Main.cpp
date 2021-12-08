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
  int ans = 1;
  int maxCount = 0;
  for (int i = 1; i <= N; i++) {
    int a = i;

    int count = 0;
    while(a % 2 == 0) {
      count++;
      a /= 2;
    }

    if (maxCount < count) {
      maxCount = count;
      ans = i;
    }

    // debug
    // cout << "i : " << i << ", count : " << count << ", maxCount : " << maxCount << endl;
  }

  // 出力
  cout << ans << endl;

  return 0;
}
