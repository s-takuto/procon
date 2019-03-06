#include <iostream>
#include <algorithm>
#include <climits>
#include <vector>
#include <utility>
#include <functional>
#include <map>
#include <string>
#include <set>

using namespace std;

bool judge(int a, int b, int c, int d) {
  return (abs(c - a) <= d) || (abs(b - a) <= d && abs(c - b) <= d);
}

int main() {
  cin.tie(0);
  ios::sync_with_stdio(false);

  int a, b, c, d;
  cin >> a >> b >> c >> d;

  if (judge(a, b, c, d)) {
    cout << "Yes" << endl;
  }
  else {
    cout << "No" << endl;
  }
}