#include <iostream>
using namespace std;

int main() {
  for (int a = 0; a < 10; a++) {
    if (a == 4) {
       continue;
    }
    cout << a << endl;
    if(a==8){
      break;
    }
  } 
  return 0;
}

