#include <bits/stdc++.h>

using namespace std;
using ll = long long;

const string yes = "Yes";
const string no = "No";

/**
 * @brief 入力Nを九九で表現できるか判定する
 *
 * @param N 整数(1 <= N <= 10)
 * @return string 九九で表現できるならyes, そうでなければnoを返す
 */
string solve(int N) {
  for (int x = 1; x <= 9; x++) {
    for (int y = 1; y <= 9; y++) {
      if (x * y == N) {
        // debug
        // cout << "x:" << x << ", y:" << y << endl;;
        return yes;
      }
    }
  }

  return no;
}

int main() {
  cin.tie(0);
  ios::sync_with_stdio(false);

  int N;
  cin >> N;

  cout << solve(N) << endl;
  return 0;
}
