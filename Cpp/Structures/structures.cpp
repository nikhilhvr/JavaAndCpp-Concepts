#include<iostream>
using namespace std;
int main(){

    struct Person {
      string name;
      int age;
      string address;
    };

    Person person1;
    person1.name = "John Wick";
    person1.age = 30;
    person1.address = "1443 Main Street";

    cout << person1.name << endl;
    cout << person1.age << endl;
    cout << person1.address << endl;



return 0;
}