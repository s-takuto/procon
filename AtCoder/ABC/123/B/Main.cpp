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

  int a[5];
  int maxDiff = 0;
  int maxIndex = -1;
  for (int i = 0; i < 5; i++) {
    cin >> a[i];

    int q = (a[i] + (10 - 1)) / 10;
    int diff = 10 * q - a[i];
    if (diff > maxDiff) {
      maxDiff = diff;
      maxIndex = i;
    }
  }

  int time = 0;
  for (int i = 0; i < 5; i++) {
    int cur = 0;
    if (i != maxIndex && a[i] % 10 != 0) {
      time += (10 - (a[i] % 10));
    }
    time += a[i];
  }

  cout << time << endl;
}