#include <iostream>

using namespace std;

int sum(int numOne, int numTwo) {
  return numOne + numTwo;
}

int sum(int numOne, int numTwo, int numThree) {
  return numOne + numTwo + numThree;
}

int main() {
  cout << "sumThree = " << sum(10, 10, 10) << endl;
  cout << "sumTwo = " << sum(10, 10) << endl;

  return 0;
}
