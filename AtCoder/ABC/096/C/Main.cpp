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

int dx[4] = {-1, 0, 1, 0};
int dy[4] = {0, 1, 0, -1};
int H, W;

int dfs(vector<string> c, int count, int i, int j, bool used[][]) {
  // すでに黒くしたあと
  if (used[i][j]) {
    return count;
  }

  used[i][j] = true;

  for (int k = 0; k < 4; k++) {
    int x = i + dx[i];
    int y = j + dy[i];

    // 端の処理
    if (x < 0 || x >= H || y < 0 || y >= W) {
      continue;
    }

    if (c[x][y] == '.') {
      continue;
    }

    return dfs(c, count + 1, x, y, used);
  }

  return 0;
}

int main() {
  cin.tie(0);
  ios::sync_with_stdio(false);

  cin >> H >> W;

  vector<string> c;
  for (int i = 0; i < H; i++) {
    string str;
    cin >> str;

    c.push_back(str);
  }

}