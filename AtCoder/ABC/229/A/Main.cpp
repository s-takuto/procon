#include <bits/stdc++.h>

using namespace std;
using ll = long long;

int main() {
  cin.tie(0);
  ios::sync_with_stdio(false);

  // 入力
  string s1, s2;
  cin >> s1 >> s2;

  // 計算
  int count = 0;
  for (int i = 0; i < s1.size(); i++) {
    if (s1[i] == '#') {
      count++;
    }
    if (s2[i] == '#') {
      count++;
    }
  }

  // 出力
  if (count >= 3) {
    cout << "Yes" << endl;
  } else if (s1[0] == '#' && s2[1] == '#') {
    cout << "No" << endl;
  } else if (s1[1] == '#' && s2[0] == '#') {
    cout << "No" << endl;
  } else {
    cout << "Yes" << endl;
  }
}
