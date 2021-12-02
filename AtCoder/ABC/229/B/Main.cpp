#include <bits/stdc++.h>

using namespace std;
using ll = long long;

int main() {
  cin.tie(0);
  ios::sync_with_stdio(false);

  // 入力
  string A, B;
  cin >> A >> B;

  // 計算
  reverse(A.begin(), A.end());
  reverse(B.begin(), B.end());

  int length = min(A.size(), B.size());

  // debug
  // cout << "A : " << A << ", B : " << B << endl;

  bool judge = false;
  for (int i = 0; i < length; i++) {
    int ai = A[i] - '0';
    int bi = B[i] - '0';
    // debug
    // cout << "i : " << i << ", A : " << ai << ", B : " << bi << endl;
    if (ai + bi >= 10) {
      judge = true;
      break;
    }
  }

  // 出力
  if (judge) {
    cout << "Hard" << endl;
  } else {
    cout << "Easy" << endl;
  }
}
