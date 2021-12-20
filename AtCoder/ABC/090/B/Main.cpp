#include <bits/stdc++.h>

using namespace std;
using ll = long long;

const string yes = "Yes";
const string no = "No";

/**
 * @brief 与えられた文字列sが回文かどうか判定する
 *
 * @param s 文字列
 * @return true 文字列sが回文である
 * @return false 文字列sが回文ではない
 */
bool isPalindromic(string s) {
  string t = s;
  reverse(t.begin(),t.end());

  int n = s.size();
  for (int i = 0; i < n; i++) {
    if (s[i] != t[i]) {
      return false;
    }
  }

  return true;
}

/**
 * @brief 5桁の数字aが回文かどうか判定する
 *
 * @param a 5桁の数字(10000 <= a <= 99999)
 * @return true aが回文である
 * @return false aが回文ではない
 */
bool isPalindromicFor5Digit(int a) {
  // 10^0の位
  int s = a / 1 % 10;
  // 10^1の位
  int t = a / 10 % 10;
  // 10^3の位
  int u = a / 1000 % 10;
  // 10^4の位
  int v = a / 10000 % 10;

  return s == v && t == u;
}

int main() {
  cin.tie(0);
  ios::sync_with_stdio(false);

  // 入力
  int A,B;
  cin >> A >> B;

  // 計算
  int ans = 0;
  for (int x = A; x <= B; x++) {
    // if (isPalindromic(to_string(x))) {
    //   // debug
    //   // cout << "x:" << x << endl;
    //   ans++;
    // }

    if (isPalindromicFor5Digit(x)) {
      // debug
      // cout << "x:" << x << endl;
      ans++;
    }
  }

  // 出力
  cout << ans << endl;
  return 0;
}
