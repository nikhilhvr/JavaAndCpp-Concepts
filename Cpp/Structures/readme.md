# Structure
### A structure in C++ is a way to group together related data. For example, you could create a structure to represent a person, with fields for the person's name, age, and address.

#### Here is an example of how you would define a structure in C++:

```
struct Person {
  string name;
  int age;
  string address;
};
```

#### Once you have defined a structure, you can create variables of that type. For example:

```
 Person person1;
    person1.name = "John Wick";
    person1.age = 30;
    person1.address = "1443 Main Street";
```

#### You can then access the data in the structure using the dot notation. For example:

```
  cout << person1.name << endl;
    cout << person1.age << endl;
    cout << person1.address << endl;

```