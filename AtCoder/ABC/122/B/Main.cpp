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

bool isACGT(char s) {
  return (s == 'A' || s == 'G' || s == 'C' || s == 'T');
}

int main() {
  cin.tie(0);
  ios::sync_with_stdio(false);

  string str;
  cin >> str;

  int ans = 0;
  for (int i = 0; i < str.length(); i++) {
    char current = str[i];
    if (!isACGT(current)) {
      continue;
    }

    int count = 1;
    for (int j = i + 1; j < str.length(); j++) {
      char next = str[j];
      if (!isACGT(next)) {
        break;
      }
      count++;
    }

    ans = max(ans, count);
  }

  cout << ans << endl;
}