#include <bits/stdc++.h>

using namespace std;
using ll = long long;

// (x, y)を黒く塗れるか判定するメソッド
bool judgeBlack(ll x, ll y, ll A, ll B) {
  bool black = false;
  if ((x - A) == (y - B)) {
    // cout << ", type 1 : #" << endl;
    black = true;
  } else if ((x - A) == (B - y)) {
    // cout << ", type 2 : #" << endl;
    black = true;
  }

  return black;
}

// (x, y)を黒く塗れるか判定するメソッド
// 判定部分を少しだけ工夫
bool judgeBlack2(ll x, ll y, ll A, ll B) {
  bool black = false;
  if ((x - y) == (A - B)) {
    // cout << ", type 1 : #" << endl;
    black = true;
  } else if ((x + y) == (A + B)) {
    // cout << ", type 2 : #" << endl;
    black = true;
  }

  return black;
}

int main() {
  cin.tie(0);
  ios::sync_with_stdio(false);

  // 入力
  ll N, A, B, P, Q, R, S;
  cin >> N >> A >> B;
  cin >> P >> Q >> R >> S;

  // 計算
  // ans[i] := i行目のマスの様子
  vector<string> ans;

  for (ll x = P; x <= Q; x++) {
    string str;
    for (ll y = R; y <= S; y++) {
      // debug
      // cout << "(x, y) = (" << x << ", " << y << ")";
      if (judgeBlack2(x, y, A, B)) {
        str += "#";
      } else {
        // cout << ", type 3 : ." << endl;
        str += ".";
      }
    }
    ans.push_back(str);
  }

  // 出力
  for (ll i = 0; i < ans.size(); i++) {
    cout << ans[i] << endl;
  }
}
