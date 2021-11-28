#include <bits/stdc++.h>

using namespace std;
using ll = long long;

int main() {
  cin.tie(0);
  ios::sync_with_stdio(false);

  // 入力
  // N := N人の友達(2 <= N <= 10^5)
  // X := 友達Xに秘密を知られた(≒探索の最初の地点)
  // A[i] := 友達iが次に秘密を漏らす友達(≒頂点iの隣接頂点)
  int N, X;
  cin >> N >> X;
  vector<int> A(N);
  for (int i = 0; i < N; i++) {
    cin >> A[i];
    A[i] -= 1; // 0-indexに合わせるため
  }

  // 計算
  // v[i] := 友達iが秘密を知っているならばtrue, そうでなければfalse(≒頂点v[i]を訪れているならばture, そうでなければfalse)
  vector<bool> v(N);

  int count = 0;
  int cur = X - 1; // 0-indexに合わせるため

  // 現在の友達が秘密を知っているまで
  while(!v[cur]) {
    // debug
    // cout << "count : " << count << ", cur : " << cur << ", next to : " << A[cur] << endl;
    v[cur] = true;
    count++;
    cur = A[cur];
  }

  // 出力
  cout << count << endl;
}
