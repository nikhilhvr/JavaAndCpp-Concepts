#include<iostream>
using namespace std;
int main(){

    int numOne =2;
    int numTwo =21;
  

    cout << "+= :-" << (numOne += numTwo) << endl;
    cout << "-= :-" << (numOne *= numTwo) << endl;
    cout << "/= :-" << (numOne /= numTwo) << endl;
    cout << "%= :-" << (numOne %= numTwo) << endl;
    cout << "&= :-" << (numOne &= numTwo) << endl;
    cout << "|= :-" << (numOne |= numTwo) << endl;
    cout << "^= :-" << (numOne ^= numTwo) << endl;
    cout << ">>= :-" << (numOne >>= numTwo) << endl;
    cout << "<<= :-" << (numOne <<= numTwo) << endl;


    


return 0;

}