#include <iostream>
#include <sstream>
#include <istream>
#include <string>
#include <vector>

using namespace std;

bool judge(int year, int month, int date) {
  if (year > 2019) {
    return false;
  }

  if (month > 4) {
    return false;
  }

  return true;
}

int main() {
  string S;
  cin >> S;

  stringstream ss;
  ss << S;

  vector<string> str;
  string buf;
  while(getline(ss, buf, '/')) {
    str.push_back(buf);
  }

  int year = stoi(str[0]);
  int month = stoi(str[1]);
  int date = stoi(str[2]);

  if (judge(year, month, date)) {
    cout << "Heisei" << endl;
  }
  else {
    cout << "TBD" << endl;
  }
}