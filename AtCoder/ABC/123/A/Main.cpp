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

  int dist[5];
  for (int i = 0; i < 5; i++) {
    cin >> dist[i];
  }

  int k;
  cin >> k;

  bool isConnection = true;
  for (int i = 0; i < 5; i++) {
    for (int j = i + 1; j < 5; j++) {
      if ((dist[j] - dist[i]) > k) {
        isConnection = false;
        break;
      }
    }
  }

  if (isConnection) {
    cout << "Yay!" << endl;
  }
  else {
    cout << ":(" << endl;
  }
}