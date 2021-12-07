#include <bits/stdc++.h>

using namespace std;
using ll = long long;

int main() {
  cin.tie(0);
  ios::sync_with_stdio(false);

  // 入力
  string str;
  cin >> str;
  int n = str.size();

  // 計算
  int num = n - 2;
  string ans;
  ans = str[0] + to_string(num) + str[n-1];

  // 出力
  cout << ans << endl;

  return 0;
}
