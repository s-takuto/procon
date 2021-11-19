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

bool isABC(string s) {
  bool isA = false;
  bool isB = false;
  bool isC = false;

  for (int i = 0; i < s.size(); i++) {
    if (s[i] == 'a') {
      isA = true;
    }
    else if (s[i] == 'b') {
      isB = true;
    }
    else if (s[i] == 'c') {
      isC = true;
    }
  }

  return isA && isB && isC;
}

int main() {
  cin.tie(0);
  ios::sync_with_stdio(false);

  int n = 3;
  string s;
  cin >> s;

  if (isABC(s)) {
    cout << "Yes" << endl;
  }
  else {
    cout << "No" << endl;
  }
}