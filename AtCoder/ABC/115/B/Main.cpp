#include<iostream>

using namespace std;

int main() {
  int n;
  cin >> n;

  int price[n];
  int maxPrice = 0;
  for (int i = 0; i < n; i++) {
    int p;
    cin >> p;

    price[i] = p;

    if (maxPrice < p) {
      maxPrice = p;
    }
  }

  int sumPrice = 0;
  bool isDicount = true;
  for (int i = 0; i < n; i++) {
    if (price[i] == maxPrice && isDicount) {
      sumPrice += (price[i] / 2);
      isDicount = false;
    }
    else {
      sumPrice += price[i];
    }
  }

  cout << sumPrice << endl;
}