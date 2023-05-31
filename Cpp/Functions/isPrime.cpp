#include <iostream>

using namespace std;

bool isPrime(int num) {
  if (num == 2) {
    return true;
  }

  bool isPrime = true;
  for (int i = 2; i <= num - 1; i++) {
    if (num % i == 0) {
      isPrime = false;
      break;
    }
  }

  return isPrime;
}

int main() {
  cout << "for num = 5 :-" << (isPrime(6)) << endl;
  cout << "for num = 2 :-" << (isPrime(2)) << endl;

  return 0;
}
