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
  // n:人数
  int n;
  cin >> n;

  // s[i]:面積
  vector<int> s(n);
  for (int i = 0; i < n; i++) {
    cin >> s[i];
  }

  // 計算
  int ansN = 0; // 間違っている人の数
  for (int i = 0; i < n; i++) {
    bool ans = false;
    for (int a = 1; a <= 1000; a++) {
      for (int b = 1; b <= 1000; b++) {
        // S = 4ab + 3a + 3b
        int S = (4 * a * b) + (3 * a) + (3 * b);

        if (s[i] == S) {
          // 答えが1個でも見つかったらこれ以上探す必要はないが、
          // 処理時間の影響は小さいので無視した
          ans = true;
        }
      }
    }

    // 答えが見つからなかったらカウントする
    if (!ans) {
      ansN++;
    }
  }

  // 出力
  cout << ansN << endl;
}