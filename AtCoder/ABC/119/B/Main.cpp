#include <iostream>
#include <string>

using namespace std;

int main() {
  int n;
  cin >> n;

  double sum = 0;
  for (int i = 0; i < n; i++) {
    double money;
    string unit;
    cin >> money >> unit;

    if (unit != "JPY") {
      money *= 380000.0;
    }

    sum += money;
  }

  cout << sum << endl;

}