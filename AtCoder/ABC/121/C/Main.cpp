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

  int N, M;
  cin >> N >> M;

  vector< pair<long, long> > drinks;
  for (int i = 0; i < N; i++) {
    long a, b;
    cin >> a >> b;
    drinks.push_back(pair< long, long>(a, b));
  }

  sort(drinks.begin(), drinks.end());

  long ans = 0;
  int num = 0;
  for (int i = 0; i < N; i++) {
    long p = drinks[i].first;
    long n = drinks[i].second;

    if (M - num < n) {
      // 残りのぶん買う
      ans += (p * (M - num));
      num += (M - num);
      break;
    }
    else {
      // 全て買う
      ans += (p * n);
      num += n;
    }

    if (num == M) {
      break;
    }
  }

  cout << ans << endl;
}