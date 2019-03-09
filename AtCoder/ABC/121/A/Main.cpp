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

  int H, W, h, w;
  cin >> H >> W >> h >> w;

  cout << (H * W - (((h * W) + (w * H)) - (h * w))) << endl;
}