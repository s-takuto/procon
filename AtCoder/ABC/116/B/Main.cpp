#include<iostream>

using namespace std;

int main() {
  int s;
  cin >> s;

  if (s == 1 || s == 2) {
    cout << 4 << endl;
    return 0;
  }

  int n = 1000000;
  int seq[n];
  int x;
  bool isFirst = true;

  seq[0] = s;
  for (int i = 1; i < n; i++) {
    int item = seq[i - 1];
    // cout << item << endl;
    if (item == 4 && isFirst) {
      isFirst = false;
    }
    else if (item == 4 && !isFirst) {
      x = i - 1;
      break;
    }

    if (item % 2 == 0) {
      seq[i] = item / 2;
    }
    else {
      seq[i] = item * 3 + 1;
    }
  }

  cout << x + 1 << endl;
}