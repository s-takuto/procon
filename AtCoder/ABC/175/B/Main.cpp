#include <bits/stdc++.h>

using namespace std;
using ll = long long;

const string yes = "Yes";
const string no = "No";

/**
 * @brief 辺の長さa,b,c(a <= b <= c)の三角形が存在するか判定する
 *
 * @param a 三角形の1辺の長さ
 * @param b 三角形の1辺の長さ
 * @param c 三角形の1辺の長さ
 * @return true 三角形が存在する
 * @return false 三角形が存在しない
 */
bool judgeTriangle(int a, int b, int c) {
  // debug
  // cout << "a:" << a << ", b:" << b << ", c:" << c << endl;

  // 全て異なる長さ
  if (a == b || b == c || a == c) {
    return false;
  }

  // 三角形の条件
  // 2,3,4 -> OK
  // 1,2,3 -> NG
  return (a + b) > c;
}

int main() {
  cin.tie(0);
  ios::sync_with_stdio(false);

  // 入力
  int N;
  cin >> N;
  vector<int> l(N);
  for (int i = 0; i < N; i++) {
    cin >> l[i];
  }

  sort(l.begin(), l.end());

  // 計算
  int ans = 0;
  for (int i = 0; i < N; i++) {
    for (int j = i+1; j < N; j++) {
      for (int k = j+1; k < N; k++) {
        if (judgeTriangle(l[i], l[j], l[k])) {
          ans++;
        }
      }
    }
  }

  // 出力
  cout << ans << endl;
  return 0;
}
