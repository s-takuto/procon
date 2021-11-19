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

int main() {
  cin.tie(0);
  ios::sync_with_stdio(false);

  // 入力
  int n, k, a;
  cin >> n >> k >> a;

  // 計算
  // a - 1:人aから配ることでどのくらいズレるかを算出する
  int ans = (k + a - 1) % n;
  if (ans == 0) {
    ans = n;
  }

  // 出力
  cout << ans << endl;
}