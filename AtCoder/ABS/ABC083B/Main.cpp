#include <bits/stdc++.h>

using namespace std;
using ll = long long;

const string yes = "Yes";
const string no = "No";

int main() {
  cin.tie(0);
  ios::sync_with_stdio(false);

  // 入力
  int N,A,B;
  cin >> N >> A >> B;

  // 計算
  int ans = 0;
  for (int i = 1; i <= N; i++) {
    // 各位の和を求める
    int sum = 0;
    int x = i;
    while(x > 0) {
      sum += (x % 10);
      x /= 10;
    }

    // debug
    // cout << "i:" << i << ", sum:" << sum << endl;
    if (A <= sum && sum <= B) {
      ans += i;
    }
  }

  // 出力
  cout << ans << endl;
  return 0;
}
