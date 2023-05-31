#include <iostream>

using namespace std;

int calculateSum(int numOne, int numTwo) {
  int sum = numOne + numTwo;
  return sum;
}

int main() {
  int a, b;
  cin >> a >> b;
  int sum = calculateSum(a, b);
  cout << "sum :-" << sum << endl;
  return 0;
}
