#include <iostream>

using namespace std;

int main() {
  // Declare variables
  int a = 10; // 1010 in binary
  int b = 15; // 1111 in binary

  // Bitwise AND operator
  cout << "a & b = " << (a & b) << endl; // 10 in binary, or 2 in decimal

  // Bitwise OR operator
  cout << "a | b = " << (a | b) << endl; // 15 in binary, or 15 in decimal

  // Bitwise XOR operator
  cout << "a ^ b = " << (a ^ b) << endl; // 5 in binary, or 5 in decimal

  // Bitwise NOT operator
  cout << "~a = " << (~a) << endl; // 1101 in binary, or -11 in decimal

  // Bitwise left shift operator
  cout << "a << 1 = " << (a << 1) << endl; // 20 in binary, or 20 in decimal

  // Bitwise right shift operator
  cout << "a >> 1 = " << (a >> 1) << endl; // 5 in binary, or 5 in decimal

  return 0;
}
