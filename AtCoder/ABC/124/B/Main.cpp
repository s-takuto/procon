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

  int n;
  cin >> n;

  int h[n];
  for (int i = 0; i < n; i++) {
    cin >> h[i];
  }

  int count = 0;
  for (int i = 0; i < n; i++) {
    bool isLook = true;
    for (int j = 0; j < i; j++) {
      if (h[j] > h[i]) {
        isLook = false;
        break;
      }
    }

    if (isLook) {
      count++;
    }
  }

  cout << count << endl;
}