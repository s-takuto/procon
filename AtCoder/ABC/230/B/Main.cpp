#include <bits/stdc++.h>

using namespace std;
using ll = long long;

int main() {
  cin.tie(0);
  ios::sync_with_stdio(false);

  // 入力
  string S;
  cin >> S;

  // 計算
  bool judge = true;
  if (S.find("ooo") != string::npos) {
    judge = false;
  } else if (S.find("oox") != string::npos) {
    judge = false;
  } else if (S.find("oxo") != string::npos) {
    judge = false;
  } else if (S.find("xoo") != string::npos) {
    judge = false;
  } else if (S.find("xxx") != string::npos) {
    judge = false;
  } else if (S.size() == 2) {
    if (S.find("oo") != string::npos) {
      judge = false;
    }
  }

  // 出力
  if (judge) {
    cout << "Yes" << endl;
  } else {
    cout << "No" << endl;
  }
}
