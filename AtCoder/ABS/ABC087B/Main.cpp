#include <bits/stdc++.h>

using namespace std;
using ll = long long;

int main() {
  cin.tie(0);
  ios::sync_with_stdio(false);

  //k力
  int na,nb,nc;
  cin >> na >> nb >> nc;
  int x;
  cin >> x;

  // 計算
  int ans = 0;
  for (int i = 0; i <= na; i++) {
    for (int j = 0; j <= nb; j++) {
      for (int k = 0; k <= nc; k++) {
        int sum = 500*i + 100*j + 50*k;
        if (sum == x) {
          // debug
          // cout << "i:" << i << ", j:" << j << ", k:" << k << endl;
          ans++;
        }
      }
    }
  }

  // 出力
  cout << ans << endl;

  return 0;
}
