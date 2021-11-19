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

int h, w;

int count(vector<string> map, int i, int j) {
  int count = 0;

  // 上
  for (int x = i - 1; x >= 0; x--) {
    if (map[x][j] == '#') {
      break;
    }
    else {
      count++;
    }
  }

  // 下
  for (int x = i + 1; x < h; x++) {
    if (map[x][j] == '#') {
      break;
    }
    else {
      count++;
    }
  }

  // 左
  for (int y = j - 1; y >= 0; y--) {
    if (map[i][y] == '#') {
      break;
    }
    else {
      count++;
    }
  }

  // 右
  for (int y = j + 1; y < w; y++) {
    if (map[i][y] == '#') {
      break;
    }
    else {
      count++;
    }
  }

  return count + 1;
}

int main() {
  cin.tie(0);
  ios::sync_with_stdio(false);

  cin >> h >> w;

  vector<string> map;
  for (int i = 0; i < h; i++) {
    string s;
    cin >> s;
    map.push_back(s);
  }

  int maxCount = 0;
  for (int i = 0; i < h; i++) {
    for (int j = 0; j < w; j++) {
      if (map[i][j] != '#') {
        maxCount = max(maxCount, count(map, i, j));
      }
    }
  }

  cout << maxCount << endl;
}