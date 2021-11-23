#include <iostream>
#include <algorithm>
#include <climits>
#include <vector>
#include <utility>
#include <functional>
#include <map>
#include <string>
#include <set>
#include <math.h>

using namespace std;
using ll = long long;

int main() {
  cin.tie(0);
  ios::sync_with_stdio(false);

  // 入力
  // n:整数(1 <= n <= 10 ^ 11)
  ll n;
  cin >> n;

  // 計算
  ll ans = 0;
  for (ll a = 1; a*a*a <= n; a++ ) {
    for (ll b = a; a*b*b <= n; b++) {
      ll maxC = n / (a * b);
      ans += maxC - b + 1;
      // debug
      // cout << "a : " << a << ", b : " << b << ", ans : " << ans << endl;
    }
  }

  // 出力
  cout << ans << endl;
}
