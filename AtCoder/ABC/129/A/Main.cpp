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

  int time[3];
  for (int i = 0; i < 3; i++) {
    cin >> time[i];
  }

  int minT = time[0] + time[1];
  minT = min(minT, time[0] + time[2]);
  minT = min(minT, time[1] + time[2]);

  cout << minT << endl;
}