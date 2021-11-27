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
using ll = long long;

int main() {
  cin.tie(0);
  ios::sync_with_stdio(false);

  // 入力
  // N : N個の部署
  // K : K個の異なる部署から1人ずつ選出し、1プロジェクトを作れる(1 <= K <= N <= 2*10^5)
  ll N, K;
  cin >> N >> K;

  // a_i：i番目の部署の人数
  vector<ll> a(N);
  for (ll i = 0; i < N; i++) {
    cin >> a[i];
  }

  // 計算
  // OK, NG : プロジェクトの最小個数と最大個数
  ll OK = 1;
  ll NG = 1e18;

  while (NG - OK > 1) {
    // mid : プロジェクトの個数
    ll mid = (OK + NG) / 2;

    // sum : mid個のプロジェクトを作ると仮定したときに、各部署から集められる人数
    ll sum = 0;
    for (int i = 0; i < N; i++) {
      sum += min(a[i], mid);
    }

    // sum / K : 作れるプロジェクトの個数
    if ((sum / K) >= mid) {
      OK = mid;
    } else {
      NG = mid;
    }
  }

  // 出力
  cout << OK << endl;
}
