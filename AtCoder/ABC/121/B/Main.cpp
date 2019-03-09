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

  int N, M, C;
  cin >> N >> M >> C;

  int b[M];
  for (int i = 0; i < M; i++) {
    cin >> b[i];
  }

  int ans = 0;
  for (int i = 0; i < N; i++) {
    int sum = 0;
    for (int j = 0; j < M; j++) {
      int a;
      cin >> a;

      sum += (a * b[j]);
    }

    if (sum + C > 0) {
      ans++;
    }
  }

  cout << ans << endl;
}