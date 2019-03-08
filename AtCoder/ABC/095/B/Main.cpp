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

  int N, X;
  cin >> N >> X;

  int min_powder = INT_MAX;
  int sum = 0;
  int ans = N;
  for (int i = 0; i < N; i++) {
    int p;
    cin >> p;
    sum += p;
    min_powder = min(min_powder, p);
  }

  cout << ans + (X - sum) / min_powder << endl;
}