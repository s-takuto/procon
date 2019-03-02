#include <iostream>

using namespace std;

int main() {
  int n;
  cin >> n;

  int a[n];
  for (int i = 0; i < n; i++) {
    cin >> a[i];
  }

  int count = 0;
  for (int i = 0; i < n; i++) {
    int item = a[i];
    while (item % 2 == 0) {
      count++;
      item /= 2;
    }
  }

  cout << count << endl;
}