#include <bits/stdc++.h>

using namespace std;
using ll = long long;

int main() {
  cin.tie(0);
  ios::sync_with_stdio(false);

  // 入力
  ll N, W;
  cin >> N >> W;
  using cheese = pair<ll,ll>;
  vector<cheese> cheeseList;
  for (ll i = 0; i < N; i++) {
    cheese c;
    cin >> c.first >> c.second;
    cheeseList.push_back(c);
  }

  // 計算
  // 1. 価値の高い順になるようにソート
  sort(cheeseList.begin(), cheeseList.end());
  reverse(cheeseList.begin(), cheeseList.end());

  // 2. 価値の高いものから選ぶ。
    // 条件は、あるチーズiを全部載せていいなら載せる。だめなら、ギリギリまで載せる。
  ll ans = 0;
  ll sumWeight = 0;
  for (ll i = 0; i < N; i++) {
    cheese c = cheeseList[i];
    if (sumWeight + c.second <= W) {
      ans += (c.first * c.second);
      sumWeight += c.second;
      // cout << "i : " << i << ", value : " << c.first << ", weight : " << c.second << ", sumWeight : " << sumWeight << ", ans : " << ans << endl;
    } else {
      ans += (c.first * (W - sumWeight));
      sumWeight += (W - sumWeight);
      // cout << "i : " << i << ", value : " << c.first << ", weight : " << c.second << ", sumWeight : " << sumWeight << ", ans : " << ans << endl;
      break;
    }
  }

  // 出力
  cout << ans << endl;
}
