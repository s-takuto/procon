#include <bits/stdc++.h>

using namespace std;
using ll = long long;

int main() {
  cin.tie(0);
  ios::sync_with_stdio(false);

  // 入力
  string s;
  cin >> s;
  int n = s.size();

  // 計算
  // Aの位置を求める(先頭から探して最初に見つけたA)
  int posA = -1;
  for (int i = 0; i < n; i++) {
    if (s[i] == 'A') {
      posA = i;
      break;
    }
  }

  // Zの位置を求める(末尾から探して最初に見つけたZ)
  int posZ = -1;
  for (int i = n-1; i >= 0; i--) {
    if (s[i] == 'Z') {
      posZ = i;
      break;
    }
  }

  // 出力
  cout << (posZ - posA + 1) << endl;
}
