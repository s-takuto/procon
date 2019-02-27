#include <iostream>
#include <algorithm>

using namespace std;

int main() {
  int n;
  cin >> n;

  int a[n];
  for (int i = 0; i < n; i++) {
    cin >> a[i];
  }

  sort(a, a + n);

  int max = a[n - 1];
  int min = a[0];

  cout << abs(max - min) << endl;
}