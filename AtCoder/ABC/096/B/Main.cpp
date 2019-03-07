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

  int a[3];
  int k;
  for (int i = 0; i < 3; i++) {
    cin >> a[i];
  }
  cin >> k;

  sort(a, a + 3);

  int max = a[2];
  for (int i = 0; i < k; i++) {
    max *= 2;
  }

  cout << a[0] + a[1] + max << endl;
}