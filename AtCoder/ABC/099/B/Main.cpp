#include <iostream>

using namespace std;

int main() {
  int a, b;
  cin >> a >> b;

  int diff = b - a;
  int length = 0;
  for (int i = 1; i < diff; i++) {
    length += i;
  }

  cout << length - a << endl;
}