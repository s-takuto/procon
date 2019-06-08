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

bool judge(int a, int b, int x) {
  if (a > x) {
    return false;
  }

  int catR = x - a;

  return catR <= b;
}

int main() {
  cin.tie(0);
  ios::sync_with_stdio(false);

  int a, b, x;
  cin >> a >> b >> x;

  if (judge(a, b, x)) {
    cout << "YES" << endl;
  }
  else {
    cout << "NO" << endl;
  }
}