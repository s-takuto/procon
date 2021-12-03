#include <bits/stdc++.h>

using namespace std;
using ll = long long;

int main() {
  cin.tie(0);
  ios::sync_with_stdio(false);

  // 入力
  long N, D;
  cin >> N >> D;

  typedef pair<long,long> wall;
  vector<wall> wallList(N);
  for (long i = 0; i < N; i++) {
    ll l, r;
    cin >> l >> r;
    wall w = make_pair(r, l); //逆にしているので注意！
    wallList[i] = w;
  }

  // 計算
  // ソートする
  sort(wallList.begin(), wallList.end());

  long count = 0;
  for (long i = 0; i < N;){

    // パンチの範囲を決める
    long leftD = wallList[i].first;
    long rightD = leftD + D - 1;

    // 何個かべを破壊できるか数えて、その分だけiを進める
    long damagedCount = 0;
    for (int j = i; j < N; j++) {
      if (rightD >= wallList[j].second) {
        damagedCount++;
      } else {
        break;
      }
    }
    i += damagedCount;

    // カウントをインクリメントする
    count++;
  }

  // 出力
  cout << count << endl;
}
